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
 * store�����ںͱ����ļ����ܵ����ݴ򽻵��ģ��漰�������ļ��е����ݵ���ɾ��
 * 
 * 
 * 
 */

public class Store<T> {
	/**
	 * ָ�������ļ���·��
	 * 
	 */
	
	private static final String DATA_PATH = "src/data.txt";
	/*
	 * ���뱾���ļ��е�������Ʒ����
	 * 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<T> queryAll(){
		ArrayList<T> products =null;
		try {
			// ����·������һ���ļ�����
			File file = new File(DATA_PATH);
			//�ж��ļ��Ƿ����
			if(!file.exists()){
				//�����ļ�
				return null;
			}
			//�����ļ���������
			FileInputStream fis = new FileInputStream(file);
			// �ж������Ƿ�������
			if(fis.available()!=0){
				//����ObjectInputStream
				ObjectInputStream ois = new ObjectInputStream(fis);
				products = (ArrayList<T>)ois.readObject();
				//����ȡ��ע��ر�
				ois.close();
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	/**
	 * ������Ʒ����Ϣ�������ļ���
	 * 
	 * @param product
	 */
	public void save(T product) {
		//��Ҫע�⣺������ѯ�������ڲ�ѯ�Ľ�����ٰ�product����֮���ٱ���
		ArrayList<T> products = queryAll();
		if (products == null || products.size()==0) {
			products = new ArrayList<T>();
		}
		//��product������ӵ�ԭ�е�������
		products.add(product);
		//��products���浽�����ļ���
		saveProductsToLocal(products);
	}

	/**
	 * 
	 * �������е�����ȫ�����浽���ص��ļ���
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
			// ����һ���ļ������
			FileOutputStream fos = new FileOutputStream(file);
			// ����һ���ļ�������õ�һ��ObjectOutputStream
			ObjectOutputStream bos = new ObjectOutputStream(out);
			// ͨ��ObjectOutputStream���󽫼��ϻ��ܵ�����д�뵽�����ļ���
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
	 * ͨ����Ʒ��IDɾ����Ʒ��Ϣ
	 * 
	 */
	
	private void deleteProductById(String id){
		//������е���Ʒ��Ϣ��¼ ArrayList<T>
		ArrayList<T> products = queryAll();
		//�������ϲ�����ƷIDΪָ��ֵ�Ķ���
		//����ע��Ϊ����д������Ϊ�̲߳���ȫ�������Ա߲��ұ�ɾ��
//		for(T product:produts){
//			if(product.getId().equals(id)){
//				produts.remove(product);
//			}
//		}
			//��ȷд��ʹ�õ�����
		if(products !=null && products.size()>0){
			// �������ײ��ArrayList�����˸���,�����൱����������Ͻ��в��������Ի��̰߳�ȫ
			Iterator<T> iterator = products.iterator();
			while(iterator.hasNext()){
				T product = iterator.next();
				if(id.equals(product.getid())){
					//ɾ������
					products.remove(product);
					break;
				}
				
			}
			//����������д�뱾��
			saveProductsToLocal(products);
		}
		
	}
	
	
	
	
}
