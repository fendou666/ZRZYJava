package com.chinasoft.po;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

/**
 * 
 * ֻ�ܽ�֧�� java.io.Serializable �ӿڵĶ���д������
 * 
 * @author liushuai
 *
 */

public class  HashSetStore<T> implements Serializable{
	private final String DATA_PATH;
	
	public HashSetStore() {
		DATA_PATH = "src/HashSetData.txt";
	}
	
	public HashSetStore(String fileString) {
		DATA_PATH = fileString;
	}
	

	@SuppressWarnings("unchecked")
	public HashSet<T> queryData(){
		HashSet<T> products =null;
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
				products = (HashSet<T>)ois.readObject();
				//����ȡ��ע��ر�
				ois.close();
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void writerFile(HashSet<T> products){
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