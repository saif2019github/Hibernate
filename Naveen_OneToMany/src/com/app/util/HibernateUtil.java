package com.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory sf;
	static {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSf()
	{
		return sf;
	}
	
}
