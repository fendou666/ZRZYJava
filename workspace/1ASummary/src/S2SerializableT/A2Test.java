
package S2SerializableT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class A2Test {
	public void writeObj() throws Exception{
		ObjectOutputStream objops = new ObjectOutputStream(
				new FileOutputStream("src/SerializableT/TestAll.txt"));
		objops.writeObject("开始写入对象");
		objops.writeDouble(222.222);
		objops.writeChars("写入字符数组，形参是String");
		objops.writeObject(new A2BasicClass(
				"西安", new Date(), 100.3,
				134.3
				));
		objops.writeObject(new A2BasicClass(
				"北京", new Date(), 88.3,
				234.3
				));
		objops.writeObject(new A2BasicClass(
				"石家庄", new Date(), 139.3,
				125.3
				));
		objops.writeChars("写完了");
		objops.close();
	}
	
	public void readObj() throws Exception{
		ObjectInputStream objips = new ObjectInputStream(
								new FileInputStream("src/SerializableT/TestAll.txt")
				);
//		按写入顺序读出
		System.out.println(objips.readObject());
		System.out.println(objips.readDouble());
		for(int i=0;i<"写入字符数组，形参是String".length();i++){
			System.out.print(objips.readChar());
		}
		System.out.println();
		System.out.println(objips.readObject());
		System.out.println(objips.readObject());
		System.out.println(objips.readObject());
		for(int i=0;i<"写完了".length();i++){
			System.out.print(objips.readChar());
		}
		objips.close();
		
	}
	
	public static void main(String[] args) {
		A2Test A2 = new A2Test();
		try {
			A2.writeObj();
			A2.readObj();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
