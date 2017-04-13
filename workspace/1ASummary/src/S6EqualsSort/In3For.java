package S6EqualsSort;

public class In3For {
//	循环牵扯时间复杂度， 自己百度
	
	
	public static void getdata(int [] t){
		for (int x: t) {
			System.out.print(x+", ");
		}
		System.out.println();
	}
//	1.冒泡排序3中 for, while, do...while
	public static void bubbingSort(int [] t){
//		for (int i=0; i<t.length; i++) {
//			for (int j=0; j<t.length-i-1;j++){
//				if (t[j]> t[j+1]) {
//					int tmp = t[j];
//					t[j] = t[j+1];
//					t[j+1] = tmp;
//				}
//			}
//		}
		int i = 0;
		do {
			int j=0;
			do{
				if (t[j]>t[j+1]) {
					int tmp = t[j];
					t[j] = t[j+1];
					t[j+1] = tmp;
				}
				j++;
			}while(j<t.length-i-1);
			i++;
		}while(i<t.length);
//		
//		i = 0;
//		while(i<t.length){
//			int j = 0;
//			while(j<t.length-i-1){
//				if (t[j]>t[j+1]){
//					int tmp = t[j];
//					t[j] = t[j+1];
//					t[j+1] = tmp;
//				}
//				j++;
//			}
//			i++;
//		}
		
	}
	
	
//	2. 快速排序
	
	
	
//	3. 插入排序
	public static void insertSort(int [] t){
		for (int i=0; i<t.length-1; i++) {
			for(int j=i+1; j<t.length; j++){
				if (t[i]>t[j]){
					int tmp = t[i];
					t[i] = t[j];
					t[j] = tmp;
				}
			}
		}
	}
	
	
	
//	其他排序研究
	
	public static void main(String[] args) {
		int [] testAry = {2,35,41,2,12,1,412,5,51,21,31,22,41,55};
//		bubbingSort(testAry);
		insertSort(testAry);
		getdata(testAry);
		
		for (String x: args) {
			System.out.println(x);
		}
	}
	
}
