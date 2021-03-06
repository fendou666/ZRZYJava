package com.chinasoft.manage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.chinasoft.po.Order;
import com.chinasoft.po.User;

public class UserManage {
	private User u;
//	根据状态将所有订单分类(创建状态，发货状态，已签收)
	private HashMap<String, ArrayList<Order>> orderSorter;
//	构造函数，即用户初始化，初始化用户的信息以及用户的订单
	
	public UserManage(){
		System.out.println("不可调用");
	}

	public UserManage(User u) {
		this.u = u;
		orderSort();
	}
	
	
	
	public User getU() {
		return u;
	}

	public void orderSort(){
		orderSorter = new HashMap<String, ArrayList<Order>>();
//		未发货
		orderSorter.put("NoShipments", new ArrayList<Order>());
//		已发货
		orderSorter.put("Shipments", new ArrayList<Order>());
//		没有订单
		if(u.getOrderList().size()==0){
			return;
		}
		Iterator<Order> iterator = u.getOrderList().iterator();
		Order partOd;
		while(iterator.hasNext()){
			partOd = iterator.next();
			if(partOd.getStatus().equals("未发货")){
				orderSorter.get("NoShipments").add(partOd);
			}else if(partOd.getStatus().equals("已发货")){
				orderSorter.get("Shipments").add(partOd);
			}
		}
	}
	
	
	
	
	public HashMap<String, ArrayList<Order>> getOrderSorter() {
		return orderSorter;
	}

	//	订单管理
//	1.订单创建，然后调用管理的未发货订单增加方法
	public void addOrder(Order od, AdminManage admin){
		u.getOrderList().add(od);
		orderSorter.get("NoShipments").add(od);
		admin.addAdminOrder(od);
	}
//	2.订单查找，管理员对于订单发货处理后，订单状态查找, 查找所有订单, 未发货，已发货订单
	public void lookOrder(){
		Iterator<Order> iteratorU = u.getOrderList().iterator();
		while(iteratorU.hasNext()){
			System.out.println(iteratorU.next());
		}
	}
	public void getNoShipments(){
		ArrayList<Order> uOrder = orderSorter.get("NoShipments");
		Iterator<Order> iteratorU = uOrder.iterator();
		while(iteratorU.hasNext()){
			System.out.println(iteratorU.next());
		}
	}
	public void getShipments(){
		ArrayList<Order> uOrder = orderSorter.get("Shipments");
		Iterator<Order> iteratorU = uOrder.iterator();
		while(iteratorU.hasNext()){
			System.out.println(iteratorU.next());
		}
	}
//	3.订单更新，分类中的订单进行更改状态,因为共享同一对象一个更新，全部订单中也更新了
	public void OrderSignFor(String orderNum){
		ArrayList<Order> uOrder = orderSorter.get("Shipments");
		Iterator<Order> iteratorU = uOrder.iterator();
		Order partOrder = null;
		while(iteratorU.hasNext()){
			partOrder = iteratorU.next();
			if(partOrder.getOrderNum().equals(orderNum)){
				partOrder.setStatus("已签收");
				uOrder.remove(partOrder);
			}
		}
		
	}
	
}
