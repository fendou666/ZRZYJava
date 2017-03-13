package com.chinasoft.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.chinasoft.po.Flower;
import com.chinasoft.po.Order;

public class Init {
	
	
	
	public static void main(String[] args) {
		ArrayList<Flower> flowers = new ArrayList<Flower>();
		ArrayList<Order> orders = new ArrayList<Order>();
		File flowersF = new File("src/flowers");
		File ordersF = new File("src/orders");
		
		
		if (!flowersF.exists()) {
			try {
				flowersF.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (!ordersF.exists()) {
			try {
				flowersF.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		flowers.add(new Flower(1, "������", 500, 33.3));
		flowers.add(new Flower(2, "����ܰ", 500, 66.6));
		flowers.add(new Flower(5, "�ٺ�", 666, 68.8));
		flowers.add(new Flower(3, "������", 600, 88.8));
		flowers.add(new Flower(4, "õ�廨", 999, 99.9));
		
		orders.add(new Order("or0000001", "��������������", new ArrayList<Flower>() {
			
														    add(new Flower(1, "������", 10, 333));
														    add(new Flower(4, "õ�廨", 10, 999));
														}));
														
		
	}
}
