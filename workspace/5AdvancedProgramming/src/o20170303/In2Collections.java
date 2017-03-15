package o20170303;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class In2Collections {
	public static void main(String[] args) {
		In11Student s1 = new In11Student("小明", 222);
		In11Student s2 = new In11Student("小明", 22);
		In11Student s3 = new In11Student("小明", 212);
		In11Student s4 = new In11Student("小明", 52);
		In11Student s5 = new In11Student("小明", 55);
		
		List<In11Student> list = new ArrayList<In11Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Collections.sort(list<In11Student>);
		
		for (In11Student s: list) {
			System.out.println(s);
		}
	}
}
