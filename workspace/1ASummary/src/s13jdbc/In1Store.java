package s13jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class In1Store {
	private String jdbcConfFile;
	private String jdbcLib;
	private String subprotocol;
	private String host;
	private String port;
	private String subname;
	private String url;
	private String user;
	private String pwd;
	
//	subprotocol=oracle:thin
//	subname=@localhost:port:orcl
//	url = jdbc:+subprotocol:+subname
	
	public In1Store(String jdbcConfFile){
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
//			1. ����������ֻ��Ҫ����һ�ξͿ�����
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
	
	public void closeConn(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
//	������ѯ���
	public ResultSet queryData(Connection conn, String sql){
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
//	����DML���
	public int update(Connection conn, String sql){
		int rs= 0;
		try {
			Statement st = conn.createStatement();
			rs = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
//	������ɾ�Ĳ�����
	public boolean executeOthers(Connection conn, String sql){
		boolean rs = false;
		
		try {
			Statement st = conn.createStatement();
			rs = st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
//	��ѯ����
	public void testQuery(){
		Connection conn = getConn();
		String sql = "SELECT id, name, sex FROM student";
		ResultSet rs = queryData(conn, sql);
		
		try {
			while(rs.next()){
				System.out.print(rs.getInt(1));
				System.out.print("\t");
				System.out.print(rs.getString(2));
				System.out.print("\t");
				System.out.print(rs.getString(2));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	��������sql���
	public void testUpdate(){
		
	}
	
	public void testOthers(){
		
	}
	
	public static void main(String[] args) {
		In1Store store = new In1Store("src/s13jdbc/dbConf.properties");
		store.testQuery();
	}
}
