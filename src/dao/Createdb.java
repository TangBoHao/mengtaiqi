package dao;

import java.sql.*;

public class Createdb {
	static Connection conn=null;
	public static void getConn()
	{
		
		try{
			Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection("jdbc:sqlite:test.db");
		}catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
		}
		System.out.println("opened datdabase successfully");
	}
	
//	public static void main(String[] args)
//	{
//		getConn();
//		initData();
//		insertName();
//	}
	
	public static void init()
	{
		getConn();
		initData();
		insertName();
	}
	
	public static void initData()
	{
		Statement stmt=null;
		try{
			stmt=conn.createStatement();
			String sql="CREATE TABLE temclassify"
					+ "(ID INT PRIMARY KEY,"
					+ "con1 TEXT NOT NULL,"
					+ "con2 TEXT NOT NULL,"
					+ "con3 TEXT NOT NULL,"
					+ "con4 TEXT NOT NULL,"
					+ "con5 TEXT NOT NULL,"
					+ "con6 TEXT NOT NULL,"
					+ "con7 TEXT NOT NULL,"
					+ "con8 TEXT NOT NULL,"
					+ "con9 TEXT NOT NULL,"
					+ "con10 TEXT NOT NULL)";
			stmt.executeUpdate(sql);
			stmt.close();
		}catch(Exception e){
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			
		}
		
		System.out.println("table created sueccessfully");
	}
	
	public static void insertName()
	{
		int i=0;
		Statement stmt=null;
		try{
			stmt=conn.createStatement();
			for(i=0;i<=10;i++)
			{
				String sql="insert into temclassify(id,con1,con2,con3,con4,con5,con6,con7,con8,con9,con10)"
						+ "values("+i+",'notseted','notseted','notseted','notseted','notseted','notseted','notseted','notseted','notseted','notseted')";
				stmt.executeUpdate(sql);
			}
		}catch(Exception e){
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			
		}
		System.out.println("name set successfully");
		
	}
}














