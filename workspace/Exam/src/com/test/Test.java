package com.test;

public class Test {
	String str = new String("Hi !");   
	char[] ch = { 'L', 'i', 'k', 'e' }; 
	
	public void change(String str, char ch[]) {
		str = "How are you";   
		ch[1] = 'u';    
	}  
	
	public void change1(String s,StringBuffer s1,StringBuffer s2){
		s=s+"1";
		s1.append("1");
		s2=new StringBuffer("c1");

	}
	public static void main(String[] args) {
			 
			Test ex = new Test();    
			ex.change(ex.str, ex.ch);     
			System.out.print(ex.str + " ");    
			System.out.print(ex.ch);      
			
			String a = "adfadf";
			String b = a;
			b = "adfadf";
			StringBuffer zz = new StringBuffer("asdfasdf");
			StringBuffer cc = zz;
			cc = new StringBuffer("zxcvzxcv");
			System.out.println(zz);
			
			StringBuffer xx = new StringBuffer("asdfasdf");
			StringBuffer yy = xx;
			xx = new StringBuffer("zxcvzxcv");
			System.out.println(yy);
			
			
			String aa = "aaaaa";
			String bb = aa;
			aa = "aaaaaaaaaaaaaaaaaaaaa";
			System.out.println(bb);
			
			String p="A";
			StringBuffer q=new StringBuffer("B");
			StringBuffer s=new StringBuffer("c");
			ex.change1(p,q,s);
			System.out.println(p+","+q+","+s);
			
			String testA = new String("testa");
			String testB = testA;
//			testB = 
			
			A1People peo = new A1People();
			A1People peo1 =  new A1People();
			
			if(peo.equals(peo1)){
				System.out.println("值相等");
			}
			peo1 = peo;
			if(peo.equals(peo1)){
				System.out.println("引用相等");
			}
			System.out.println(peo);
//			Integer.toHexString(hashCode())
			System.out.println(Integer.toHexString(peo.hashCode()));
			System.out.println(peo1);
			
			
			
			

	}
}
