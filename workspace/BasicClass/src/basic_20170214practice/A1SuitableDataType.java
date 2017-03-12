package basic_20170214practice;

import java.math.BigInteger;

public class A1SuitableDataType {
	
	public  String anyBase(String bigData, int radix) {
		return (new BigInteger(bigData).toString(radix));
	}
	
	public String getDataType(long input){
		long byteMax = (long)(Math.pow(2, 7) - 1);
		long shortMax = (long)(Math.pow(2, 15) - 1);
		long intMax = (long)(Math.pow(2, 31) - 1);
		long longMax = (long)(Math.pow(2, 63) - 1);
		if (input <= byteMax) {
			return "byte";
		} else if (input <= shortMax) {
			return "short";
		} else if (input <= intMax) {
			return "int";
		} else if  ( input <= longMax) {
			return "long";
		} else {
			return "other data type";
		}
	}
	
	public static void main(String[] args) {
		
//		String chinaToutlePeople = anyBase("1370536878", 2);
//		System.out.println("������Ϊ" + chinaToutlePeople 
//				+ "������" + chinaToutlePeople.length());
//		System.out.println("int ���ֵΪ" + (byte)(Math.pow(2, 7) - 1));
//		System.out.println("int ���ֵΪ" + (short)(Math.pow(2, 15) - 1));
//		System.out.println("int ���ֵΪ" + (int)(Math.pow(2, 31) - 1));
		
	}
	
}
