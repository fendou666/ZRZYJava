package com.chinasoft.po;

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
				products = (HashMap<K,V>)ois.readObject();
				//流读取完注意关闭
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
