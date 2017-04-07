package S3Sort;

public class SortAll {
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
	
	
	
	public void printAry(int [] ary){
		for(int a: ary){
			System.out.print(a+", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SortAll sa = new SortAll();
		int [] ary = {23,42,2,12,4512,1,12,51,4,52};
		sa.bubbleSort(ary);
		sa.printAry(ary);
	}
}
