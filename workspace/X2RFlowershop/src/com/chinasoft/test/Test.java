package com.chinasoft.test;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.chinasoft.menu.MenuNew;
import com.chinasoft.po.Flower;
import com.chinasoft.po.Order;
import com.chinasoft.po.User;

public class Test {
	
//	public void initInfo(){
//		u.add(new User("��ٻ", "15666666666"));
//		u.add(new User("С��", "15511111111"));
//		u.add(new User("С��", "15311111111"));
//		u.add(new User("С��", "15111111111"));
//		u.add(new User("С��", "15211111111"));
//		admin = new Admin("��˧", "15888888888");
//		admin.getFlowers().add(new Flower(1, "������", 500, 33.3));
//		admin.getFlowers().add(new Flower(2, "����ܰ", 500, 66.6));
//		admin.getFlowers().add(new Flower(5, "�ٺ�", 666, 68.8));
//		admin.getFlowers().add(new Flower(3, "������", 600, 88.8));
//		admin.getFlowers().add(new Flower(4, "õ�廨", 999, 99.9));
//		
//	}
//	public void hashSetTest(){
//		Order o1 = new Order("11", "��ַ1", new  ArrayList<Flower>());
//		Order o2 = new Order("22", "��ַ2", new  ArrayList<Flower>());
//		Order o3 = new Order("33", "��ַ3", new  ArrayList<Flower>());
//		HashSet<Order> aa = new HashSet<Order>();
//		aa.add(o1);
//		aa.add(o2);
//		aa.add(o3);
//		
//		Iterator<Order> iterator = aa.iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}
//		System.out.println("********************");
//		Order o4 = new Order("11", "��ַ4", new  ArrayList<Flower>());
//		aa.add(o4);
//		Iterator<Order> iterator1 = aa.iterator();
//		while(iterator1.hasNext()){
//			System.out.println(iterator1.next());
//		}
//	}
	
	
	public static void main(String[] args) {
		MenuNew m = new MenuNew();
		m.start();
	}
}
