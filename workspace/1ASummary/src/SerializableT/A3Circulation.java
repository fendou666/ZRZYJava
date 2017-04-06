package SerializableT;

public class A3Circulation {
//	1到10求和
	public void getSum(){
		int sum = 0; // 设置循环中需要的变量
		int i = 1; // 定义条件变量
		while(i<=10){ // 设置退出条件
			sum = sum +i;
			i++; // 条件步进
		}
		System.out.println(sum);
		
		sum = 0;
		i = 1;
		do {
			sum = sum +i;
			i++;
		}while(i<=10);
		
		sum = 0;
		for (int j=1;j<=10;j++){
			sum += j;
		}
	}
	
//	1到100之间7的倍数输出
	public void getMultiple(){
		int i = 1; // 定义条件变量
		while(i<=100){ // 设置退出条件
			if(i%7==0){
				System.out.println(i);
			}
			i++; // 条件步进
		}
		
		i = 1;
		do {
			if(i%7==0){
				System.out.println(i);
			}
			i++;
		}while(i<=100);
		
		for (int j=1;j<=100;j++){
			if(j%7==0){
				System.out.println(j);
			}
		}
		 
	}
//	打印菱形
	public void getRhombus(){
		
		
	}
//	打印三角形
	public void getTriagle(){
		for(int i =1 ; i<=5;i++){
			for(int j=1; j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for(int j=1; j<=i;j++){
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	打印圣诞树
	public void getChristmasTree(){
		
		
	}
	
	
	public static void main(String[] args) {
		A3Circulation A3 = new A3Circulation();
//		A3.getSum();
//		A3.getMultiple();
		A3.getTriagle();
	}
//	
	
}
