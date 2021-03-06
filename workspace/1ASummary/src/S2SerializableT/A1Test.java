package S2SerializableT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class A1Test {
	public void writeObj() throws Exception{
		ObjectOutputStream objops = new ObjectOutputStream(new FileOutputStream("src/SerializableT/testObj.txt"));
		BasicClass obj = new BasicClass(2,"123123");
		objops.writeObject(obj);
		objops.close();
	}
	public void readObj() throws Exception{
		ObjectInputStream objips = new ObjectInputStream(new FileInputStream("src/SerializableT/testObj.txt"));
		BasicClass objR = (BasicClass)objips.readObject();
		objips.close();
		System.out.println(objR);
	}
	
	
	public static void main(String[] args) {
		A1Test A1 = new A1Test();
		try {
			A1.writeObj();
			A1.readObj();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
