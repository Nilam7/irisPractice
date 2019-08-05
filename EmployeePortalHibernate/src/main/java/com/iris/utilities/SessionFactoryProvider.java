package com.iris.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {

	
	private static SessionFactory sf=null;
	static
	{
		Configuration csf=new Configuration();
		csf.configure();
		sf=csf.buildSessionFactory();
		
	}
	public static SessionFactory getSf()
	{
		return sf;
	}
}

