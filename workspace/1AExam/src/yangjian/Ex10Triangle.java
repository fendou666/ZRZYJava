package yangjian;
/**
 * ��Բ����Ч����
 * �������һ��Բ�ϰ���N���㣬�������������ӣ���������ܽ�Բ���ֳɶ��ٸ��������������������ı䲻��Բ����
 * 
 * ��������3
 * ����1
 * ͨ��������֪���൱������3���γ�һ����Ч����
 */
import java.util.Scanner;

public class Ex10Triangle {
	public static Scanner in = new Scanner(System.in);
	public static int getAreaCount(int n){
		int sum = 0;
		int countBegin = n-2;
		// ����Ҫ������
		if(countBegin<1){
			return sum;
		}
		// ����ÿ�������γ�һ����Ч���򣬱���6����   �൱�� 4+3+2+1
		//�������Լ���ͼ��һ�£����������γ�һ������
		// ���㷽ʽ��1+n-2��*(n-2)/2  �൱�ڼ���Ȳ�����
		for(int i=1; i<=countBegin; i++){
			sum+= (1+i)*i/2;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("������Բ�ϵĵ���");
		int n = in.nextInt();
		int sum = getAreaCount(n);
		System.out.println("Բ����Ч������" + sum);
	}
}
