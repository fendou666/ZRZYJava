package s13jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.util.Properties;

import oracle.jdbc.internal.OracleTypes;

public class In2Adance {
	private String jdbcConfFile;
	private String jdbcLib;
	private String subprotocol;
	private String host;
	private String port;
	private String subname;
	private String url;
	private String user;
	private String pwd;

	public In2Adance(String jdbcConfFile){
		this.jdbcConfFile = jdbcConfFile; 
		getJdbcConfFromPro();
	}
	
	public void getJdbcConfFromPro(){
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream(jdbcConfFile));
			jdbcLib = pro.getProperty("jdbcLib");
			subprotocol = pro.getProperty("subprotocol");
			host = pro.getProperty("host");
			port = pro.getProperty("port");
			user = pro.getProperty("user");
			pwd = pro.getProperty("pwd");
			
			subname = "@" + host + ":" + port +":orcl";
			url = "jdbc" + ":" + subprotocol + ":" + subname;
//			1. 加载驱动，只需要加载一次就可以了
			Class.forName(jdbcLib);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public  Connection getConn(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(conn);
		return conn;
	}
	/**
	 * 动态查询
	 * 
	 * 
	 */
	public void dynamicSql(){
		String sql = "SELECT salary FROM employees WHERE employee_id = ?";
		Connection conn = getConn();
		PreparedStatement psmt;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 100);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getDouble(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 更强查询
	 * 
	 * 
	 */
	
	public void dynamicCallSql(){
//		查询id为101的员工姓名和工资， 返回值为姓名， 函数第二个参数是工资
//		加{} 加call
		String sql = "{? = call getCount(?,?)}";
		Connection conn = getConn();
		try {
			CallableStatement prc = conn.prepareCall(sql);
			prc.registerOutParameter(1, OracleTypes.VARCHAR);
			prc.setInt(2, 101);
			prc.registerOutParameter(3, OracleTypes.NUMBER);
			
			prc.execute();
			System.out.println(prc.getString(1));
			System.out.println(prc.getDouble(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		In2Adance store = new In2Adance("src/s13jdbc/dbConf.properties");
//		store.dynamicSql();
		store.dynamicCallSql();
	}
}
