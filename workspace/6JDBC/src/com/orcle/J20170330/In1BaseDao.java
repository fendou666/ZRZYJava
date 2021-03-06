package com.orcle.J20170330;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class In1BaseDao {
//	Java DataBase connectivity
//	JAVA API
	
//	1. 在开发环境中加载指定数据库的驱动程序
//	2. 在Java程序中加载驱动程序
	public Connection getConnection() throws Exception{
//		此处class大写
//		2:加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		3：创建数据库连接
//		URL:协议名+IP地址+端口号+数据库名称
//		DriverManager用来检查驱动程序是否可以建立连接
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
				+ "@localhost:1521:orcl", "scott","tiger");
//		万元
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//				+ "@175.3.13.29:1521:orcl", "scott","tiger");
//		向凯
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//				+ "@175.3.13.30:1521:orcl", "scott","tiger");
//		陈娟
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//		+ "@175.3.13.26:1521:orcl", "scott","tiger");
//		田晓博
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//				+ "@175.3.13.252:1521:orcl", "scott","tiger");
//		杨总
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
//		+ "@175.3.13.35:1521:orcl", "scott","tiger");
		return conn;
	}
	
//	4.数据操作
//	查询数据
	public ResultSet select(Connection conn, String sql) throws SQLException{
		ResultSet rs = null;
		if(conn!=null&&!conn.isClosed()){
//			4.1创建Statement对象
			Statement stm = conn.createStatement();
//			4.2调用Statement对象里面的方法执行相应的sql语句并返回它的结果
			rs = stm.executeQuery(sql);
		}
		return rs;
	}
//	增删改数据(DML) executeUpdate() 注意返回值为int
	public int update(Connection conn, String sql) throws SQLException{
		int resultCount = 0;
		if(conn!=null&!conn.isClosed()){
			Statement stm = conn.createStatement();
			stm.executeUpdate(sql);
		}
		return resultCount;
	}
	
//	5.关闭数据库
	public void closeConnection(Connection conn) throws SQLException{
		if(conn!=null && !conn.isClosed()){
			conn.close();
			conn = null;
			System.out.println("连接关闭");
		}
	}
	
}
