package dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import entity.*;
import net.sf.json.JSONArray;

public class GetTempl {
	public static Session session;
	static{
		
	session=HibernateUtils.session;
	}
	

	public String getbyUserid(String userid)
	{
		List<Templ> templs =session.createQuery("from Templ where userid = ?").setParameter(0,userid).list();
		JSONArray jsont=JSONArray.fromObject(templs);
		return jsont.toString();
		
	}
	
	
	public String getbyTemplid(String templid)
	{
		
		@SuppressWarnings("unchecked")
		List<Templ> templs =session.createQuery("from Templ where templid = ?").setParameter(0,templid).list();
		JSONArray jsont=JSONArray.fromObject(templs);
		return jsont.toString();
	}
	
	public String getbyTemplid(String class1,String class2)
	{
		
		@SuppressWarnings("unchecked")
		List<Templ> templs =session.createQuery("from Templ where class1 = ? and class2= ?").setParameter(0,class1).setParameter(1, class2).list();
		JSONArray jsont=JSONArray.fromObject(templs);
		return jsont.toString();
	}
}












