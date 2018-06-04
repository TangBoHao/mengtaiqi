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
		List<Templ> templs =session.createQuery("from Templ where templid = ?").setParameter(0,templid).list();
		JSONArray jsont=JSONArray.fromObject(templs);
		return jsont.toString();
	}
}












