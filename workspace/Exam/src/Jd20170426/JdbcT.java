package Jd20170426;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcT {
	
	public Connection getConn(){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("java.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
