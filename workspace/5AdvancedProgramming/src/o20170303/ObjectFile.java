package o20170303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * 
 * 
 * 只能将支持 java.io.Serializable 接口的对象写入流中
 * 
 * @author liushuai
 *
 */


public class  ObjectFile<T> implements Serializable{
	private final String DATA_PATH;
	
	public ObjectFile() {
		DATA_PATH = "src/data.txt";
	}
	
	public ObjectFile(String fileString) {
		DATA_PATH = fileString;
	}
	
//	在其他中已经做了
//	public void createObjFile(){
//		
//		
//	}

	public ArrayList<T> queryData(){
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
	
	public void addData(T product){
		ArrayList<T> products = queryData();
		if (products == null || products.size()==0) {
			products = new ArrayList<T>();
		}
		//将product对象添加到原有的数据中
		products.add(product);
		//把products保存到本地文件中
		writerFile(products);
	}
	
	public void deleteData(int id) {
		//查出所有的商品信息记录 ArrayList<T>
		ArrayList<T> products = queryData();
		//遍历集合查找商品ID为指定值的对象
		//正确写法使用迭代器
		if(products !=null && products.size()>0){
			// 迭代器底层对ArrayList进行了复制,所以相当与对两个集合进行操作，所以会线程安全
			Iterator<T> iterator = products.iterator();
			int i = products.size();
			while(iterator.hasNext()){
				T product = iterator.next();
				if(id == (products.size()-i--)){
					//删除对象
					products.remove(product);
					break;
				}
				
			}
			//将集合重新写入本地
			writerFile(products);
		}
	}
	
	public void updateData(int id, T newProduct) {
		//查出所有的商品信息记录 ArrayList<T>
		ArrayList<T> products = queryData();
		//遍历集合查找商品ID为指定值的对象
		//正确写法使用迭代器
		if(products !=null && products.size()>0){
			//更新对象
			products.set(id,newProduct);
			//将集合重新写入本地
			writerFile(products);
		}
	}
	
	public void writerFile(ArrayList<T> products){
		try {
			File file = new File(DATA_PATH);
			if(!file.exists()){
				file.createNewFile();
			}
			// 创建一个文件输出流
			FileOutputStream fos = new FileOutputStream(file);
			// 关联一个文件输出流得到一个ObjectOutputStream
			ObjectOutputStream bos = new ObjectOutputStream(fos);
			// 通过ObjectOutputStream对象将集合汇总的数据写入到本地文件中
			bos.writeObject(products);
			bos.flush();
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
