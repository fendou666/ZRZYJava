package basic_20170215pracice;

public class In1StringBufferAndStringBuilder {

	public static void main(String[] args){
		StringBuffer sbf1 = new StringBuffer("aaa");
		System.out.println(sbf1);
		
		System.out.println(sbf1.append("bbb"));
		System.out.println(sbf1);
		System.out.println(sbf1.toString());
		System.out.println(sbf1.length());
		System.out.println(sbf1.deleteCharAt(2));
		System.out.println(sbf1);
		System.out.println(sbf1.delete(2, 4));
		System.out.println(sbf1);
		System.out.println(sbf1.reverse());
		System.out.println(sbf1);
		// ����replace ����� start, end��ô��д
		System.out.println(sbf1.replace(0, 2, "asdfas"));
		System.out.println(sbf1);
		sbf1.setCharAt(5, '3');
		System.out.println(sbf1);
//		System.out.println(sbf1.deleteCharAt(2));
//		System.out.println(sbf1);
//		System.out.println(sbf1.delete(2, 4));
		
		StringBuilder sbd1 = new StringBuilder("adsfgdca");
		System.out.println(sbd1);
		
		System.out.println(sbd1.append("bbb"));
		System.out.println(sbd1);
		System.out.println(sbd1.toString());
		System.out.println(sbd1.length());
		System.out.println(sbd1.deleteCharAt(2));
		System.out.println(sbd1);
		System.out.println(sbd1.delete(2, 4));
		System.out.println(sbd1);
		System.out.println(sbd1.reverse());
		System.out.println(sbd1);
		// ����replace ����� start, end��ô��д
		System.out.println(sbd1.replace(0, 2, "asdfas"));
		System.out.println(sbd1);
		sbd1.setCharAt(5, '3');
		System.out.println(sbd1);
	}
	
	
}
