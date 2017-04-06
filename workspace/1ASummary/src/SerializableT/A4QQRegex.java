package SerializableT;

public class A4QQRegex {
	
	public static void qqCheckOld(String QQ){
		
		int length = QQ.length();
		boolean flag = false;
		if (length>4&&length<15) {
			char [] qqChar = QQ.toCharArray();
			if (qqChar[0]>='1' && qqChar[0]<='9'){
				flag = false;
				for (int i = 1; i < qqChar.length; i++) {
					if (!(qqChar[i]>='0' && qqChar[i]<='9')) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("����0��9֮���ֵ");
				}else {
					System.out.println("qqΪ��" + QQ);
				}
				
			}else {
				System.out.println("��λֻ��Ϊ0��9֮��");
			}
			
		}else{
			System.out.println("�Ƿ�����");
		}
		
	}
	public static void qqCheckOld2 (String QQ) {
		
		int length = QQ.length();
		if (length>4&&length<15) {
			char [] qqChar = QQ.toCharArray();
			if (qqChar[0]>='1' && qqChar[0]<='9'){
				try {
					Long l = Long.parseLong(QQ);
					System.out.println("qqΪ��" + QQ);
				}catch (NumberFormatException e){
					System.out.println("�����qq����");
				}
			}else {
				System.out.println("��λֻ��Ϊ0��9֮��");
			}
			
		}else{
			System.out.println("�Ƿ�����");
		}
		
		
	}
	
	
	public static void qqCheckRegex(String qq){
		
		String regex = "[1-9][0-9]{4,13}";
		boolean flag = qq.matches(regex);
		if (flag) {
			System.out.println("������ȷ");
		}else {
			System.out.println("������� qq" + qq);
		}
	}
	
	public static void testSplit(String s, String regex){
		String [] str = s.split(regex);
		for (String ss: str) {
			System.out.println(ss);
		}
	}
	
	public static void testReplace(String str, String reg, String replacement){
		str = str.replaceAll(reg, replacement);
		System.out.println(str);
	}
	
	public static void main(String[] args) {
//		String QQ = "123d45";
//		qqCheckOld(QQ);
//		qqCheckOld2(QQ);
//		qqCheckRegex(QQ);
//		testSplit("work   space  dest.txt", " ");
//		testSplit("work   space  dest.txt", " +");
//		testSplit("work   space  dest.txt", "\\s+");
//		testSplit("D:\\workspace\\dest.txt", "\\\\");
//		testReplace("wwwwwadfaeeeezdfadsrrrrrdfa", "\\w{3,}", "#");
//		ƥ�������ظ��ַ�
		testReplace("wwwwwad1111faeeeezdfadsrrrrrdfa", "(.)\\1{2,}", "#");
//		ƥ��˳���ַ�
		testReplace("abcdedadfadsffcdefaeddac12345dfahhd", "(.)\\1{2,}", "#");
	}
}
