package basic_20170221;

public class FinalTest {
	// ��̬��������(ֵ�Ƕ�̬�ģ������Ƿ�static�ġ���ÿ�����󶼻ᴴ��һ�ݡ�)
	private final int a;  //������final���εı�������ͨ�����췽����ʼ��
	private final int b = 2;
	// ��̬��������
	//private static final int c;  // static ���ε�final�����ʼ��
	private static final int d = 3;
	
	public FinalTest() {
		a = 11;
		//c = 12;
	}
	
	public FinalTest(final int a, final int c) {
		this.a = a;
		//this.c = c;
	}
	
	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
	}
}
