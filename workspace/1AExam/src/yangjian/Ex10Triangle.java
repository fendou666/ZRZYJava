package yangjian;
/**
 * 求圆中有效区域
 * 你可以在一个圆上安排N个点，将他们两两连接，问你最多能将圆划分成多少个满足该条件的区域，区域的变不在圆周上
 * 
 * 样例输入3
 * 输入1
 * 通过分析得知，相当于任意3点形成一个有效区域
 */
import java.util.Scanner;

public class Ex10Triangle {
	public static Scanner in = new Scanner(System.in);
	public static int getAreaCount(int n){
		int sum = 0;
		int countBegin = n-2;
		// 最少要三个点
		if(countBegin<1){
			return sum;
		}
		// 核心每三个点形成一个有效区域，比如6个点   相当于 4+3+2+1
		//（这里自己画图想一下，任意三点形成一个区域）
		// 计算方式（1+n-2）*(n-2)/2  相当于计算等差数列
		for(int i=1; i<=countBegin; i++){
			sum+= (1+i)*i/2;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("请输入圆上的点数");
		int n = in.nextInt();
		int sum = getAreaCount(n);
		System.out.println("圆的有效区域是" + sum);
	}
}
