package o20170301;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class In6DateTest {
	public static void main(String[] args) {
		
		// 用秒定位时间
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString().length());
		System.out.println(d.toString().substring(24, 28));
		
			// 传入秒数返回时间
		Date old = new Date(15222222222L);
		System.out.println(old);
		// 返回固定格式的时间
		// format 代表需要传入的时间
		// DateFormat.getDateInstance() 与DateFormat.getDateTimeInstance() 分别代表返回格式
		// 返回日期
		String DF = DateFormat.getDateInstance().format(new Date());
		// 返回日期加时间
		String DFT = DateFormat.getDateTimeInstance().format(new Date());
		System.out.println(DF);
		System.out.println(DFT);
		// 自由组合时间格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		
		
	}
}
