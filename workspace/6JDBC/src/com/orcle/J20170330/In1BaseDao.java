package com.orcle.J20170330;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class In1BaseDao {
//	Java DataBase connectivity
//	JAVA API
	
//	1. �ڿ��������м���ָ�����ݿ����������
//	2. ��Java�����м�����������
	public Connection getConnection() throws Exception{
//		�˴�class��д
//		2:��������
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		3���������ݿ�����
//		URL:Э����+IP��ַ+�˿ں�+���ݿ�����
//		DriverManager����������������Ƿ���Խ�������
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
				+ "@localhost:1521:orcl", "scott","tiger");
//		��Ԫ
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//				+ "@175.3.13.29:1521:orcl", "scott","tiger");
//		��
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//				+ "@175.3.13.30:1521:orcl", "scott","tiger");
//		�¾�
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//		+ "@175.3.13.26:1521:orcl", "scott","tiger");
//		������
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//				+ "@175.3.13.252:1521:orcl", "scott","tiger");
//		����
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//		+ "@175.3.13.35:1521:orcl", "scott","tiger");
		return conn;
	}
	
//	4.���ݲ���
//	��ѯ����
	public ResultSet select(Connection conn, String sql) throws SQLException{
		ResultSet rs = null;
		if(conn!=null&&!conn.isClosed()){
//			4.1����Statement����
			Statement stm = conn.createStatement();
//			4.2����Statement��������ķ���ִ����Ӧ��sql��䲢�������Ľ��
			rs = stm.executeQuery(sql);
		}
		return rs;
	}
//	��ɾ������(DML) executeUpdate() ע�ⷵ��ֵΪint
	public int update(Connection conn, String sql) throws SQLException{
		int resultCount = 0;
		if(conn!=null&!conn.isClosed()){
			Statement stm = conn.createStatement();
			stm.executeUpdate(sql);
		}
		return resultCount;
	}
	
//	5.�ر����ݿ�
	public void closeConnection(Connection conn) throws SQLException{
		if(conn!=null && !conn.isClosed()){
			conn.close();
			conn = null;
			System.out.println("���ӹر�");
		}
	}
	
}