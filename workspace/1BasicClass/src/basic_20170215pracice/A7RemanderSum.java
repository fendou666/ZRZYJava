package basic_20170215pracice;

public class A7RemanderSum {
	public static void main(String[] args) {
		int a = 95283;
		// ȡ��ָ���ǽ�ֵ�ȳ�10���µĲ���aȥ����Ϊ����
		int b = a%10; // ����Ϊ3
		int c = a/10%10; // a/10Ϊ9528ȡ���8
		int d = a/100%10; // 2
		int e = a/1000%10; // 5
		int f = a/10000%10; // 9
		int sum = b + c + d + e + f;
		System.out.println("sumΪ" + sum);
	}
}
