package basic_20170216practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class In3Array {
	public static void main(String[] args) {
		// ����
		int a [];
		int [] b;
		// ����3��
		int [] c = new int[10];
		int [] d = new int[]{1,3,5,2,623,1,3,34};
		int [] e = {3,4,5,6,6,7,3,2};
		// ����
		// ��ͨfor
//		for (int i=0; i<c.length; i++){
//			System.out.print(",c[" + i + "] = " + c[i]);
//		}
		// ��ǿfor int x ��ʾ��e�����е�ֵ��ֵ��x                                                                                                        
		for (int x : e) {
			System.out.print(", "+x);
		}
		
		
		// other Datatype
		char [] chaAry = new char[]{'1','1','d'};
		char [] chaAry1 = {'3','1','d'};
		char [] chaAry2 = {};
		char [] chaAry3 = new char[0];
		char [] chaAry4;
		char [] chaAry5 = {};
		System.out.println(Arrays.toString(chaAry)); 
		System.out.println(Arrays.toString(chaAry1));  
		System.out.println(Arrays.toString(chaAry2));
		System.out.println(Arrays.toString(chaAry3));
		//����
//		System.out.println(chaAry4); 
		// ����֪��chaAry5(��chaAry3��ͬ)ָ����һ�����еĿռ��ַ��ֻ��������ռ���0
//		if (chaAry5 == null) {
//			System.out.println("aaa")
//		}
//		System.out.println(Arrays.toString(chaAry));  
		
	}
}
