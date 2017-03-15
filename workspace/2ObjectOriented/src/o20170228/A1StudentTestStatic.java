package o20170228;

public class A1StudentTestStatic {
	
	private int num = 0;
	private A1Student [] sa = new A1Student[5];
	
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
		A1StudentTestStatic ss = new A1StudentTestStatic();
		
		
		A1Student s1 = new A1Student("呵呵", 21);
		A1Student s2 = new A1Student("嘿嘿", 31);
		A1Student s3 = new A1Student("哈哈", 11);
		A1Student s4 = new A1Student("恩恩", 15);
		A1Student s5 = new A1Student("呃呃", 23);
		
		
	}
}
