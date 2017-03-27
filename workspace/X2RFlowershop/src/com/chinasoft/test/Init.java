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
//		这个是花的库存
		ArrayList<Flower> flowerLib = new ArrayList<Flower>();
//		这个是所有的用户
		HashSet<User> userAll = new HashSet<User>();;
		
		ArrayListStore<Flower> flowerFileO = new ArrayListStore<Flower>("src/Flower.txt");
		HashSetStore<User> userFileO = new HashSetStore<User>("src/User.txt");
		flowerLib.add(new Flower(1, "郁金香", 500, 33.3));
		flowerLib.add(new Flower(2, "康乃馨", 500, 66.6));
		flowerLib.add(new Flower(5, "百合", 666, 68.8));
		flowerLib.add(new Flower(3, "马蹄莲", 600, 88.8));
		flowerLib.add(new Flower(4, "玫瑰花", 999, 99.9));
		
		userAll.add(new User("管理员", "123456", "13688888888", "管理员"));
//		花库写入文件
		flowerFileO.writerFile(flowerLib);
//		管理员写入
		userFileO.writerFile(userAll);
		
		
		

		
//		orders.add(new Order("or0000001", "陕西西安莲湖区", new ArrayList<Flower>() {
//			
//														    add(new Flower(1, "郁金香", 10, 333));
//														    add(new Flower(4, "玫瑰花", 10, 999));
//														}));
														
		
	}
}
