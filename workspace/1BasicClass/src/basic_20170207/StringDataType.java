package basic_20170207;

public class StringDataType {
	public static void main(String[] args){
		String  s1 = new String("absaacxddaBZaawqd");
		String  s2 = "aaasdfasdwq";
//		String  s3 = "aaasdfasdwq";
//		if (s2 == s3) {
//			System.out.println("�ɹ�");
//		} else {
//			System.out.println("ʧ��");
//		}
		 
// ��index��Ӧ���ֽ�
		
		// ����index �����ҵ���n���ֽ�(��0��ʼ����)
		System.out.println(s1.charAt(2));
		// ���ض�Ӧλ���ַ���Ӧ��unicodeֵ
		System.out.println(s1.codePointAt(5));
		// ���� int ch(ΪUnicode ���뵥Ԫ) ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
//		System.out.println(s1.indexOf(0));
		// ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ�������������Ϊ-1��
		System.out.println(s1.indexOf("aa"));
		// 
		System.out.println(s1.indexOf("aa", 6));
// �ַ�����ȡ
//		// ����beginIndex,�ӵ�n����ʼ��ȡ
//		System.out.println(s1.substring(5));
//		// ����beginIndex, endIndex ��ȡ�ӵ�5������7�� ��ǰ������
//		System.out.println(s1.substring(5, 7));
		
		
		
// �߼��ж�
//		System.out.println(s1.isEmpty());
//		// ����ΪString �Ƚ��ַ���(�ֵ�����Ƚ�)���
//		System.out.println(s1.equals(s2));
//		// ���Դ�Сд�Ƚ�
//		System.out.println(s1.equalsIgnoreCase("absaacxDDaBZaawqd"));
//		// �ж���ʲô�ַ�����ʼ
//		System.out.println(s1.startsWith("absaa"));
//		// ����index �����ҵ���n���ֽ�(��0��ʼ����)
//		System.out.println(s1.startsWith("aa", 3));
//		// �ж���ʲô�ַ�����β
//		System.out.println(s1.endsWith("aawqd"));
// ֵ����
//		// ����oldChar, newChar �ֽ��滻(ȫ��)
//		System.out.println(s1.replace('a', '��'));
//		// target, replacement charSequence(charƬ��) �滻(ȫ��)  
//		System.out.println(s1.replace("ab", "sss"));
//		// regex, replacement ����ƥ��(��һ��)
//		System.out.println(s1.replaceFirst("ab", "aaa"));
//		// regex, replacement ����ƥ������
//		System.out.println(s1.replaceAll("ab", "aaa"));
//		System.out.println(s1.toCharArray());
//		// ȫ��Сд
//		System.out.println(s1.toLowerCase());
//		// ȫ����д
//		System.out.println(s1.toUpperCase());
//		// locale ����֪��
//		//System.out.println(s1.toUpperCase(locale));
//		// ���ַ����е�ǰ��ո�ȥ��
//		System.out.print(("    fda as dfadf  fsg    ").trim());
//		System.out.print("���Գɹ�\n");
// ����
//		// ��ȡ����
//		System.out.println(s1.length());
		// δ֪
//		String s3 = "aacdefaa";
//		System.out.println(s1.offsetByCodePoints(2,6));
//		System.out.println(s3.offsetByCodePoints(2,6));
		
	}
}
