package S9Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * ��ʱ������
 * 
 * 
 * @author Administrator
 *
 */

public class A2LinkedList {
	private Iterator<Apple1> iterator;
	private static List<Apple1> Apple1s = new LinkedList<Apple1>();
	
	public void showApple1s(List<Apple1> Apple1s){
		iterator = Apple1s.iterator();
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
	public void addElement(Apple1 addE){
		System.out.println("���LinkedList");
		System.out.println("ǰsize: " + Apple1s.size());
		Apple1s.add(addE);
		System.out.println("��size: " + Apple1s.size());
	}
	/**
	 * ��������ɾ��Ԫ��
	 * 
	 * @param delE Ҫɾ����Ԫ��
	 */
	public void delElement(Apple1 delE){
		System.out.println("ɾ��LinkedList");
		System.out.println("ǰsize: " + Apple1s.size());
		Apple1s.remove(delE);
		System.out.println("��size: " + Apple1s.size());
	}
	/**
	 * ������������Ԫ��
	 * 
	 * @param updE Ҫ���µ�Ԫ��
	 */
	public void updElement(Apple1 updE){
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
		Collections.sort(Apple1s);
	}
//	comparator����Ĭ������
	public void sortElement2(){
		Collections.sort(Apple1s, new Comparator<Apple1>(){
			@Override
			public int compare(Apple1 o1, Apple1 o2) {
				
				return o1.compareTo(o2);
			}
		});
	}
	public void sortElement3(){
		Collections.sort(Apple1s, new Comparator<Apple1>(){

			@Override
			public int compare(Apple1 o1, Apple1 o2) {
				// TODO Auto-generated method stub
				return 1;
			}
		});
	}
//	����Ĭ������
	public void listSort1(){
		Apple1s.sort(new Comparator<Apple1>() {
			@Override
			public int compare(Apple1 o1, Apple1 o2) {
				return o1.compareTo(o2);
			}
		});
	}
//	�Զ�������
	public void listSort2(){
		Apple1s.sort(new Comparator<Apple1>() {
			@Override
			public int compare(Apple1 o1, Apple1 o2) {
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
		Apple1 addE1 = new Apple1(1.1, 2.2);
		Apple1 addE2 = new Apple1(1.1, 2.2);
		addElement(addE1);
		addElement(addE2);
		showApple1s(Apple1s);
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
		Apple1 addE1 = new Apple1(2.2, 3.3);
		Apple1 addE2 = new Apple1(2.2, 3.3);
		Apple1s.add(addE1);
		Apple1s.add(addE2);
		delElement(addE1);
		delElement(addE1);
		showApple1s(Apple1s);
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
		Apple1 updE1 = new Apple1(3.3, 4.4);
		Apple1 updE2 = new Apple1(3.3, 4.4);
		Apple1s.add(updE1);
		Apple1s.add(updE2);
		updElement(updE1);
		System.out.println("���ĺ��ֵ");
		System.out.println(updE1);
		updElement(updE1);
		System.out.println("�ٴε��ø��º�");
		showApple1s(Apple1s);
	}
	/**
	 * ��������������ɾ����equals��HashCode��ϵ
	 * 
	 */
	public void testEqualsHashCode(){
		testAdd();
//		testDel();
//		testUpd();
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
		showApple1s(Apple1s);
//		2. ֤��������nullֵ
		Apple1s.add(null);
		System.out.println("���nullֵ��");
		showApple1s(Apple1s);
//		3. ��������
		System.out.println("����ǰ");
		listSort2();
		System.out.println("�����");
		showApple1s(Apple1s);
	}
	public void otherTest(){
//		4. equals��д[û������]
		Apple1s.add(new Apple1(1.23, 33.1));
		showApple1s(Apple1s);
//		5. HashCode��д
		Apple1 a = new Apple1(11.1, 22.22);
		Apple1 b = new Apple1(11.1, 22.22);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		if(a.equals(b)){
			System.out.println("equals��д�ɹ�");
		}
	}
	public static void main(String[] args) {
		A2LinkedList A2 = new A2LinkedList();
		Apple1s.add(new Apple1(2.333, 12.33));
		Apple1s.add(new Apple1(1.23, 23.47));
		Apple1s.add(new Apple1(1.23, 5.123));
		Apple1s.add(new Apple1(1.23, 33.1));
		Apple1s.add(new Apple1(5.18, 10.789));
		Apple1s.add(new Apple1(2.783, 13.78));
		Apple1s.add(new Apple1(8.0, 5.987));
		A2.basicTest();
//		6. compare��д
//		A1.testSort();
//		7. ������ɾ����equals��HashCode��ϵ
//		A2.testEqualsHashCode();
	}
	
}

class Apple1 implements Comparable<Apple1>{
	double size;
	double weigth;
	public Apple1() {
		
	}
	public Apple1(double size, double weigth) {
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
		Apple1 other = (Apple1) obj;
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
		return "Apple1 [size=" + size + ", weigth=" + weigth + "]";
	}
	@Override
	public int compareTo(Apple1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
