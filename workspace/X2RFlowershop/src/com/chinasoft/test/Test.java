package com.chinasoft.test;

import com.chinasoft.po.Person;

public class Test {
	public static void main(String[] args) {
		String a = "aaa_bbb";
		String [] ary = a.split("_");
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		Person aaa  =new Person(ary[0], ary[1]);
		Person aaab  =new Person() {
		};
		
		
	}
}
