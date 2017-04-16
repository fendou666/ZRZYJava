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
		System.out.println("删减后的数组为：");
		for (int x:  newArray) {
			System.out.print(x+", ");
		}
		System.out.println();
//		以下代表删除第3位，从第0开始
//		经测试System.arraycopy如果copy数值不够(length<destPos到dest的length长度)，就会以最后一位值进行赋值
		System.arraycopy(array, 4, newArray, 3, array.length-4);
		for (int x:  newArray) {
			System.out.print(x+", ");
		}
		System.out.println("后面复制了：" + (array.length-5));
		System.out.println(newArray.length);
		
	}
	
	public static void main(String[] args) {
		int [] array = {23,41,512,51,51,1,3,11,5,6112,33};
		System.out.println("原数组长度" +array.length);
		array = arrayAdd(array);
		for (int x:  array) {
			System.out.print(x+ ", ");
		}
		System.out.println("添加后数组长度" + array.length);
		arrayRemove(array);
	}
	
	
}
