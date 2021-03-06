package com.chinasoft.manage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import com.chinasoft.po.ArrayListStore;
import com.chinasoft.po.Flower;
import com.chinasoft.po.HashMapStore;
import com.chinasoft.po.HashSetStore;
import com.chinasoft.po.Order;
import com.chinasoft.po.User;



public class AdminManage {
//	这个是花的库存
	private ArrayList<Flower> flowerLib;
//	这个是所有的用户
	private HashSet<User> userAll;
//	此用来看每个用户的订单
	private HashMap<User, ArrayList<Order>> userInfo;
//	未发货订单
	private ArrayList<Order> adminOrder;
	
	
	
//	TODO 对于用户和花库不要再次创建文件
	{
//		初始化用户
		HashSetStore<User> userFileO = new HashSetStore<User>("src/User.txt");
		userAll = userFileO.queryData();
		if (userAll == null){
			userAll = new HashSet<User>();
		}
//		初始化花库存
		ArrayListStore<Flower> flowerFileO = new ArrayListStore<Flower>("src/Flower.txt");
		flowerLib = flowerFileO.queryData();
		if (flowerLib == null){
			flowerLib = new ArrayList<Flower>();
		}
//		初始化用户订单
//		文件标识符
		HashMapStore<User, ArrayList<Order>> userInfoFileO = new HashMapStore<User,ArrayList<Order>>("src/UserInfo.txt");
//		读取文件数据
		userInfo = userInfoFileO.queryData();
		if (userInfo == null){
			userInfo = new HashMap<User, ArrayList<Order>>();
		}
//		初始化未发货订单
		ArrayListStore<Order> adminOrderFileO = new ArrayListStore<Order>("src/AdminOrderInfo.txt");
		adminOrder = adminOrderFileO.queryData();
		if (adminOrder == null){
			adminOrder = new ArrayList<Order>();
		}
		
	}

	public AdminManage() {
	
	}
	
//	用户管理
//	用户注册 存在BUG 如果用户已经注册居然还可以注册，TODO
	public User userAdd(String name, String pwd, String telephone){
		User u = new User(name, pwd, telephone, "user");
		userAll.add(u);
		userInfo.put(u , u.getOrderList());
		return u;
	}
//	用户登录验证
	public User userVerify(User u){
		int length = userAll.size();
		User partU = null;
		userAll.add(u);
		if (userAll.size()==length) {
			Iterator<User> iterator = userAll.iterator();
			while(iterator.hasNext()){
				partU = iterator.next();
				if(partU.equals(u)){
					return partU;
				}
			}
			System.out.println("user.equals方法有问题了");
			return partU;
		} else{
			return null;
		}
		
	}
//	用户更改信息等等暂时不做
	public void changeUserInfo(){

	}
	
//	花库存管理
//	增加库存
	public void addFlower(Flower f){
		flowerLib.add(f);
	}
//	删除库存
	public void delFlower(Flower f){
		Iterator<Flower> iterator = flowerLib.iterator();
		while(iterator.hasNext()){
			if(iterator.next().equals(f)){
				flowerLib.remove(f);
			}
		}
	}
//	更改库存
	public void changeFlower(Flower f){
		delFlower(f);
		flowerLib.add(f);
	}
//	查找库存
	public void showFlower(){
		Iterator<Flower> iterator = flowerLib.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	public Flower getFlower(int number, int count){
		Iterator<Flower> iterator = flowerLib.iterator();
		Flower partFlower = null;
		while(iterator.hasNext()){
			partFlower = iterator.next();
			if(partFlower.getNumber() == number){
				partFlower.setCount(count);
				return partFlower;
			}
		}
		return partFlower;
	}
	
	
	
	
//	订单管理
//	订单仅限未发货
	public void getNoShipments(){
		Iterator<Order> iterator = adminOrder.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
//	查找发货状态，不需要
//	public void getShipments(){
//		Iterator<Order> iterator = adminOrder.get("Shipments").iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}
//	}
//	订单更新（订单更新，对需要更新的订单进行更改）
//	将未发货设置发货
	public void changeOrderToShipments(String orderNum, UserManage uM){
		Iterator<Order> iterator = adminOrder.iterator();
		Order partOrder = null;
		while(iterator.hasNext()){
			partOrder = iterator.next();
			if(partOrder.getOrderNum().equals(orderNum)){
				partOrder.setStatus("已发货");
				adminOrder.remove(partOrder);
			}
		}
//		用户那边分类订单的修改
		ArrayList<Order> uOrder = uM.getOrderSorter().get("NoShipments");
		Iterator<Order> iteratorU = uOrder.iterator();
		partOrder = null;
		while(iteratorU.hasNext()){
			partOrder = iteratorU.next();
			if(partOrder.getOrderNum().equals(orderNum)){
				partOrder.setStatus("已发货");
				uOrder.remove(partOrder);
				uM.getOrderSorter().get("Shipments").add(partOrder);
			}
		}
	}
//	订单关闭 ---无用不做	
//  订单增加(用户调用，用户创建订单后调用)
	public void addAdminOrder(Order od){
		adminOrder.add(od);
	}

}
