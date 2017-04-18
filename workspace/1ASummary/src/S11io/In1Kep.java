package S11io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class In1Kep {
	private ArrayList<Apple> kep = new ArrayList<Apple>();

	public void initKep(){
		Apple a = new Apple("aa", 1.1);
		Apple b = new Apple("bb", 1.1);
		Apple c = new Apple("cc", 1.1);
		Apple d = new Apple("dd", 1.1);
	}
	public static void storeFile(String FileName){
		try {
			ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream(new File(FileName)));
			ops.writeObject(kep);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void loadFile(String FileName){
		try {
			ObjectInputStream  oips = new ObjectInputStream(new FileInputStream(new File(FileName)));
			ArrayList<Apple> rops = (ArrayList<Apple>) oips.readObject();
			Iterator<Apple> iterator = rops.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String fileName = "./src/S11io/objFile.txt";
		storeFile(fileName);
		loadFile(fileName);
	}
	
}

class Apple{
	String name;
	double size;
	public Apple(String name, double size) {
		super();
		this.name = name;
		this.size = size;
	}
	
}
