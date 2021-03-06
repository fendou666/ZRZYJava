package com.orcle.J20170330;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class O1BaseDao {
	public Connection getConnection(String host) throws SQLException, ClassNotFoundException{
//		下面这句话可以不需要吗
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@"+host+":1521:orcl","scott","tiger");
		return conn;
	}
//	这里为什么每次都需要conn，是为了每次的用户调用，直接就commit数据库了
	public ResultSet select(Connection conn, String sql) throws SQLException{
		ResultSet rs = null;
		if(conn!=null && !conn.isClosed()){
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(sql);
		}
		return rs;
	}
	public int update(Connection conn, String sql) throws SQLException{
		int count = -1;
		if(conn!=null && !conn.isClosed()){
			Statement stm = conn.createStatement();
			return stm.executeUpdate(sql);
		}
		return count;
	}
	
	public void close(Connection conn) throws SQLException{
		if(conn!=null && !conn.isClosed()){
			conn.close();
			conn = null;
		}
	}
}
