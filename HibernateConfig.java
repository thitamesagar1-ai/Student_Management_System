package com.sms.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	private static SessionFactory sf = null;

	public static SessionFactory getSessionFactory() {

		if (sf == null) {

			Configuration cfg = new Configuration();

			cfg.configure();

			cfg.addAnnotatedClass(Student.class);

			sf = cfg.buildSessionFactory();
		}

		return sf;
	}

}
