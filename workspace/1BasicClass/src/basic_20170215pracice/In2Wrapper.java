package basic_20170215pracice;

public class In2Wrapper {
	public static void main(String[] args) {
		// 8中基本类型
		// 基本类型转包，第一种 构造方法，第二种 包装器.valueOf 值类型可以是相应类型或者String 
		Integer intWrap1 = new Integer(11);
		Integer intWrap2 = new Integer("11");
		Integer intWrap3 = Integer.valueOf(11);
		Integer intWrap4 = Integer.valueOf("11");
		// 包装器类转基本类型
		int i = intWrap1.intValue();
		
		// 简化版  互相直接赋值
		int ii = 30;
		Integer iWrap = ii;
		int j = iWrap;
		
// 整形
		// 静态方法（即全局方法）
		// 将String转为相应的基本类型,包装器类型.parse[包类型] 如parseByte 
		// 将基本类型转包装器类型  包装器类型.valueOf(基本类型/基本类型对应的String) 
		// 返回表示指定 byte 的一个新 String 对象。包装器类型.toString(基本类型/基本类型对应的String) 
		/**
		 * 
		 *  Byte = 包装器类型.decode(String nm); 转化为对象(将10进制，16进制，8进制转化为Byte对象) 
		 	10进制直接给数值字符串
		 	16进制 支持（0x,0X,#）开头数值字符串
		 	8进制 支持（0）开头数值字符串
		 *
		 */
		byte staticb1 = Byte.parseByte("11");
		Byte staticWrap = Byte.valueOf("11");
		String newStr = Byte.toString(staticWrap);
		
		
		
		// 包装器方法
		Byte btWrap = Byte.valueOf((byte)22);
		Byte btWrapCmp = Byte.valueOf((byte)22);
		byte b1 = btWrap.byteValue();
		short s1 = btWrap.shortValue();
		int in1 = btWrap.intValue();
		long l1 = btWrap.longValue();
		// 比较包装器类型，返回值0代表相等，>0则大于，<0则小于
		int comResult =  btWrap.compareTo(btWrapCmp);
		//  返回此 Byte 的哈希码。
		int hashCode = btWrap.hashCode();
		String str = btWrap.toString();
		
		
// 浮点型
		
		
// boolean型
		
		// 如果字符串参数不为 null 且在忽略大小写时等于 "true"，则返回的 Boolean 表示 true 值。 
		// 两种形式，valueOf(String) valueOf(相应的类型的值)
		Boolean test = Boolean.valueOf("trUe");
		Boolean test1 = Boolean.valueOf(true);
		Boolean test2 = Boolean.valueOf("true");
		Boolean test3 = Boolean.valueOf("ade");
		if (test) {
			System.out.println("Boolean0 测试成功");
		}
		if (test1) {
			System.out.println("Boolean1 测试成功");
		}
		if (test2) {
			System.out.println("Boolean2 测试成功");
		}
		// 不打印出来，除了忽略大小后为"true"的字符串为真，其他的都是假
		if (test3) {
			System.out.println("Boolean3 测试成功");
		}
		
		String s = "124";
		Byte b = new Byte(s);
		Byte c = new Byte((byte)11);
		//Byte b = new Byte(s);		
		
		
		
		
		// 装箱拆箱
		int x = 10;
		// 装箱
		Integer itg = x;
		// 拆箱
		int y = itg;
		Integer a = 10;
		// test integer
		/**
		 * 
static int bitCount(int i) 
          返回指定 int 值的二进制补码表示形式的 1 位的数量。 
 byte byteValue() 
          以 byte 类型返回该 Integer 的值。 
 int compareTo(Integer anotherInteger) 
          在数字上比较两个 Integer 对象。 
static Integer decode(String nm) 
          将 String 解码为 Integer。 
 double doubleValue() 
          以 double 类型返回该 Integer 的值。 
 boolean equals(Object obj) 
          比较此对象与指定对象。 
 float floatValue() 
          以 float 类型返回该 Integer 的值。 
static Integer getInteger(String nm) 
          确定具有指定名称的系统属性的整数值。 
static Integer getInteger(String nm, int val) 
          确定具有指定名称的系统属性的整数值。 
static Integer getInteger(String nm, Integer val) 
          返回具有指定名称的系统属性的整数值。 
 int hashCode() 
          返回此 Integer 的哈希码。 
static int highestOneBit(int i) 
          返回具有至多单个 1 位的 int 值，在指定的 int 值中最高位（最左边）的 1 位的位置。 
 int intValue() 
          以 int 类型返回该 Integer 的值。 
 long longValue() 
          以 long 类型返回该 Integer 的值。 
static int lowestOneBit(int i) 
          返回具有至多单个 1 位的 int 值，在指定的 int 值中最低位（最右边）的 1 位的位置。 
static int numberOfLeadingZeros(int i) 
          在指定 int 值的二进制补码表示形式中最高位（最左边）的 1 位之前，返回零位的数量。 
static int numberOfTrailingZeros(int i) 
          返回指定的 int 值的二进制补码表示形式中最低（“最右边”）的为 1 的位后面的零位个数。 
static int parseInt(String s) 
          将字符串参数作为有符号的十进制整数进行解析。 
static int parseInt(String s, int radix) 
          使用第二个参数指定的基数，将字符串参数解析为有符号的整数。 
static int reverse(int i) 
          返回通过反转指定 int 值的二进制补码表示形式中位的顺序而获得的值。 
static int reverseBytes(int i) 
          返回通过反转指定 int 值的二进制补码表示形式中字节的顺序而获得的值。 
static int rotateLeft(int i, int distance) 
          返回根据指定的位数循环左移指定的 int 值的二进制补码表示形式而得到的值。 
static int rotateRight(int i, int distance) 
          返回根据指定的位数循环右移指定的 int 值的二进制补码表示形式而得到的值。 
 short shortValue() 
          以 short 类型返回该 Integer 的值。 
static int signum(int i) 
          返回指定 int 值的符号函数。 
static String toBinaryString(int i) 
          以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。 
static String toHexString(int i) 
          以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。 
static String toOctalString(int i) 
          以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式。 
 String toString() 
          返回一个表示该 Integer 值的 String 对象。 
static String toString(int i) 
          返回一个表示指定整数的 String 对象。 
static String toString(int i, int radix) 
          返回用第二个参数指定基数表示的第一个参数的字符串表示形式。 
static Integer valueOf(int i) 
          返回一个表示指定的 int 值的 Integer 实例。 
static Integer valueOf(String s) 
          返回保存指定的 String 的值的 Integer 对象。 
static Integer valueOf(String s, int radix) 
          返回一个 Integer 对象，该对象中保存了用第二个参数提供的基数进行解析时从指定的 String 中提取的值。 

		 * 
		 * 
		 * 
		 */
		
		// 这个不懂
		System.out.println(Integer.bitCount(1));
		System.out.println(Integer.bitCount(Integer.valueOf(5)));
		if (Character.isDigit('a') ) {
			System.out.println("指定字符是数字");
		}
		
		
	}
	
	
}
