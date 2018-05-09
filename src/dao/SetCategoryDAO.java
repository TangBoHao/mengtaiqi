package dao;

import java.sql.*;

public class SetCategoryDAO {



	public static void doSet(int n, int m, String category_name) {
		Connection conn=GetConn.getConn();
		try{
			Statement stmt=conn.createStatement();
			String sql="UPDATE temclassify set con"+m+" = '"+category_name+"' "
					+ "where id ="+n;
			System.out.println(sql);
			stmt.execute(sql);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
