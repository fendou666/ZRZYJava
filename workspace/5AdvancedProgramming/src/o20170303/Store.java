package o20170303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * store类用于和本地文件汇总的数据打交道的，涉及到本地文件中的数据的增删查
 * 
 * 
 * 
 */

public class Store<T> {
	/**
	 * 指定本地文件的路径
	 * 
	 */
	
	private static final String DATA_PATH = "src/data.txt";
	/*
	 * 插入本地文件中的所有商品数据
	 * 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<T> queryAll(){
		ArrayList<T> products =null;
		try {
			// 根据路径创建一个文件对象
			File file = new File(DATA_PATH);
			//判断文件是否存在
			if(!file.exists()){
				//创建文件
				return null;
			}
			//构建文件的输入流
			FileInputStream fis = new FileInputStream(file);
			// 判断流中是否有数据
			if(fis.available()!=0){
				//构建ObjectInputStream
				ObjectInputStream ois = new ObjectInputStream(fis);
				products = (ArrayList<T>)ois.readObject();
				//流读取完注意关闭
				ois.close();
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	/**
	 * 保存商品的信息到本地文件中
	 * 
	 * @param product
	 */
	public void save(T product) {
		//需要注意：先做查询操作，在查询的结果上再把product加上之后再保存
		ArrayList<T> products = queryAll();
		if (products == null || products.size()==0) {
			products = new ArrayList<T>();
		}
		//将product对象添加到原有的数据中
		products.add(product);
		//把products保存到本地文件中
		saveProductsToLocal(products);
	}

	/**
	 * 
	 * 将集合中的数据全部保存到本地的文件中
	 * 
	 * @param products
	 */

	private void saveProductsToLocal(ArrayList<T> products) {
		// TODO Auto-generated method stub
		try {
			File file = new File(DATA_PATH);
			if(!file.exists()){
				file.createNewFile();
			}
			// 创建一个文件输出流
			FileOutputStream fos = new FileOutputStream(file);
			// 关联一个文件输出流得到一个ObjectOutputStream
			ObjectOutputStream bos = new ObjectOutputStream(out);
			// 通过ObjectOutputStream对象将集合汇总的数据写入到本地文件中
			bos.writeObject(products);
			bos.flush();
			bos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/**
	 * 
	 * 通过商品的ID删除商品信息
	 * 
	 */
	
	private void deleteProductById(String id){
		//查出所有的商品信息记录 ArrayList<T>
		ArrayList<T> products = queryAll();
		//遍历集合查找商品ID为指定值的对象
		//下面注释为错误写法，因为线程不安全，不可以边查找边删除
//		for(T product:produts){
//			if(product.getId().equals(id)){
//				produts.remove(product);
//			}
//		}
			//正确写法使用迭代器
		if(products !=null && products.size()>0){
			// 迭代器底层对ArrayList进行了复制,所以相当与对两个集合进行操作，所以会线程安全
			Iterator<T> iterator = products.iterator();
			while(iterator.hasNext()){
				T product = iterator.next();
				if(id.equals(product.getid())){
					//删除对象
					products.remove(product);
					break;
				}
				
			}
			//将集合重新写入本地
			saveProductsToLocal(products);
		}
		
	}
	
	
	
	
}
