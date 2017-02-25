package com.framgia.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.framgia.model.User;
import com.framgia.persist.UserHome;
import com.framgia.util.HibernateUtil;

@Component
public class UserDaoImpl implements UserDao {

	private static final Log log = LogFactory.getLog(UserHome.class);

	@Autowired
	private HibernateUtil sessionFactory;

	@Override
	public List<User> findAllUser() {
		log.debug("finding All User instance :");
		try {
			List<User> results = (List<User>) sessionFactory.getCurrentSession().createQuery("from User").list();
			log.debug("find all users successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by users failed", re);
			throw re;
		}

	}

	@Override
	public User findUSerById(int id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) sessionFactory.getCurrentSession().get(User.class, id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	@Override
	public User findUserByInstance(User obj){
		log.debug("merging User instance");
		try {
			User result = (User) sessionFactory.getCurrentSession().merge(obj);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	@Override
	public void addUser(User user) {
		log.debug("persisting User instance");
		try {
			sessionFactory.getCurrentSession().persist(user);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	@Override
	public void editUser(User user) {
		log.debug("update User instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}

	}

	@Override
	public void deleteUser(User user) {
		log.debug("deleting User instance: ");
		try {
			sessionFactory.getCurrentSession().delete(user);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}

	}

}
