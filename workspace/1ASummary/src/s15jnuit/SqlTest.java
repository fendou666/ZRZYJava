package s15jnuit;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.junit.Test;

import s13jdbc.In2AdanceUse;

public class SqlTest {

	@Test
	public void test() {
		try {
			System.setOut(new PrintStream(new File("F://test.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		In2AdanceUse store = new In2AdanceUse("src/s13jdbc/dbConf.properties");
		store.dynamicCallSql1();
	}

}
