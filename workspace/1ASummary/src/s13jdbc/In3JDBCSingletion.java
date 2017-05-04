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

public class In3JDBCSingletion {
	
	
	private static String url;
	private static String user;
	private static String pwd;
	private static String driver;
	private static Connection conn;
	
	private static In3JDBCSingletion jdbcS;
	private In3JDBCSingletion(){
		initInfo();
		getConn();
	}
	public static In3JDBCSingletion getJdbcS(){
		if(jdbcS == null){
			jdbcS = new In3JDBCSingletion();
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
//	增加
	public static int add(String sql){
		int rec = 0;
		if (conn==null){
			conn = getConn();
		}
		try {
			Statement cs = conn.createStatement();
			cs.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rec;
	}
//	删除
	public static int del(String sql){
		int rec = 0;
		if (conn==null){
			conn = getConn();
		}
		try {
			Statement cs = conn.createStatement();
			cs.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rec;
	}
//	修改
	public static int upd(String sql){
		int rec = 0;
		if (conn==null){
			conn = getConn();
		}
		try {
			Statement cs = conn.createStatement();
			cs.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rec;
	}
//	查询
	public static ResultSet query(String sql){
		ResultSet rs = null;
		if (conn==null){
			conn = getConn();
		}else {
			try {
				Statement cs = conn.createStatement();
				rs = cs.executeQuery(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	
//	动态查询

	
//	函数过程
	public static void updProcedureInfo(){
		if (conn==null){
			conn = getConn();
		}else {
			String sql = "{call sal_upd_pacg.getNewSal(?,?)}";
					
			try {
//				TODO 关于传入参数是String类型的值
				CallableStatement pc = conn.prepareCall(sql);
				pc.registerOutParameter(1, OracleTypes.CURSOR);
				pc.registerOutParameter(2, OracleTypes.VARCHAR);
				pc.execute();
				String errInfo = (String)pc.getObject(2);
				if (errInfo==null || errInfo.equals("")) {
					ResultSet rs = (ResultSet)pc.getObject(1);
					System.out.println("部门编号\t部门名称\t员工编号\t员工姓名\t旧工资\t新工资");
					while(rs.next()){
						System.out.print(rs.getInt(1)+"\t");
						System.out.print(rs.getString(2)+"\t");
						System.out.print(rs.getInt(3)+"\t");
						System.out.print(rs.getString(4)+"\t");
						System.out.print(rs.getDouble(5)+"\t");
						System.out.print(rs.getDouble(6)+"\t");
						System.out.println();
						String sqlupd = "update emp set sal=" + rs.getDouble(6) 
								+ " WHERE empno="+ rs.getInt(3);
						upd(sqlupd);
					}
					rs.close();
					
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
		In3JDBCSingletion jdbcs = In3JDBCSingletion.getJdbcS();
		jdbcs.updProcedureInfo();
	}
	
	
	
}
