package S1Basic;

import java.math.BigInteger;

public class z {
	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt("1a2d", 16));
//		
		System.out.println(new BigInteger("1010",10).toString(2));
		
		System.out.println(new BigInteger("-2",10).toString(2));
		
		System.out.println(Integer.toBinaryString(-2));
		
//		��Ŀ
		int a = 3, b;
		b = a++;
		System.out.println(b);
		System.out.println(a);
		
		b = ++a;
		System.out.println(b);
		System.out.println(a);
//		˫Ŀ
		int x = 4270;
		System.out.println(x/1000*1000);
		double y = 4270;
		System.out.println(x/1000*1000);
//		˫Ŀ�е�����+��, 
		System.out.println(5+2);
		System.out.println("5"+2);
		System.out.println(5+"2");
		System.out.println(5+5+"2");
		System.out.println(5+5+"2"+5+5);// ֤��ֻҪ��߱���ַ����󣬾ͻ�һֱ���ַ���ƴ��
		System.out.println(5+5+"2"+(5+5)); // �����ŵ�������
//		��ֵ�����
		int m = 10;
		m+=10;
		m-=10;
		m*=10;
		m/=10;
//		short n = 2;
//		n=n+1; // ��ͨ��������Զ����������������
//		n+=1; // += ֻ�Ƕ�ֱֵ�Ӽ�1������������ת��������
//		double j = 10;
//		int k = (int)(j + 22.3);
		int zzz = 1;
		zzz +=2.3;
		System.out.println(zzz);
		
//		ת�������
//		System.out.println("\"); // ֱ��һ��\�ᱨ����ת������ת���ַ� Ҫô��ĸҪô����
		
		System.out.println("\\\"��ã�����\"\\");
		System.out.println("123\b222"); // \b�൱�ڼ��̵�backspace
		System.out.println("hellow\rworld"); // \r�൱�ڻس���
		System.out.println("hellow\nworld"); // \nΪ���з�
		System.out.println("hellow\tworld"); // �Ʊ���
		System.out.println("hellow\r\nworld"); // windows�Ļس����൱��\r\n
//		����ת��
		System.out.println("\"");
		
//		�Ƚ������
		
//		�߼������ &|, && || ! ^,
		System.out.println(false^false); // ���ͬ��Ϊ�棬����Ϊ��
		
		
//		�ܽ�
		int i = Integer.MAX_VALUE;
		System.out.println(i); // 2147483647
		i+=1;
		System.out.println(i); // -2147483648
		System.out.println(Integer.parseInt("00000000000000000000000000000010", 2));
//		System.out.println(new BigInteger("10000000000000000000000000000000", 2));
		
		System.out.println(Integer.toBinaryString(-1));
//		i+=1;
//		System.out.println(i); // -2147483648
//		i+=1;
//		System.out.println(i); // -2147483647
		
//		System.out.println(64%0);
		System.out.println(false==false); // Ϊtrue
		System.out.println(64%0.0);
		System.out.println(64/0.0);
		System.out.println(64/0.0);
		System.out.println(64.0%0.0);
		
//		������Ҫ�����ڶ���Integer�������صļ���
//		����ԭ��
		Integer ii=120,jj=120,kk=150,ll=150;
		System.out.println(ii==jj);
		System.out.println(kk==ll);
//		֤����������-128��+127, ֻ�������Χ��������װ��������ͬ��
		
//		int g,h;
//		g= Integer.MIN_VALUE;
//		h= Integer.MIN_VALUE;
//		
//		while (true){
//			g++;
//			h++;
//			Integer r = g;
//			Integer t = h;
//			if (r==t){
//				System.out.println(r);
//				break;
//			}
//		}
//		short gg,hh;
//		gg= Short.MIN_VALUE;
//		hh= Short.MIN_VALUE;
//		
//		while (true){
//			gg++;
//			hh++;
//			Short r = (short)gg ;
//			Short t = (short)hh;
//			if (r==t){
//				System.out.println(r);
//				break;
//			}
//		}
		
//		long ggg,hhh;
//		ggg= Long.MIN_VALUE;
//		hhh= Long.MIN_VALUE;
//		
//		while (true){
//			ggg++;
//			hhh++;
//			Long r = ggg;
//			Long t = hhh;
//			System.out.println(r);
//			if (r==t){
//				System.out.println(r);
//				break;
//			}
//		}
		
		
//		���ó���null����
//		((TestClass)null).theMethod();
//		((TestClass)null).theStatic();
//		TestClass.theStatic();
//		if(Object.class.equals(obj))
		
		System.out.println(Integer.reverse(1));
		System.out.println(Integer.toBinaryString(-2147483648)); 
	}
	public void get(){
		
		for(int i=0; i<100; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\r"+i+"%");
		}
	}
	
	
}