package com.chinasoft.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import com.chinasoft.po.ArrayListStore;
import com.chinasoft.po.Flower;
import com.chinasoft.po.HashMapStore;
import com.chinasoft.po.HashSetStore;
import com.chinasoft.po.Order;
import com.chinasoft.po.User;

public class Init {
	
	
	
	public static void main(String[] args) {
//		����ǻ��Ŀ��
		ArrayList<Flower> flowerLib = new ArrayList<Flower>();
//		��������е��û�
		HashSet<User> userAll = new HashSet<User>();;
		
		ArrayListStore<Flower> flowerFileO = new ArrayListStore<Flower>("src/Flower.txt");
		HashSetStore<User> userFileO = new HashSetStore<User>("src/User.txt");
		flowerLib.add(new Flower(1, "������", 500, 33.3));
		flowerLib.add(new Flower(2, "����ܰ", 500, 66.6));
		flowerLib.add(new Flower(5, "�ٺ�", 666, 68.8));
		flowerLib.add(new Flower(3, "������", 600, 88.8));
		flowerLib.add(new Flower(4, "õ�廨", 999, 99.9));
		
		userAll.add(new User("����Ա", "123456", "13688888888", "����Ա"));
//		����д���ļ�
		flowerFileO.writerFile(flowerLib);
//		����Աд��
		userFileO.writerFile(userAll);
		
		
		

		
//		orders.add(new Order("or0000001", "��������������", new ArrayList<Flower>() {
//			
//														    add(new Flower(1, "������", 10, 333));
//														    add(new Flower(4, "õ�廨", 10, 999));
//														}));
														
		
	}
}
