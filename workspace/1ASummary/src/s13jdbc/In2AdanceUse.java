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

public class In2AdanceUse {
	private String jdbcConfFile;
	private String jdbcLib;
	private String subprotocol;
	private String host;
	private String port;
	private String subname;
	private String url;
	private String user;
	private String pwd;

	public In2AdanceUse(String jdbcConfFile){
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
	/**
	 * ��̬��ѯ
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
	 * ��ǿ��ѯ
	 * 
	 * 
	 */
	
	public void dynamicCallSql(){
//		��ѯidΪ101��Ա�������͹��ʣ� ����ֵΪ������ �����ڶ��������ǹ���
//		��{} ��call
		String sql = "{? = call getEm(?,?,?)}";
		Connection conn = getConn();
		try {
			CallableStatement prc = conn.prepareCall(sql);
			prc.registerOutParameter(1, OracleTypes.CURSOR);
			prc.setInt(2, 10);
			prc.registerOutParameter(3, OracleTypes.NUMBER);
			prc.registerOutParameter(4, OracleTypes.NUMBER);
			prc.execute();
			
			ResultSet rs = (ResultSet)prc.getObject(1);
			while(rs.next()){
				System.out.println(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	���ǰ��Ҫ��{}��
	public void dynamicCallSql1(){
		String sql = "{? = call getMaxMinEmp1(?)}";
		Connection conn = getConn();
		if(conn == null){
			System.out.println("���ݿ�����ʧ��");
			return;
		}
		try {
			CallableStatement pc = conn.prepareCall(sql);
			pc.registerOutParameter(1, OracleTypes.CURSOR);
			pc.registerOutParameter(2, OracleTypes.VARCHAR);
			boolean ex = pc.execute();
			System.out.println(ex);
//			if(!ex){
//				System.out.println("ִ��sql������");
//				System.out.println("������Ϣ�ǣ�" +pc.getString(2));
//				return;
//			}
			String errStr = (String)pc.getObject(2);
			System.out.println(errStr);
			/**
			 * �����Է��������sql���ؿմ�������nullֵ��
			 * sql��''��null, sql��' '��" "
			 */
			int a = 20/0;
			if(errStr.equals(" ")){
				System.out.println("û�д����ʱ���ǿո�");
			}
			if(errStr!=null && !errStr.equals(" ")){
				System.out.println("����ִ�д�����Ϣ��" + errStr);
			}else {
				// ����ӳ��ע�ⷵ��ֵΪobjec��object����ģ���ͨ��ǿתתΪ����������
				ResultSet rs = (ResultSet)pc.getObject(1);
				if (rs == null) {
					System.out.println("û�в鵽���");
				}else {
					System.out.println("������Ϣ" + pc.getObject(2)+"zzz");
					System.out.println("Ա����ţ�\tԱ��������\tԱ���쵼��ţ�\t"
							+ "��Ӷ���ڣ�\t��н��\t����\t���ű�ţ�");
					while(rs.next()){
						System.out.println(rs.getInt(1)+"\t"
								+  rs.getString(2) + "\t"
								+  rs.getString(3) + "\t"
								+  rs.getInt(4) + "\t"
								+  rs.getDate(5) + "\t"
								+  rs.getDouble(6) + "\t"
								+  rs.getDouble(7) + "\t"
								+  + rs.getInt(8));
					}
				}
				rs.close();
				pc.close();
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		In2AdanceUse store = new In2AdanceUse("src/s13jdbc/dbConf.properties");
//		store.dynamicSql();
//		store.dynamicCallSql();
		store.dynamicCallSql1();
	}
}
