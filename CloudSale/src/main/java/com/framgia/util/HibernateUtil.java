package com.framgia.util;

import javax.inject.Inject;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtil {

	@Inject
	private SessionFactory sessionFactory;
	
	public Session getCurrentSession(){
		Session session = null;
		try{
			session = this.sessionFactory.getCurrentSession();
		}
		catch(HibernateException hex){
			session = this.sessionFactory.openSession();
		}
		return session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
