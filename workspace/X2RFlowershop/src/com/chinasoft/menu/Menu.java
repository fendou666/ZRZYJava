package com.chinasoft.menu;

import java.util.ArrayList;
import java.util.HashSet;

import com.chinasoft.po.Admin;
import com.chinasoft.po.Flower;
import com.chinasoft.po.User;

public class Menu {
	public HashSet<User> u;
	public Admin admin;
	
	public void initInfo(){
		u.add(new User("��ٻ", "15666666666"));
		u.add(new User("С��", "15511111111"));
		u.add(new User("С��", "15311111111"));
		u.add(new User("С��", "15111111111"));
		u.add(new User("С��", "15211111111"));
		admin = new Admin("��˧", "15888888888");
		admin.getFlowers().add(new Flower(1, "������", 500, 33.3));
		admin.getFlowers().add(new Flower(2, "����ܰ", 500, 66.6));
		admin.getFlowers().add(new Flower(5, "�ٺ�", 666, 68.8));
		admin.getFlowers().add(new Flower(3, "������", 600, 88.8));
		admin.getFlowers().add(new Flower(4, "õ�廨", 999, 99.9));
		
		
	}
	
	public void start() {
		
		
		
	}
}