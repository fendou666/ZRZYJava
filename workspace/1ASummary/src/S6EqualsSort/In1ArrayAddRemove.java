package S6EqualsSort;

import java.util.Arrays;

public class In1ArrayAddRemove {

	public static int [] arrayAdd(int [] array){
		int [] newArray = Arrays.copyOf(array, array.length+1);
		newArray[newArray.length-1] = 10;
		return newArray;
	}
	public static void arrayRemove(int [] array){
		int [] newArray = Arrays.copyOf(array, array.length-1);
		System.out.println("ɾ���������Ϊ��");
		for (int x:  newArray) {
			System.out.print(x+", ");
		}
		System.out.println();
//		���´���ɾ����3λ���ӵ�0��ʼ
<<<<<<< HEAD
//		������System.arraycopy���copy��ֵ����(length<destPos��dest��length����)���ͻ������һλֵ���и�ֵ
=======
>>>>>>> d27df023f555731136d65b63813f31fa0d52d02f
		System.arraycopy(array, 4, newArray, 3, array.length-4);
		for (int x:  newArray) {
			System.out.print(x+", ");
		}
		System.out.println("���渴���ˣ�" + (array.length-5));
		System.out.println(newArray.length);
		
	}
	
	public static void main(String[] args) {
		int [] array = {23,41,512,51,51,1,3,11,5,6112,33};
		System.out.println("ԭ���鳤��" +array.length);
		array = arrayAdd(array);
		for (int x:  array) {
			System.out.print(x+ ", ");
		}
		System.out.println("���Ӻ����鳤��" + array.length);
		arrayRemove(array);
	}
	
	
}