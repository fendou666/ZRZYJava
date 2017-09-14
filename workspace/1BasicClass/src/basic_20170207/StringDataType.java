package basic_20170207;

public class StringDataType {
	public static void main(String[] args){
		String  s1 = new String("absaacxddaBZaawqd");
		String  s2 = "aaasdfasdwq";
//		String  s3 = "aaasdfasdwq";
//		if (s2 == s3) {
//			System.out.println("成功");
//		} else {
//			System.out.println("失败");
//		}
		 
// 找index对应的字节
		
		// 参数index 索引找到第n个字节(从0开始计数)
		System.out.println(s1.charAt(2));
		// 返回对应位置字符对应的unicode值
		System.out.println(s1.codePointAt(5));
		// 参数 int ch(为Unicode 代码单元) 返回指定字符在此字符串中第一次出现处的索引。
//		System.out.println(s1.indexOf(0));
		// 返回指定子字符串在此字符串中第一次出现处的索引。（无为-1）
		System.out.println(s1.indexOf("aa"));
		// 
		System.out.println(s1.indexOf("aa", 6));
// 字符串截取
//		// 参数beginIndex,从第n个开始截取
//		System.out.println(s1.substring(5));
//		// 参数beginIndex, endIndex 截取从第5个到第7个 包前不包后
//		System.out.println(s1.substring(5, 7));
		
		
		
// 逻辑判断
//		System.out.println(s1.isEmpty());
//		// 参数为String 比较字符串(字典排序比较)相等
//		System.out.println(s1.equals(s2));
//		// 忽略大小写比较
//		System.out.println(s1.equalsIgnoreCase("absaacxDDaBZaawqd"));
//		// 判断以什么字符串开始
//		System.out.println(s1.startsWith("absaa"));
//		// 参数index 索引找到第n个字节(从0开始计数)
//		System.out.println(s1.startsWith("aa", 3));
//		// 判断以什么字符串结尾
//		System.out.println(s1.endsWith("aawqd"));
// 值更改
//		// 参数oldChar, newChar 字节替换(全部)
//		System.out.println(s1.replace('a', '你'));
//		// target, replacement charSequence(char片段) 替换(全部)  
//		System.out.println(s1.replace("ab", "sss"));
//		// regex, replacement 正则匹配(第一个)
//		System.out.println(s1.replaceFirst("ab", "aaa"));
//		// regex, replacement 正则匹配所有
//		System.out.println(s1.replaceAll("ab", "aaa"));
//		System.out.println(s1.toCharArray());
//		// 全部小写
//		System.out.println(s1.toLowerCase());
//		// 全部大写
//		System.out.println(s1.toUpperCase());
//		// locale 怎不知道
//		//System.out.println(s1.toUpperCase(locale));
//		// 将字符串中的前后空格去掉
//		System.out.print(("    fda as dfadf  fsg    ").trim());
//		System.out.print("测试成功\n");
// 其他
//		// 获取长度
//		System.out.println(s1.length());
		// 未知
//		String s3 = "aacdefaa";
//		System.out.println(s1.offsetByCodePoints(2,6));
//		System.out.println(s3.offsetByCodePoints(2,6));
		
	}
}
