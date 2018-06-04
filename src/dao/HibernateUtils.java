package dao;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
	public static Session session;

	static{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
	}
}
