package com.orcle.J20170330;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class O1GetTableDao<T> extends O1BaseDao {
	
	public List<T> selectData() throws Exception{
		T e = null;
		ArrayList<T> aryL = new ArrayList<T>();
		Connection conn = this.getConnection("localhost");
		String sql = "SELECT * FROM EMPLOYEES";
		ResultSet rs = this.select(conn, sql);
		rs.
		
		while(rs.next()){
//			e = new O1Emplyee(rs.getInt(1), rs.getString(2), rs.getString(3), 
//					rs.getString(4), rs.getString(5), rs.getString(6), 
//					rs.getDouble(7), rs.getDouble(8), rs.getInt(9), rs.getInt(10))
//			aryL.add(e);
		}
		
		return aryL;
	}
	
	public int insertData(T t){
		
		return 1;
	}
	
	public int updateData(T t){
		
		return 1;
	}
	
	public int deleteData(T t){
		
		return 1;
	}
}
