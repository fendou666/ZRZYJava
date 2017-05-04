package S3Sort;

public class SortAll {
	
	
	
	/**
	 * 冒泡排序
	 * 
	 * @param ary
	 */
	public void bubbleSort(int [] ary){
		int tmp = 0;
		for (int i = 0; i < ary.length; i++) {
			
			for (int j = 0; j < ary.length-i-1; j++) {
				if (ary[j]<ary[j+1]){
					tmp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = tmp;
				}
			}
		}
	}
	
	/**
	 * 选择位置排序
	 * 
	 * @param ary
	 */
	
	public void selectSort(int [] ary){
		int tmp = 0;
		for (int i = 0; i < ary.length-1; i++) {
			for (int j = i+1; j < ary.length; j++) {
				if (ary[i]<ary[j]){
					tmp = ary[j];
					ary[j] = ary[i];
					ary[i] = tmp;
				}
			}
		}
	}
	/**
	 * 插入排序
	 * 将一个记录插入到已排序好的有序表中，从而得到一个新记录数增1的有序表
	 * @param ary
	 */
	public void insertSort(int [] ary){
		int tmp = 0;
		int j = 0;
		for (int i = 1; i < ary.length; i++) {
			
			if (ary[i]<ary[i-1]){
				tmp = ary[i];
				j = i-1;
				while(j>=0&&tmp<ary[j]){ //tmp相当于j+1， 将其余值一直右移，直到遇到tmp比j大或者等于j的值，
					ary[j+1] = ary[j];
					j--;
				}
//				这里j+1是因为上一步while会循环到j值比tmp还小的值，所以tmp在j+1的位置
				ary[j+1] = tmp;
			}
		}
	}
	/**
	 * 插入排序中的希尔排序 不稳定
	 * 
	 * 
	 */
	
	
	
	/**
	 *快速排序
	 * 
	 * 
	 * @param ary
	 */
	
	public void quickSort(int [] ary){
		
		
	}
	
	
	
	/**
	 * 稳定排序
	 */
	public void steadySort(){
		int [] aaa = {33,33,44,23,345};
		bubbleSort(aaa);	// 冒泡排序
		selectSort(aaa);	// 选择排序
		insertSort(aaa);	// 插入排序
	}
	
	
	public void printAry(int [] ary){
		for(int a: ary){
			System.out.print(a+", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SortAll sa = new SortAll();
		int [] ary = {23,42,2,12,4512,1,14,51,4,52};
//		sa.bubbleSort(ary);
//		sa.selectSort(ary);
		sa.insertSort(ary);
		sa.printAry(ary);
	}
}
