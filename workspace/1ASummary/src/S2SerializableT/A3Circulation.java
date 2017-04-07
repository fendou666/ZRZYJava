package S2SerializableT;

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
//		树叶
		for(int i=1; i<=9;i++){
//			左边大空白
			for (int j=1;j<=9-i;j++){
				System.out.print(" ");
			}
//			右边三角叠加
			if (i<=3) {
				for (int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				
			}else if(i<=6){
//				i-3代表初次循环的1
				for (int j=1;j<=2*(i-3)-1;j++) {
					System.out.print("*");
				}
//				2*3-1代表第一行最大5个，2(i-1)指的是每行会少掉的值， 因为这里的i首次是4，所以要减去3才能是1
				for (int j=1;j<=2*3-1 - 2*((i-3)-1);j++) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*(i-3)-1;j++) {
					System.out.print("*");
				}
				
			}else{
				for (int j=1;j<=2*(i-6)-1;j++) {
					System.out.print("*");
				}
				for (int j=1;j<=2*3-1 - 2*((i-6)-1);j++) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*(i-6)-1;j++) {
					System.out.print("*");
				}
				for (int j=1;j<=2*3-1 - 2*((i-6)-1);j++) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*(i-6)-1;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
//		树根
		for(int i=1; i<=8;i++){
			for(int j=1; j<=7; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=3; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void draw(String type, int init, int max){
		if (type == " ") {
			for (int i=init; i<=max; i++) {
				System.out.print(" ");
			}
		}else {
			for (int i=init; i<=max; i++) {
				System.out.print("*");
			}
		}
	}
	
//	打印圣诞树
	public void getChristmasTree2(){
//		树叶
		for(int i=1; i<=9;i++){
//			左边大空白
			draw(" ", 1, 9-i);
//			右边三角叠加
			if (i<=3) {
				draw("*", 1, 2*i-1);
			}else if(i<=6){
//				i-3代表初次循环的1
				draw("*", 1, 2*(i-3)-1);
//				2*3-1代表第一行最大5个，2(i-1)指的是每行会少掉的值， 因为这里的i首次是4，所以要减去3才能是1
				draw(" ", 1, 2*3-1 - 2*((i-3)-1));
				draw("*", 1, 2*(i-3)-1);
			}else{
				draw("*", 1, 2*(i-6)-1);
				draw(" ", 1, 2*3-1 - 2*((i-6)-1));
				draw("*", 1, 2*(i-6)-1);
				draw(" ", 1, 2*3-1 - 2*((i-6)-1));
				draw("*", 1, 2*(i-6)-1);
			}
			System.out.println();
		}
//		树根
		for(int i=1; i<=8;i++){
			draw(" ", 1, 7);
			draw("*", 1, 7);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		A3Circulation A3 = new A3Circulation();
//		A3.getSum();
//		A3.getMultiple();
//		A3.getTriagle();
//		A3.getChristmasTree();
		A3.getChristmasTree2();
	}
//	
	
}
