package JD20170329;

/**
 * 
 * 2.	�ֱ��ӡ���ľ��κͿ�������
 * 
 * @author Administrator
 *
 */


public class J2 {
//	��Ϊm,��Ϊn
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
//	ָ�����α߳����������ֻ������������һ��
	public void getRhombus(int m){
//		System.out.println("   *   ");
//		System.out.println(" *   * ");
//		System.out.println("*     *");
//		System.out.println(" *   * ");
//		System.out.println("   *   ");
		for(int x=1;x<=2*m-1;x++){
//			IF�����������ϰ벿�ּ��϶Գ��߲���
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