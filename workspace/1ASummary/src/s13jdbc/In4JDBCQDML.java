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
 * 关于sqlproperties文件如果都是错误的会是什么情况
 * 必去全部静态吗？？？
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

//	函数过程
	public static void updProcedureInfo(){
		if (conn==null){
			conn = getConn();
		}else {
			String sql = "{call QDMLAA(?,?)}";
					
			try {
//				TODO 关于传入参数是String类型的值
				CallableStatement pc = conn.prepareCall(sql);
//				pc.setString(1, "INSERT INTO AA VALUES(17,'小李', '男')");
//				pc.setString(1, "UPDATE aa SET name='del' WHERE id=17");
//				pc.setString(1, "DELETE FROM AA WHERE id=17");
//				pc.setString(1, "SELECT * FROM aa WHERE id=17");
				pc.registerOutParameter(2, OracleTypes.VARCHAR);
				pc.execute();
				String errInfo = (String)pc.getObject(2);
				if (errInfo==null || errInfo.equals("")) {
					System.out.println(sql + "执行成功");
				}else{
					System.out.println("错误信息:" + errInfo);
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
