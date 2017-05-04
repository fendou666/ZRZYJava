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
		
        // ����Ĭ�����Ի���  
//        Locale.setDefault(Locale.CHINA);  
        Locale.setDefault(Locale.US);  
        // ��ȡ�����Ĭ�����Ի���  
        Locale l = Locale.getDefault();  
        System.out.println("Ĭ�����Դ���: " + l.getLanguage());  
        System.out.println("Ĭ�ϵ�������: " + l.getCountry());  
        System.out.println("Ĭ�����Ե�������: " + l.toString());  
        System.out.println("---------------------------------------");  
        System.out.println("Ĭ����������: " + l.getDisplayLanguage());  
        System.out.println("Ĭ�ϵ�������: " + l.getDisplayCountry());  
        System.out.println("Ĭ������,��������: " + l.getDisplayName());  
        System.out.println("---------------------------------------");  
        System.out.println("������Ĭ�����Խ�: " + Locale.US.getDisplayLanguage());  
        System.out.println("������Ĭ�ϵ�����: " + Locale.US.getDisplayCountry());  
        System.out.println("������Ĭ������,������: " + Locale.US.getDisplayName());
        System.out.println("���ձ�Ĭ�����Դ����: " + Locale.JAPAN.getDisplayLanguage());  
        System.out.println("���ձ�Ĭ�ϵ��������: " + Locale.JAPAN.getDisplayCountry());  
        System.out.println("���ձ�Ĭ������,���������: " + Locale.JAPAN.getDisplayName());  
        System.out.println("---------------------------------------");  
        System.out.println("���Ի�������ĸ��д: " + l.getISO3Language());  
        System.out.println("���һ�������ĸ��д: " + l.getISO3Country());  
        System.out.println("---------------------------------------");  
        // �����Ѿ���װ�����Ի�������  
        Locale[] allLocale = Locale.getAvailableLocales();  
        // ���� ISO 3166 �����������������ĸ���Ҵ���  
        String[] str1 = Locale.getISOCountries();  
        // ���� ISO 639 �����������������ĸ���Դ���  
        String[] str2 = Locale.getISOLanguages(); 
	}
	
	/**
	 * Ҫ��properties�ļ�������� srcĿ¼����
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {  
//		System.out.println("internationalization".length());
		
		ResourceBundle rsbd = ResourceBundle.getBundle("info");
		System.out.println("name:" + rsbd.getString("name")+"  menu:" + rsbd.getString("menu"));
		
		//������������
		Locale lc = new Locale("en", "US");
		ResourceBundle bundle = ResourceBundle.getBundle("info", lc);
		System.out.println("name:" + bundle.getString("name")+"  menu:" + bundle.getString("menu"));
		
    }  
}
