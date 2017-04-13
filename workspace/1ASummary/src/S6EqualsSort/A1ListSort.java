package S6EqualsSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A1ListSort {
//	按重量排序
	public static void compareByWeight(List apples){
		apples.sort(new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
//				return (int)(o1.weight-o2.weight);
//				逆序
				return (int)(o2.weight-o1.weight);
			}
			
		});
	}
//	按大小排序
	public static void compareBySize(List apples){
		apples.sort(new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return (int)(o1.size - o2.size);
				
//				逆序
//				return (int)(o2.size - o1.size);
			}
			
		});
	}
//	按重量大小排序
	public static void compareByWeightAndSize(List apples){
		apples.sort(new Comparator<Apple>() {
			
			public String  compareString(double t){
				String s = "00000" + t + "0000";
				int index = s.indexOf('.');
				s = s.substring(index-5, index+5);
				return s;
			}
			
			@Override
			public int compare(Apple o1, Apple o2) {
				String str1 = compareString(o1.weight);
				str1 += compareString(o1.size);
				String str2 = compareString(o2.weight);
				str2 += compareString(o2.size);
				return str1.compareTo(str2);
//				逆序的话
//				return str2.compareTo(str1);
				
			}
		});
	}
	
	
	public static void all(List apples){
		apples.sort(new Comparator<Apple>() {
//			public <T> String  compareString(T t){
//			}
			
			public String  compareString(double t){
				String s = "00000" + t + "0000";
				int index = s.indexOf('.');
				s = s.substring(index-5, index+5);
				return s;
			}
			
			@Override
			public int compare(Apple o1, Apple o2) {
//				StringBuffer str1 = new StringBuffer();
//				StringBuffer str2 = new StringBuffer();
//				str1.append(compareString(o1.weight));
//				str1.append(compareString(o1.size));
//				str2.append(compareString(o2.weight));
//				str2.append(compareString(o2.size));
//				return (new String(str1)).compareTo(new String(str2));
				
				String str1 = compareString(o1.weight);
				str1 += compareString(o1.size);
				String str2 = compareString(o2.weight);
				str2 += compareString(o2.size);
				return str1.compareTo(str2);
//				逆序的话
//				return str2.compareTo(str1);
				
			}
		});
	}
	
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple(2.333, 12.33));
		apples.add(new Apple(1.23, 23.47));
		apples.add(new Apple(1.23, 5.123));
		apples.add(new Apple(1.23, 33.1));
		apples.add(new Apple(5.18, 10.789));
		apples.add(new Apple(2.783, 13.78));
		apples.add(new Apple(8.0, 5.987));
//		compareByWeight(apples);
//		compareBySize(apples);
		compareByWeightAndSize(apples);
//		all(apples);
		for (Apple a: apples) {
			System.out.println(a);
		}
		
	}
	
	
}

class Apple{
	double weight;
	double size;
	public Apple(){
		
	}
	public Apple(double weight, double size) {
		super();
		this.weight = weight;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Apple [重量=" + weight + ", 大小=" + size + "]";
	}
}
