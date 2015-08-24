package com.cmproject.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private final static SessionFactory session = buildSessionFactory();

	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
			
		} catch (Throwable e) {
			System.out.println("DEU PAU!!!!!\n" + e);
			throw new ExceptionInInitializerError();
		}
		
	}

	public static SessionFactory getSession() {
		return session;
	}

}
