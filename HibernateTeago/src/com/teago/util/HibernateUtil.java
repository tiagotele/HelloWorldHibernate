package com.teago.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.teago.model.ModeloGenericoTeste;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure()
					.addPackage("com.teago.model.ModleGenericoTeste")
					.addAnnotatedClass(ModeloGenericoTeste.class).buildSessionFactory();
		} catch (Exception e) {
			System.err.println("Erro na criação do SessionFactory");
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
