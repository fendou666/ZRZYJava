package com.orcle.J20170330;

import java.util.List;

public class In1Test {
	public static void main(String[] args) throws Exception {
		In1StudentDao sd = new In1StudentDao();

		
//		更新数据
//		插入数据
//		In1Student s = new In1Student(22,"小军", "男", "6年五班");
//		int count = sd.insterStudent(s);
//		if(count<0){
//			System.out.println("插入数据失败");
//		}else{
//			System.out.println(count);
//			System.out.println("插入数据成功");
//		}
//		更新数据
//		In1Student s = new In1Student(22,"令狐冲", "男", "华山二班");
//		int count = sd.updateStudent(s);
//		if(count<0){
//			System.out.println("更新数据失败");
//		}else{
//			System.out.println(count);
//			System.out.println("更新数据成功");
//		}
//		删除数据
//		In1Student s = new In1Student(22,"小军", "男", "6年五班");
//		int count = sd.deleteStudent(s);
//		if(count<0){
//			System.out.println("删除数据失败");
//		}else{
//			System.out.println(count);
//			System.out.println("删除数据成功");
//		}
		
		
//		查询数据
		List<In1Student> stuAry = sd.selectStudent();
		for(In1Student stu: stuAry){
			System.out.println(stu);
		}
		if(sd == null){
			System.out.println("查询失败");
		}else{
			System.out.println("查询成功");
		}
		
		
	}
}
