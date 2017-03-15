package com.liushuai.netbar.manager;

public class Positions {
	
	private Member [] members = new Member[100];
	//
	public Positions(){
		System.out.println("不支持这种调用方式");
	}
	// 状态设置无人状态？？？
	public Positions(String [][] area){
		for (int i=0; i<members.length; i++) {
			// (位置对象中)area代表区域， id代表电脑机号
			if (i< Integer.parseInt(area[0][1])) {
				members[i] = new Member(area[0][0], i+1, "无人");
			} else if (i<Integer.parseInt(area[1][1])) {
				members[i] = new Member(area[1][0], i+1, "无人");
			} else {
				members[i] = new Member(area[2][0], i+1, "无人");
			}
		}
	}
	
	public Member[] getPositions() {
		return members;
	}
	 
}
