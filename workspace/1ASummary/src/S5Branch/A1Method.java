package S5Branch;

public class A1Method {
	public void get1(int sideLength){
		for (int i =1; i<=sideLength; i++) {
			for (int j=sideLength-1; j>=1;j--) {
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=sideLength-1;i++) {
			for (int j=1; j<=i;j++) {
				System.out.print(" ");
			}
			for (int j=1; j>=2*(sideLength-1)-1 - (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public String get2(){
		
		return "";
	}
	
	public static void main(String[] args) {
		A1Method A1 = new A1Method();
		A1.get1(5);
		
		if(1){
			
		}
	}
}
