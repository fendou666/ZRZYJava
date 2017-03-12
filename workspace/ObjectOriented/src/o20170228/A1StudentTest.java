package o20170228;

/*
 * 
3. 编写学生类，重写equals方法，通过学生的属性值来判断学生对象是否相同。
4. 编写学生类，重写学生类的toString方法返回学生的基本信息和 
 equals方法通过学生的信息比较学生是否相同。
  创建学生对象数组，将创建的学生对象存放在学生数组中。
  存放学生对象的判断学生数组是否已存在，如果存在不进行存储，  
  如果不存在可以存储。最后将数组中所有学生对象打印。
 * 
 * 
 * 
 */


public class A1StudentTest {
	
	public static boolean add(A1Student s) {
		if (num< 5) {
				
			for (int i=0; i!=0 && i<=num; i++) {
				if (sa[i].getName().equals(s.getName())) {
					System.out.println("学生已经存在");
					return false;
				}
					
			}
			
			sa[num] = s;
			num++;
			return true;
			
		}
		System.out.println("数组已经满了");
		return false;
		
		
	}
	
	
	public static void main(String[] args) {
		A1Student [] sa = new A1Student[5];
		int num = 0;
		System.out.println(num);
		
		A1Student s1 = new A1Student("呵呵", 21);
		A1Student s2 = new A1Student("嘿嘿", 31);
		A1Student s3 = new A1Student("哈哈", 11);
		A1Student s4 = new A1Student("恩恩", 15);
		A1Student s5 = new A1Student("呃呃", 23);
		
		
	}
}
