package S9Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class A1ArrayList {
	private Iterator<Apple> iterator;
	private static List<Apple> apples = new ArrayList<Apple>();
	private Iterator<Apple> iterator2;
	
	public void showApples(List<Apple> apples){
		iterator = apples.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	/**
	 * ��������
	 * <p>����������</p>
	 * 
	 * @param addE
	 * 
	 * @return
	 * 
	 * @see ������������߷���
	 * 
	 * @exception �ᴦ����쳣��
	 * 			�쳣����
	 * @throw ���׳����쳣
	 * 
	 */
	public void addElement(Apple addE){
		System.out.println("���ArrayList");
		System.out.println("ǰsize: " + apples.size());
		apples.add(addE);
		System.out.println("��size: " + apples.size());
	}
	/**
	 * ��������ɾ��Ԫ��
	 * 
	 * @param delE Ҫɾ����Ԫ��
	 */
	public void delElement(Apple delE){
		System.out.println("ɾ��ArrayList");
		System.out.println("ǰsize: " + apples.size());
		apples.remove(delE);
		System.out.println("��size: " + apples.size());
	}
	/**
	 * ������������Ԫ��
	 * 
	 * @param updE Ҫ���µ�Ԫ��
	 */
	public void updElement(Apple updE){
		updE.size = 0.1;
	}
	/**
	 * �����������򣨵���Ĭ������
	 * 
	 * <p>
	 * ͨ��Collection.sort(); ����Ĭ������
	 * </p>
	 */
//	����Ĭ������
	public void sortElement1(){
		Collections.sort(apples);
	}
//	comparator����Ĭ������
	public void sortElement2(){
		Collections.sort(apples, new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				
				return o1.compareTo(o2);
			}
		});
	}
	public void sortElement3(){
		Collections.sort(apples, new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return 1;
			}
		});
	}
//	����Ĭ������
	public void listSort1(){
		apples.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.compareTo(o2);
			}
		});
	}
//	�Զ�������
	public void listSort2(){
		apples.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				int rec = 0;
				if(o1!=null&&o2!=null){
					rec = 0;
				}else if(o1!=null){
					rec = -1;
				}else if(o2!=null){
					rec = 1;
				}else{
					rec = 0;
					if(o1.size>o2.size){
						rec = 1;
					}else if (o1.size==o2.size){ 
						if (!(o1.weigth==o2.weigth)){
							rec = (o1.weigth-o2.weigth)>0?1:-1;
						}
					}else if (o1.size<o2.size) {
						rec = -1;
					}
				}
				return rec;
			}
		});
	}

	/**
	 * ��������������
	 * <p>δ��дequals��HashCode���������Ԫ��</p>
	 * <p>��дequals��HashCode�������������Ԫ��</p>
	 * <p>δ��дequals������</p>
	 * <p>��дequals������</p>
	 * <p>δ��дHashCode������</p>
	 * <p>��дHasHcode������</p>
	 * <p>
	 */
	public void testAdd(){
		Apple addE1 = new Apple(1.1, 2.2);
		Apple addE2 = new Apple(1.1, 2.2);
		addElement(addE1);
		addElement(addE2);
		showApples(apples);
	}
	/**
	 * ��������ɾ������[��equals��д��Ч]
	 * <p>δ��дequals��HashCode������ֻ��ɾ���Լ�</p>
	 * <p>��дequals��HashCode������ɾ��ֵ��ͬ��Ԫ��</p>
	 * <p>δ��дequals������ֻ��ɾ���Լ�</p>
	 * <p>��дequals������ɾ��ֵ��ͬ��Ԫ��</p>
	 * <p>δ��дHashCode������ֻ��ɾ���Լ�</p>
	 * <p>��дHasHcode������ֻ��ɾ���Լ�</p>
	 * <p>
	 */
	public void testDel(){
		Apple addE1 = new Apple(2.2, 3.3);
		Apple addE2 = new Apple(2.2, 3.3);
		apples.add(addE1);
		apples.add(addE2);
		delElement(addE1);
		delElement(addE1);
		showApples(apples);
	}
	/**
	 * �����������²���
	 * ���ڸ��²��������壬1.ֻ���¶����ֵ��2�����´���һ������ֵ����ӵ�ֵ��ͬ��Ȼ�����ѭ��List�е�ֵ�ڽ�������
	 * ���ڸ���һ���Ǹ���ĳ��ID�� ��������һ���Ƚ���ͬ�Ĺ��̣�a.equals(b)�Ĺ��̣��ҵ���ֵͬ�������Ƿ���д����ID
	 * <p>δ��дequals��HashCode������</p>
	 * <p>��дequals��HashCode������</p>
	 * <p>δ��дequals������</p>
	 * <p>��дequals������</p>
	 * <p>δ��дHashCode������</p>
	 * <p>��дHasHcode������</p>
	 * <p>
	 */
	public void testUpd(){
		Apple updE1 = new Apple(3.3, 4.4);
		Apple updE2 = new Apple(3.3, 4.4);
		apples.add(updE1);
		apples.add(updE2);
		updElement(updE1);
		System.out.println("���ĺ��ֵ");
		System.out.println(updE1);
		updElement(updE1);
		System.out.println("�ٴε��ø��º�");
		showApples(apples);
	}
	/**
	 * ��������������ɾ����equals��HashCode��ϵ
	 * 
	 */
	public void testEqualsHashCode(){
//		testAdd();
//		testDel();
		testUpd();
	}
	/**
	 * ���������������
	 * 
	 * 
	 * @param args
	 */
	public void testSort(){
//		sortElement1();
//		sortElement2();
//		sortElement3();
//		listSort1();
		listSort2();
	}
	public void basicTest(){
//		1. ֤���������
		showApples(apples);
//		2. ֤��������nullֵ
		apples.add(null);
		showApples(apples);
//		3. ��������
		listSort2();
	}
	public void otherTest(){
//		4. equals��д[û������]
		apples.add(new Apple(1.23, 33.1));
		showApples(apples);
//		5. HashCode��д
		Apple a = new Apple(11.1, 22.22);
		Apple b = new Apple(11.1, 22.22);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		if(a.equals(b)){
			System.out.println("equals��д�ɹ�");
		}
	}
	public static void main(String[] args) {
		A1ArrayList A1 = new A1ArrayList();
		apples.add(new Apple(2.333, 12.33));
		apples.add(new Apple(1.23, 23.47));
		apples.add(new Apple(1.23, 5.123));
		apples.add(new Apple(1.23, 33.1));
		apples.add(new Apple(5.18, 10.789));
		apples.add(new Apple(2.783, 13.78));
		apples.add(new Apple(8.0, 5.987));

//		6. compare��д
//		A1.testSort();
//		7. ������ɾ����equals��HashCode��ϵ
		A1.testEqualsHashCode();
	}
	
}

class Apple implements Comparable<Apple>{
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weigth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (Double.doubleToLongBits(size) != Double
				.doubleToLongBits(other.size))
			return false;
		if (Double.doubleToLongBits(weigth) != Double
				.doubleToLongBits(other.weigth))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Apple [size=" + size + ", weigth=" + weigth + "]";
	}
	@Override
	public int compareTo(Apple o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
