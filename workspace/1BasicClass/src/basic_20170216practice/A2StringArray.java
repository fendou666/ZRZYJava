package basic_20170216practice;
/**
 * 
 * 
2������һ���ַ������飬Ԫ�طֱ��ǣ�С�ܣ�С������䣬������
   ����ȫ����Ԫ�����������
 *
 */
public class A2StringArray {
	public static void main(String[] args) {
		String [] str = {"С��","С��","���","����"};
		// ��һ��
//		for(int i=0; i<str.length; i++) {
//			System.out.print(str[i]);
//		}
		// �ڶ���
		for(String x : str) {
			System.out.print(x);
		}
	}
}
