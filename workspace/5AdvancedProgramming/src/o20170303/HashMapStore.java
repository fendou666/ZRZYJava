package o20170303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapStore<K,V> {
	private final String DATA_PATH;
	
	public HashMapStore() {
		DATA_PATH = "src/HashMapData.txt";
	}
	
	public HashMapStore(String fileString) {
		DATA_PATH = fileString;
	}
	

	@SuppressWarnings("unchecked")
	public HashMap<K,V> queryData(){
		HashMap<K,V> products =null;
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
				products = (HashMap<K,V>)ois.readObject();
				//����ȡ��ע��ر�
				ois.close();
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void writerFile(HashMap<K,V> products){
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