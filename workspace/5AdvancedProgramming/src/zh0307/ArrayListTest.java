package zh0307;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> st = new ArrayList<String>();
		st.add("aaa");
		st.add("bbb");
		st.add("ccc");
		st.add("ddd");
		
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
		
		st.remove(2);
		
		for (int i = 0; i < st.size(); i++) {
			System.out.println(i+ st.get(i));
		}
		
		
	}
}
