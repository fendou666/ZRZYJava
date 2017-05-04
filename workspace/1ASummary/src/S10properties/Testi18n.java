package S10properties;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * i18n=internationalization
 * @author Administrator
 *
 */


public class Testi18n {
	public void othersInfo(){
		Locale[] ls = Locale.getAvailableLocales();   
		for (Locale locale:ls) {   
			System.out.println("locale :"+locale); 
		} 
		
        // 设置默认语言环境  
//        Locale.setDefault(Locale.CHINA);  
        Locale.setDefault(Locale.US);  
        // 获取计算机默认语言环境  
        Locale l = Locale.getDefault();  
        System.out.println("默认语言代码: " + l.getLanguage());  
        System.out.println("默认地区代码: " + l.getCountry());  
        System.out.println("默认语言地区代码: " + l.toString());  
        System.out.println("---------------------------------------");  
        System.out.println("默认语言描述: " + l.getDisplayLanguage());  
        System.out.println("默认地区描述: " + l.getDisplayCountry());  
        System.out.println("默认语言,地区描述: " + l.getDisplayName());  
        System.out.println("---------------------------------------");  
        System.out.println("在美国默认语言叫: " + Locale.US.getDisplayLanguage());  
        System.out.println("在美国默认地区叫: " + Locale.US.getDisplayCountry());  
        System.out.println("在美国默认语言,地区叫: " + Locale.US.getDisplayName());
        System.out.println("在日本默认语言代码叫: " + Locale.JAPAN.getDisplayLanguage());  
        System.out.println("在日本默认地区代码叫: " + Locale.JAPAN.getDisplayCountry());  
        System.out.println("在日本默认语言,地区代码叫: " + Locale.JAPAN.getDisplayName());  
        System.out.println("---------------------------------------");  
        System.out.println("语言环境三字母缩写: " + l.getISO3Language());  
        System.out.println("国家环境三字母缩写: " + l.getISO3Country());  
        System.out.println("---------------------------------------");  
        // 机器已经安装的语言环境数组  
        Locale[] allLocale = Locale.getAvailableLocales();  
        // 返回 ISO 3166 中所定义的所有两字母国家代码  
        String[] str1 = Locale.getISOCountries();  
        // 返回 ISO 639 中所定义的所有两字母语言代码  
        String[] str2 = Locale.getISOLanguages(); 
	}
	
	/**
	 * 要求properties文件必须放在 src目录下面
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {  
//		System.out.println("internationalization".length());
		
		ResourceBundle rsbd = ResourceBundle.getBundle("info");
		System.out.println("name:" + rsbd.getString("name")+"  menu:" + rsbd.getString("menu"));
		
		//加载其他语言
		Locale lc = new Locale("en", "US");
		ResourceBundle bundle = ResourceBundle.getBundle("info", lc);
		System.out.println("name:" + bundle.getString("name")+"  menu:" + bundle.getString("menu"));
		
    }  
}
