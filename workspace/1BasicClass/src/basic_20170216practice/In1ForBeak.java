package basic_20170216practice;

public class In1ForBeak {
	public static void main(String[] args) {
		int number = 0;
		int j=0;
		while(j<100){
			number = (int)(Math.random()*10000);
			System.out.println("当前随机数是" + number);
			if (number%5 == 0) {
				System.out.println("当前随机数是5的倍数退出循环");
				break;
			}
			if (number%9 == 0) {
				System.out.println("当前随机数是9的倍数不做选择");
				continue;
			}
			if (number%2==0) {
				System.out.println("当前随机数是偶数");
			}else{
				System.out.println("当前随机数是奇数");
			}
			
			j++;
		}
//		for (int i = 0; i<10; i++){
//			number = (int)(Math.random()*10000);
//			if (number%2==0) {
//				System.out.println("当前随机数是偶数");
//			}else {
//				System.out.println("当前随机数是奇数");
//			}
//		}
//		// 直接求出偶数的值
//		for (int i = 2; i<100; i+=2) {
//			number = number + i;
//		}
	}
}
