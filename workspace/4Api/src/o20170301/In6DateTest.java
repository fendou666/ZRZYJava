package o20170301;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class In6DateTest {
	public static void main(String[] args) {
		
		// ���붨λʱ��
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString().length());
		System.out.println(d.toString().substring(24, 28));
		
			// ������������ʱ��
		Date old = new Date(15222222222L);
		System.out.println(old);
		// ���ع̶���ʽ��ʱ��
		// format ������Ҫ�����ʱ��
		// DateFormat.getDateInstance() ��DateFormat.getDateTimeInstance() �ֱ�����ظ�ʽ
		// ��������
		String DF = DateFormat.getDateInstance().format(new Date());
		// �������ڼ�ʱ��
		String DFT = DateFormat.getDateTimeInstance().format(new Date());
		System.out.println(DF);
		System.out.println(DFT);
		// �������ʱ���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		
		
	}
}
