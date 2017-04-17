package S9Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class A1ArrayList {
	private Iterator<Apple> iterator;

	public void showApples(List<Apple> apples){
		iterator = apples.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		A1ArrayList A1 = new A1ArrayList();
		
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple(2.333, 12.33));
		apples.add(new Apple(1.23, 23.47));
		apples.add(new Apple(1.23, 5.123));
		apples.add(new Apple(1.23, 33.1));
		apples.add(new Apple(5.18, 10.789));
		apples.add(new Apple(2.783, 13.78));
		apples.add(new Apple(8.0, 5.987));

//		1. ֤���������
		A1.showApples(apples);
//		2. ֤��������nullֵ
		apples.add(null);
		A1.showApples(apples);
//		3. ��������
		apples.sort(new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				int rec = 0;
				if(o1.size>o2.size){
					rec = 1;
				}else if (o1.size==o2.size){ 
					if (!(o1.weigth==o2.weigth)){
						rec = (o1.weigth-o2.weigth)>0?1:-1;
					}
				}else if (o1.size<o2.size) {
					rec = -1;
				}
				return rec;
			}
			
		});
//		4. equals��д
		
	}
	
}

class Apple{
	double size;
	double weigth;
	public Apple() {
		
	}
	public Apple(double size, double weigth) {
		super();
		this.size = size;
		this.weigth = weigth;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	@Override
	public String toString() {
		return "Apple [size=" + size + ", weigth=" + weigth + "]";
	}
}