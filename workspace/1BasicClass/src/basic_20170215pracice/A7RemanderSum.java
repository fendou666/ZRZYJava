package basic_20170215pracice;

public class A7RemanderSum {
	public static void main(String[] args) {
		int a = 95283;
		// 取余指的是将值先除10余下的不足a去除的为余数
		int b = a%10; // 余数为3
		int c = a/10%10; // a/10为9528取余的8
		int d = a/100%10; // 2
		int e = a/1000%10; // 5
		int f = a/10000%10; // 9
		int sum = b + c + d + e + f;
		System.out.println("sum为" + sum);
	}
}
