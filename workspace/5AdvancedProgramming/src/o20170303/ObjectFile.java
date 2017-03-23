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
 * ֻ�ܽ�֧�� java.io.Serializable �ӿڵĶ���д������
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
	
//	���������Ѿ�����
//	public void createObjFile(){
//		
//		
//	}

	public ArrayList<T> queryData(){
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
	
	public void addData(T product){
		ArrayList<T> products = queryData();
		if (products == null || products.size()==0) {
			products = new ArrayList<T>();
		}
		//��product�������ӵ�ԭ�е�������
		products.add(product);
		//��products���浽�����ļ���
		writerFile(products);
	}
	
	public void deleteData(int id) {
		//������е���Ʒ��Ϣ��¼ ArrayList<T>
		ArrayList<T> products = queryData();
		//�������ϲ�����ƷIDΪָ��ֵ�Ķ���
		//��ȷд��ʹ�õ�����
		if(products !=null && products.size()>0){
			// �������ײ��ArrayList�����˸���,�����൱����������Ͻ��в��������Ի��̰߳�ȫ
			Iterator<T> iterator = products.iterator();
			int i = products.size();
			while(iterator.hasNext()){
				T product = iterator.next();
				if(id == (products.size()-i--)){
					//ɾ������
					products.remove(product);
					break;
				}
				
			}
			//����������д�뱾��
			writerFile(products);
		}
	}
	
	public void updateData(int id, T newProduct) {
		//������е���Ʒ��Ϣ��¼ ArrayList<T>
		ArrayList<T> products = queryData();
		//�������ϲ�����ƷIDΪָ��ֵ�Ķ���
		//��ȷд��ʹ�õ�����
		if(products !=null && products.size()>0){
			//���¶���
			products.set(id,newProduct);
			//����������д�뱾��
			writerFile(products);
		}
	}
	
	public void writerFile(ArrayList<T> products){
		try {
			File file = new File(DATA_PATH);
			if(!file.exists()){
				file.createNewFile();
			}
			// ����һ���ļ������
			FileOutputStream fos = new FileOutputStream(file);
			// ����һ���ļ�������õ�һ��ObjectOutputStream
			ObjectOutputStream bos = new ObjectOutputStream(fos);
			// ͨ��ObjectOutputStream���󽫼��ϻ��ܵ�����д�뵽�����ļ���
			bos.writeObject(products);
			bos.flush();
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}