package o20170303;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ObjectTest {

	public static void main(String[] args) {
//		ObjectBase student1 = new ObjectBase(11, "三年级(二)班", "王晓华");
//		ObjectBase student2 = new ObjectBase(12, "三年级(二)班", "王晓华");
//		ObjectBase student3 = new ObjectBase(13, "三年级(二)班", "王晓华");
//		ObjectBase student4 = new ObjectBase(14, "三年级(二)班", "王晓华");
//		ObjectBase student5 = new ObjectBase(15, "三年级(二)班", "王晓华");
//		
//		ArrayList<ObjectBase> objAry = new ArrayList<ObjectBase>();
//		
//		objAry.add(student1);
//		objAry.add(student2);
//		objAry.add(student3);
//		objAry.add(student4);
//		objAry.add(student5);
//		
//		ObjectFile<ObjectBase> fileO = new ObjectFile<ObjectBase>("src/student.txt");
//		
//		fileO.writerFile(objAry);
//		
//		ArrayList<ObjectBase> objRead = new ArrayList<ObjectBase>();
//		objRead = fileO.queryData();
//		Iterator<ObjectBase> aa = objRead.iterator();
//		while(aa.hasNext()){
//			ObjectBase product = aa.next();
//			System.out.println(product);
//		}
		
//		hashmap 测试
		
		
		ObjectBase student1 = new ObjectBase(11, "三年级(二)班", "王晓华");
		ObjectBase student2 = new ObjectBase(12, "三年级(二)班", "王晓华");
		ObjectBase student3 = new ObjectBase(13, "三年级(二)班", "王晓华");
		ObjectBase student4 = new ObjectBase(14, "三年级(二)班", "王晓华");
		ObjectBase student5 = new ObjectBase(15, "三年级(二)班", "王晓华");
		
		HashMap<String, ObjectBase> objAry = new HashMap<String, ObjectBase>();
		
		objAry.put("1", student1);
		objAry.put("2", student2);
		objAry.put("3", student3);
		objAry.put("4", student4);
		objAry.put("5", student5);
		
		HashMapStore<String, ObjectBase> fileO = new HashMapStore<String, ObjectBase>("src/hashMap.txt");
		
		fileO.writerFile(objAry);
		
		HashMap<String, ObjectBase> objRead = new HashMap<String, ObjectBase>();
		objRead = fileO.queryData();
		for(String m: objRead.keySet()){  
			System.out.println("name " + m + ":" + objRead.get(m));  
	   }  
		
		
	}
	
}
