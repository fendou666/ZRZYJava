package o20170303;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectTest {

	public static void main(String[] args) {
		ObjectBase student1 = new ObjectBase(11, "���꼶(��)��", "������");
		ObjectBase student2 = new ObjectBase(12, "���꼶(��)��", "������");
		ObjectBase student3 = new ObjectBase(13, "���꼶(��)��", "������");
		ObjectBase student4 = new ObjectBase(14, "���꼶(��)��", "������");
		ObjectBase student5 = new ObjectBase(15, "���꼶(��)��", "������");
		
		ArrayList<ObjectBase> objAry = new ArrayList<ObjectBase>();
		
		objAry.add(student1);
		objAry.add(student2);
		objAry.add(student3);
		objAry.add(student4);
		objAry.add(student5);
		
		ObjectFile<ObjectBase> fileO = new ObjectFile<ObjectBase>("src/student.txt");
		
		fileO.writerFile(objAry);
		
		ArrayList<ObjectBase> objRead = new ArrayList<ObjectBase>();
		objRead = fileO.queryData();
		Iterator<ObjectBase> aa = objRead.iterator();
		while(aa.hasNext()){
			ObjectBase product = aa.next();
			System.out.println(product);
		}
		
	}
	
}