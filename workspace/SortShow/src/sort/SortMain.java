package sort;

import java.util.Arrays;

public class SortMain {
	public static void main(String[] args) {
		
		for (int i = 5;i>0;i--) {
			for(int j=0; j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		int a[] = {3343,65,662,12,1343,1232342,413,452};
		int b[] = Arrays.copyOf(a, a.length);
		
		System.out.println("��������a�ĳ�ʼֵ");
		System.out.println(Arrays.toString(a));
		// �ڲ�ѭ��ÿ��ȡ�����ֵ
		// �����һֱ���������
		int tmp = 0;
		// ����length-1�� ����������ཻ��length-1��
		for(int i=0; i<a.length -1; i++) {
			
			if(a[i+1] < a[i]){
				tmp = a[i+1];
				a[i+1] = a[i];
				a[i] = tmp;
			}
		}
		System.out.println("���Ǿ���һ�ν����ֵ�Ƶ����һλ�Ľ��");
		System.out.println("���ַ�ʽ����һ��ð��");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length -2; i++) {
			
			if(a[i+1] < a[i]){
				tmp = a[i+1];
				a[i+1] = a[i];
				a[i] = tmp;
			}
		}
		System.out.println("���Ǿ������ν����ֵ�Ƶ����һλ�������Ѿ������һλ���Ľ��");
		System.out.println("���ַ�ʽ��������ð��");
		System.out.println(Arrays.toString(a));
		System.out.println("���ǳ�ʼ�����ֵ");
		System.out.println(Arrays.toString(b));
		
		// �״�ѭ��length-1�Σ�i>0���һ��ѭ��һ��
		for (int i = b.length-1; i>0; i--) {
			for(int j=0; j<i;j++){
				if(b[j+1] < b[j]){
					tmp = b[j+1];
					b[j+1] = b[j];
					b[j] = tmp;
				}
			}
		}
		System.out.println("����ð�������Ľ��");
		System.out.println(Arrays.toString(b));
		
	}
}
