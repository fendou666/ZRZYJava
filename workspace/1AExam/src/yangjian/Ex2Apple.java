package yangjian;
/**
 * ��ƻ��
 * ����:	С��׼����M��ͬ����ƻ������N��ͬ��������������е����ӿ��Ų��ţ���ôһ���ж����ֲ�ͬ�ķַ��أ�
 * ˵����3��1��1��1��3��1 ��ͬһ�ַַ���
 * ����:	ÿ������������������M��N��0<=M<=10��1<=N<=10��
 * ���:	һ������K����ʾһ����K�ַ�ƻ���ķ�����
 * ��������:	7 3
 * �������:	8
 * 
 */



import java.util.Scanner;

// ��������ϵĴ� ����ʱû����

public class Ex2Apple {
	public int count=0;
	public static Scanner in = new Scanner(System.in);
	public void printArr(int dishNum, int [] arr){
		// ����һ��������ƻ��������
		int appleCount = 0;
	    for (int i = 0; i < dishNum; i++){
	    	// ÿ�γ�ʼ��Ϊ0
	    	appleCount = 0;
	        for (int j = 0; j < arr[i]; j++){
	        	appleCount++;
	        }
	        System.out.print(appleCount + " ");
	    }
	    System.out.println();
	}
	public void allocation(int appleNumLeft, int dishNum, int idx, int [] arr){
	    if (idx == (dishNum - 1)){
	        if (arr[idx - 1] >= appleNumLeft){
	            arr[idx] = appleNumLeft;
	            count++;
	            printArr(dishNum, arr);
	            return;
	        }
	        else
	            return;
	    }
	    else{
	        for (int j = appleNumLeft; j >= 0; j--){
	 
	            if (idx == 0){
	                arr[idx] = j;
	                allocation(appleNumLeft - j, dishNum, idx + 1, arr);
	            }
	            else{
	                if (arr[idx - 1] >= j){
	                    arr[idx] = j;
	                    allocation(appleNumLeft - j, dishNum, idx + 1, arr);
	                }
	 
	            }
	 
	        }
	    }
	 
	}
	
	// m����ƻ�������� n������������
	public static void main(String[] args) {
		Ex2Apple app = new Ex2Apple();
		int M, N;
		 System.out.println("������ƻ������");
		 M = in.nextInt();
		 System.out.println("��������������");
		 N = in.nextInt();
		 int [] a = new int[N];
		 app.allocation(M, N, 0, a);
		 System.out.println(app.count);
	}
	
}
