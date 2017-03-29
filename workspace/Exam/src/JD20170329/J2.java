package JD20170329;

/**
 * 
 * 2.	分别打印空心矩形和空心菱形
 * 
 * @author Administrator
 *
 */


public class J2 {
//	长为m,宽为n
	public void getRectangle(int m, int n){
//		System.out.println("*********");
//		System.out.println("*       *");
//		System.out.println("*       *");
//		System.out.println("*       *");
//		System.out.println("*********");
		for (int i=0;i<n;i++){
		
			if(i==0||i==n-1){
				for(int j=0;j<m;j++){
					System.out.print("*");
				}
			}else{
				for(int k=0;k<m;k++){
					if(k==0||k==m-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}
//	指定菱形边长，这个方法只是菱形最正的一种
	public void getRhombus(int m){
//		System.out.println("   *   ");
//		System.out.println(" *   * ");
//		System.out.println("*     *");
//		System.out.println(" *   * ");
//		System.out.println("   *   ");
		for(int x=1;x<=2*m-1;x++){
//			IF语句包含菱形上半部分加上对称线部分
			if(x<=m){
				for(int i = 1;i<=m-x;i++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int i = 1;i<2*(x-1);i++){
					System.out.print(" ");
				}
			}else{
				for(int i = 1;i<=x-m;i++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int i =1;i<=2*(m-(x-m+1))-1;i++){
					System.out.print(" ");
				}
			}
			if(x==1||x==2*m-1){
				
			}else{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
	
	public static void main(String[] args) {
		J2 j = new J2();
		j.getRectangle(10,20);
		j.getRhombus(4);
	}
	
	
}
