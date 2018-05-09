package dao;

import java.sql.DriverManager;
import java.sql.*;

public class GetConn {
	static Connection conn=null;
	
	public static Connection getConn(){
		if(conn!=null)
		{
			return conn;
		}
		
		
		try{
			Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection("jdbc:sqlite:test.db");
			return conn;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
}
