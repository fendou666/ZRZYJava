package com.orcle.J20170330;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class In1StudentDao extends In1BaseDao {
	public List<In1Student> selectStudent() throws Exception{
		ResultSet sSet = null;
		ArrayList<In1Student> stuAry = new ArrayList<In1Student>();
		String sql = "SELECT * FROM studentJdba";
		Connection conn = this.getConnection();
		sSet = this.select(conn, sql);
		
		ResultSetMetaData rsmd = sSet.getMetaData();
		for(int i=1;i<=rsmd.getColumnCount();i++){
			System.out.println("列名："+ rsmd.getColumnName(i)
					+ "  列Type：" + rsmd.getColumnType(i)
					+ "  列TypeName：" + rsmd.getColumnTypeName(i)
					+ "  列ClassName：" + rsmd.getColumnClassName(i)
					+ "  列Lable：" + rsmd.getColumnLabel(i)
					+ "  列DisplaySize：" + rsmd.getColumnDisplaySize(i)
					);
		}
		String type = rsmd.getColumnClassName(1);
		String tt = type.substring(type.lastIndexOf('.')+1);
		System.out.println(tt);
		
		In1Student s =null;
		while(sSet.next()){
			s = new In1Student(sSet.getInt(1), sSet.getString(2), 
					sSet.getString(4), sSet.getString(4));
			stuAry.add(s);
		}
		this.closeConnection(conn);
		return stuAry;
	}
	public int insterStudent(In1Student s) throws Exception{
		
		String sql = "INSERT INTO studentJdba VALUES("
				+ s.getStuid()
				+ ",'" + s.getName()
				+ "','" + s.getSex()
				+ "','" + s.getClassName()
				+ "')";
		System.out.println(sql);
		Connection conn = this.getConnection();
		int count = this.update(conn, sql);
		this.closeConnection(conn);
		return count;
	}
	
	public int updateStudent(In1Student s) throws Exception{
		String sql = "UPDATE studentJdba SET stuid="+s.getStuid()
				+ ", name='" + s.getName()
				+ "', sex='" + s.getSex()
				+ "', className='" + s.getClassName()
				+ "' WHERE stuid="+ s.getStuid();
		System.out.println(sql);
		Connection conn = this.getConnection();
		int count = this.update(conn, sql);
		this.closeConnection(conn);
		return count;
	}
	public int deleteStudent(In1Student s) throws Exception{
		
		String sql = "DELETE FROM studentJdba WHERE stuid="+s.getStuid();
		System.out.println(sql);
		Connection conn = this.getConnection();
		int count = this.update(conn, sql);
		this.closeConnection(conn);
		return count;
	}
	
}
