package yangjian;
/**
 * 分苹果
 * 描述:	小明准备把M个同样的苹果分在N个同样的篮子里，允许有的篮子空着不放，那么一共有多少种不同的分法呢？
 * 说明：3，1，1和1，3，1 是同一种分法。
 * 输入:	每个用例包含二个整数M和N。0<=M<=10，1<=N<=10。
 * 输出:	一个整数K，表示一共有K种分苹果的方法。
 * 样例输入:	7 3
 * 样例输出:	8
 * 
 */



import java.util.Scanner;

// 这个是网上的答案 我暂时没看懂

public class Ex2Apple {
	public int count=0;
	public static Scanner in = new Scanner(System.in);
	public void printArr(int dishNum, int [] arr){
		// 代表一个篮子中苹果的数量
		int appleCount = 0;
	    for (int i = 0; i < dishNum; i++){
	    	// 每次初始化为0
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
	
	// m代表苹果数量， n代表篮子数量
	public static void main(String[] args) {
		Ex2Apple app = new Ex2Apple();
		int M, N;
		 System.out.println("请输入苹果数量");
		 M = in.nextInt();
		 System.out.println("请输入篮子数量");
		 N = in.nextInt();
		 int [] a = new int[N];
		 app.allocation(M, N, 0, a);
		 System.out.println(app.count);
	}
	
}
