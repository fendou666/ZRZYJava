package JD20170329;

/**
 * 
 * 猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾有多吃了一个，
 * 第二天早上又将剩下的桃子吃掉一半又多吃了一个，
 * 以后每天早上都吃了前一天剩下的一半零一个第10天早上想在吃时，就只剩下一个桃子了，
 * 求第一天共摘了多少桃子？
 * 
 * @author Administrator
 *
 */

public class J7 {
	public static void main(String[] args) {
		int sum = 1;
		
		for(int i=0;i<9;i++){
			sum = 2*sum+2;
		}
		System.out.println(sum);
	}
}
