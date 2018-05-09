package dao;

import java.sql.*;

import net.sf.json.JSONArray;

public class GetCategoryDAO {
	String[] names;
	

	
	public String getNames(int i) throws SQLException
	{
		Connection conn=GetConn.getConn();
		Statement stmt=conn.createStatement();
		String sql="select * from temclassify "
				+ "where id ="+i;
		ResultSet rs=stmt.executeQuery(sql);
		names=new String[11];
		while(rs.next())
		{
			for(int j=0;j<11;j++)
			{
				names[j]=rs.getString(j+1);
			}
		}
		
		JSONArray jsonName=JSONArray.fromObject(names);
		return jsonName.toString();
		
	}
	
	
//	public static void main(String[] args)
//	{
//		GetCategoryDAO obj=new GetCategoryDAO();
//		try{
//			System.out.print(obj.getNames(1));
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//	}
	
}
