package basic_20170215pracice;

public class In2Wrapper {
	public static void main(String[] args) {
		// 8�л�������
		// ��������ת������һ�� ���췽�����ڶ��� ��װ��.valueOf ֵ���Ϳ�������Ӧ���ͻ���String 
		Integer intWrap1 = new Integer(11);
		Integer intWrap2 = new Integer("11");
		Integer intWrap3 = Integer.valueOf(11);
		Integer intWrap4 = Integer.valueOf("11");
		// ��װ����ת��������
		int i = intWrap1.intValue();
		
		// �򻯰�  ����ֱ�Ӹ�ֵ
		int ii = 30;
		Integer iWrap = ii;
		int j = iWrap;
		
// ����
		// ��̬��������ȫ�ַ�����
		// ��StringתΪ��Ӧ�Ļ�������,��װ������.parse[������] ��parseByte 
		// ����������ת��װ������  ��װ������.valueOf(��������/�������Ͷ�Ӧ��String) 
		// ���ر�ʾָ�� byte ��һ���� String ���󡣰�װ������.toString(��������/�������Ͷ�Ӧ��String) 
		/**
		 * 
		 *  Byte = ��װ������.decode(String nm); ת��Ϊ����(��10���ƣ�16���ƣ�8����ת��ΪByte����) 
		 	10����ֱ�Ӹ���ֵ�ַ���
		 	16���� ֧�֣�0x,0X,#����ͷ��ֵ�ַ���
		 	8���� ֧�֣�0����ͷ��ֵ�ַ���
		 *
		 */
		byte staticb1 = Byte.parseByte("11");
		Byte staticWrap = Byte.valueOf("11");
		String newStr = Byte.toString(staticWrap);
		
		
		
		// ��װ������
		Byte btWrap = Byte.valueOf((byte)22);
		Byte btWrapCmp = Byte.valueOf((byte)22);
		byte b1 = btWrap.byteValue();
		short s1 = btWrap.shortValue();
		int in1 = btWrap.intValue();
		long l1 = btWrap.longValue();
		// �Ƚϰ�װ�����ͣ�����ֵ0������ȣ�>0����ڣ�<0��С��
		int comResult =  btWrap.compareTo(btWrapCmp);
		//  ���ش� Byte �Ĺ�ϣ�롣
		int hashCode = btWrap.hashCode();
		String str = btWrap.toString();
		
		
// ������
		
		
// boolean��
		
		// ����ַ���������Ϊ null ���ں��Դ�Сдʱ���� "true"���򷵻ص� Boolean ��ʾ true ֵ�� 
		// ������ʽ��valueOf(String) valueOf(��Ӧ�����͵�ֵ)
		Boolean test = Boolean.valueOf("trUe");
		Boolean test1 = Boolean.valueOf(true);
		Boolean test2 = Boolean.valueOf("true");
		Boolean test3 = Boolean.valueOf("ade");
		if (test) {
			System.out.println("Boolean0 ���Գɹ�");
		}
		if (test1) {
			System.out.println("Boolean1 ���Գɹ�");
		}
		if (test2) {
			System.out.println("Boolean2 ���Գɹ�");
		}
		// ����ӡ���������˺��Դ�С��Ϊ"true"���ַ���Ϊ�棬�����Ķ��Ǽ�
		if (test3) {
			System.out.println("Boolean3 ���Գɹ�");
		}
		
		String s = "124";
		Byte b = new Byte(s);
		Byte c = new Byte((byte)11);
		//Byte b = new Byte(s);		
		
		
		
		
		// װ�����
		int x = 10;
		// װ��
		Integer itg = x;
		// ����
		int y = itg;
		Integer a = 10;
		// test integer
		/**
		 * 
static int bitCount(int i) 
          ����ָ�� int ֵ�Ķ����Ʋ����ʾ��ʽ�� 1 λ�������� 
 byte byteValue() 
          �� byte ���ͷ��ظ� Integer ��ֵ�� 
 int compareTo(Integer anotherInteger) 
          �������ϱȽ����� Integer ���� 
static Integer decode(String nm) 
          �� String ����Ϊ Integer�� 
 double doubleValue() 
          �� double ���ͷ��ظ� Integer ��ֵ�� 
 boolean equals(Object obj) 
          �Ƚϴ˶�����ָ������ 
 float floatValue() 
          �� float ���ͷ��ظ� Integer ��ֵ�� 
static Integer getInteger(String nm) 
          ȷ������ָ�����Ƶ�ϵͳ���Ե�����ֵ�� 
static Integer getInteger(String nm, int val) 
          ȷ������ָ�����Ƶ�ϵͳ���Ե�����ֵ�� 
static Integer getInteger(String nm, Integer val) 
          ���ؾ���ָ�����Ƶ�ϵͳ���Ե�����ֵ�� 
 int hashCode() 
          ���ش� Integer �Ĺ�ϣ�롣 
static int highestOneBit(int i) 
          ���ؾ������൥�� 1 λ�� int ֵ����ָ���� int ֵ�����λ������ߣ��� 1 λ��λ�á� 
 int intValue() 
          �� int ���ͷ��ظ� Integer ��ֵ�� 
 long longValue() 
          �� long ���ͷ��ظ� Integer ��ֵ�� 
static int lowestOneBit(int i) 
          ���ؾ������൥�� 1 λ�� int ֵ����ָ���� int ֵ�����λ�����ұߣ��� 1 λ��λ�á� 
static int numberOfLeadingZeros(int i) 
          ��ָ�� int ֵ�Ķ����Ʋ����ʾ��ʽ�����λ������ߣ��� 1 λ֮ǰ��������λ�������� 
static int numberOfTrailingZeros(int i) 
          ����ָ���� int ֵ�Ķ����Ʋ����ʾ��ʽ����ͣ������ұߡ�����Ϊ 1 ��λ�������λ������ 
static int parseInt(String s) 
          ���ַ���������Ϊ�з��ŵ�ʮ�����������н����� 
static int parseInt(String s, int radix) 
          ʹ�õڶ�������ָ���Ļ��������ַ�����������Ϊ�з��ŵ������� 
static int reverse(int i) 
          ����ͨ����תָ�� int ֵ�Ķ����Ʋ����ʾ��ʽ��λ��˳�����õ�ֵ�� 
static int reverseBytes(int i) 
          ����ͨ����תָ�� int ֵ�Ķ����Ʋ����ʾ��ʽ���ֽڵ�˳�����õ�ֵ�� 
static int rotateLeft(int i, int distance) 
          ���ظ���ָ����λ��ѭ������ָ���� int ֵ�Ķ����Ʋ����ʾ��ʽ���õ���ֵ�� 
static int rotateRight(int i, int distance) 
          ���ظ���ָ����λ��ѭ������ָ���� int ֵ�Ķ����Ʋ����ʾ��ʽ���õ���ֵ�� 
 short shortValue() 
          �� short ���ͷ��ظ� Integer ��ֵ�� 
static int signum(int i) 
          ����ָ�� int ֵ�ķ��ź����� 
static String toBinaryString(int i) 
          �Զ����ƣ����� 2���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
static String toHexString(int i) 
          ��ʮ�����ƣ����� 16���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
static String toOctalString(int i) 
          �԰˽��ƣ����� 8���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
 String toString() 
          ����һ����ʾ�� Integer ֵ�� String ���� 
static String toString(int i) 
          ����һ����ʾָ�������� String ���� 
static String toString(int i, int radix) 
          �����õڶ�������ָ��������ʾ�ĵ�һ���������ַ�����ʾ��ʽ�� 
static Integer valueOf(int i) 
          ����һ����ʾָ���� int ֵ�� Integer ʵ���� 
static Integer valueOf(String s) 
          ���ر���ָ���� String ��ֵ�� Integer ���� 
static Integer valueOf(String s, int radix) 
          ����һ�� Integer ���󣬸ö����б������õڶ��������ṩ�Ļ������н���ʱ��ָ���� String ����ȡ��ֵ�� 

		 * 
		 * 
		 * 
		 */
		
		// �������
		System.out.println(Integer.bitCount(1));
		System.out.println(Integer.bitCount(Integer.valueOf(5)));
		if (Character.isDigit('a') ) {
			System.out.println("ָ���ַ�������");
		}
		
		
	}
	
	
}
