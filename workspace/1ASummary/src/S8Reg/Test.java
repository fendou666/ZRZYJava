package S8Reg;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
//		String reg = "a.b1[abc](ab|c)[0-9][a-z][A-Z][^abc]";
//		String reg = "aads...fadd";
//		String reg = "[\\.]"; [.][\\.] ƥ��Ķ���.
//		String reg = "[0-9][0-9].[0-9][0-9]"; // 999�����ַ�9
		String reg = "[0-2][0-9]:[0-5][0-9]:[0-5][0-9]"; // ʱ����ƥ��
		while(true){
			String x = input.next();
			if(x.equals("exit")){
				System.exit(0);
			}
			if (x.matches(reg)){
				System.out.println(x  + " is ok");
			}else {
				System.out.println(x + " is NG");
			}
		}
	}
}
