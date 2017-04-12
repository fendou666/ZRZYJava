package S5Branch;

public class A2Mathod2 {
//	分析归纳
	public void method1(int level){
//		int spaceNumber = level-1;
//		int startNumber = 1; 
		printSpace(spaceNumber);
		printStar(StartNumber);
		printChangeLine();
	}
	
//	打印空格， 打印星号，打印换行
	public void printSpace(int spaceNumber){
		for (int i=0;i<spaceNumber;i++){
			System.out.print(" ");
		}
	}
	public void printStar(int StartNumber){
		for (int i=0;i<StartNumber;i++){
			System.out.print("*");
		}
	}
	public void printChangeLine(int lineNumber){
		System.out.println();
	}
	
	
	
//	打印（按符号打印）
	public void printChar(int number, s ca){
		for (int i=1;i<=number;i++) {
			System.out.print(ca);
		}
	}
	
	
	
//	图形分析
	
	public static void main(String[] args) {
		
	}
}
