package S3Sort;

public class SortAll {
	
	
	
	/**
	 * ð������
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
	 * ѡ��λ������
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
	 * ��������
	 * ��һ����¼���뵽������õ�������У��Ӷ��õ�һ���¼�¼����1�������
	 * @param ary
	 */
	public void insertSort(int [] ary){
		int tmp = 0;
		int j = 0;
		for (int i = 1; i < ary.length; i++) {
			
			if (ary[i]<ary[i-1]){
				tmp = ary[i];
				j = i-1;
				while(j>=0&&tmp<ary[j]){ //tmp�൱��j+1�� ������ֵһֱ���ƣ�ֱ������tmp��j����ߵ���j��ֵ��
					ary[j+1] = ary[j];
					j--;
				}
//				����j+1����Ϊ��һ��while��ѭ����jֵ��tmp��С��ֵ������tmp��j+1��λ��
				ary[j+1] = tmp;
			}
		}
	}
	/**
	 * ���������е�ϣ������ ���ȶ�
	 * 
	 * 
	 */
	
	
	
	/**
	 *��������
	 * 
	 * 
	 * @param ary
	 */
	
	public void quickSort(int [] ary){
		
		
	}
	
	
	
	/**
	 * �ȶ�����
	 */
	public void steadySort(){
		int [] aaa = {33,33,44,23,345};
		bubbleSort(aaa);	// ð������
		selectSort(aaa);	// ѡ������
		insertSort(aaa);	// ��������
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
