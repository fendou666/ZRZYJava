package com.chinasoft.menu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import com.chinasoft.po.Admin;
import com.chinasoft.po.Flower;
import com.chinasoft.po.User;
import com.chinasoft.po.User;

public class Menu {
	public HashSet<User> u;
	public Admin admin;
	private Scanner input = new Scanner(System.in);
	
	public int uiGetUserType(){
		int inputValue = -1;
		do {
			System.out.println("1:选择普通用户\n 2：管理员\n"
					+ "请输入");
			inputValue = input.nextInt();
		}while(inputValue!=1||inputValue!=2);
		return inputValue;
	}
	
	public int uiUserOperationLogin(){
		int inputValue = -1;
		do {
			System.out.println("1:直接购买（临时用户）\n 2：会员登入购买\n"
					+ "请输入");
			inputValue = input.nextInt();
		}while(inputValue!=1||inputValue!=2);
		return inputValue;
	}
	public int uiMemberOperationMain(){
		int inputValue = -1;
		do {
			System.out.println("1:购买花朵 \n 2：购买记录\n"
					+ "请输入");
			inputValue = input.nextInt();
		}while(inputValue!=1||inputValue!=2);
		return inputValue;
	}
	public User uiUserLogin(int userType){
		System.out.println("请以这种格式：用户名_密码\n方式输入用户名密码");
		String st = input.next();
		String [] stAry = st.split("_");
		if(userType == 1){
			return (new User(stAry[0], stAry[1]));
		}
		return (new Admin(stAry[0], stAry[1]));
	}
	
	public void userOperationMain(){
		int userType = uiUserOperationLogin();
		if (userType==2){
			
		}else {
			//new一个用户，只需要提供收货姓名，电话，地址
		}
		//显示花朵
		//购买花朵
	}
	
	public void admin(){
		
	}
	
	
	public int adminOperation(){
		
	}
	
	public void start() {
		
		
		
	}
}
