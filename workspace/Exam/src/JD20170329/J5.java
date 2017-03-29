package JD20170329;

/**
 * 
 * 5.	求出100-200之间第一个被3整除的数：
 * 
 */

public class J5 {
	public static void main(String[] args) {
		for (int i=100;i<=200;i++){
			if(i%3==0){
				System.out.println(i);
				break;
			}
		}
	}
}
