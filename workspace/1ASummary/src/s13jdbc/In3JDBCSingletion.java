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
//	����
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
//	ɾ��
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
//	�޸�
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
//	��ѯ
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
	
//	��̬��ѯ

	
//	��������
	public static void updProcedureInfo(){
		if (conn==null){
			conn = getConn();
		}else {
			String sql = "{call sal_upd_pacg.getNewSal(?,?)}";
					
			try {
//				TODO ���ڴ��������String���͵�ֵ
				CallableStatement pc = conn.prepareCall(sql);
				pc.registerOutParameter(1, OracleTypes.CURSOR);
				pc.registerOutParameter(2, OracleTypes.VARCHAR);
				pc.execute();
				String errInfo = (String)pc.getObject(2);
				if (errInfo==null || errInfo.equals("")) {
					ResultSet rs = (ResultSet)pc.getObject(1);
					System.out.println("���ű��\t��������\tԱ�����\tԱ������\t�ɹ���\t�¹���");
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
					System.out.println("������Ϣ:" + errInfo);
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
