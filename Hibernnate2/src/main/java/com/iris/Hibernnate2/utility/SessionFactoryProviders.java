package com.iris.Hibernnate2.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProviders {

	
	private static SessionFactory sf=null;
	static
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		
	}
	public static SessionFactory getSF()
	{
		return sf;
	}
}
