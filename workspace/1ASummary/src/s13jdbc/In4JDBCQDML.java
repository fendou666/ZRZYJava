package s13jdbc;


import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.internal.OracleTypes;


/**
 * ����sqlproperties�ļ�������Ǵ���Ļ���ʲô���
 * ��ȥȫ����̬�𣿣���
 * @author Administrator
 *
 */

public class In4JDBCQDML {
	
	
	private static String url;
	private static String user;
	private static String pwd;
	private static String driver;
	private static Connection conn;
	
	private static In4JDBCQDML jdbcS;
	private In4JDBCQDML(){
		initInfo();
		getConn();
	}
	public static In4JDBCQDML getJdbcS(){
		if(jdbcS == null){
			jdbcS = new In4JDBCQDML();
		}
		return jdbcS;
	}
	private void initInfo(){
		 InputStream rs = this.getClass().getResourceAsStream("dbConf.properties");
		 Properties pro = new Properties();
		 try {
			pro.load(rs);
			this.driver = pro.getProperty("jdbcLib");
			String subprotocol = pro.getProperty("subprotocol");
			String host = pro.getProperty("host");
			String port = pro.getProperty("port");
			this.url = "jdbc:" + subprotocol + ":@" + host + ":" + port + ":orcl";
			this.user = pro.getProperty("user");
			this.pwd = pro.getProperty("pwd");
			System.out.println(url);
			System.out.println(user);
			System.out.println(pwd);
			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static Connection getConn(){
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
			conn = con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

//	��������
	public static void updProcedureInfo(){
		if (conn==null){
			conn = getConn();
		}else {
			String sql = "{call QDMLAA(?,?)}";
					
			try {
//				TODO ���ڴ��������String���͵�ֵ
				CallableStatement pc = conn.prepareCall(sql);
//				pc.setString(1, "INSERT INTO AA VALUES(17,'С��', '��')");
//				pc.setString(1, "UPDATE aa SET name='del' WHERE id=17");
//				pc.setString(1, "DELETE FROM AA WHERE id=17");
//				pc.setString(1, "SELECT * FROM aa WHERE id=17");
				pc.registerOutParameter(2, OracleTypes.VARCHAR);
				pc.execute();
				String errInfo = (String)pc.getObject(2);
				if (errInfo==null || errInfo.equals("")) {
					System.out.println(sql + "ִ�гɹ�");
				}else{
					System.out.println("������Ϣ:" + errInfo);
				}
				pc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		In4JDBCQDML jdbcs = In4JDBCQDML.getJdbcS();
		jdbcs.updProcedureInfo();
	}
	
	
	
}
