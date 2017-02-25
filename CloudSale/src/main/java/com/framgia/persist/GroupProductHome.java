package com.framgia.persist;

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.framgia.model.GroupProduct;

import static org.hibernate.criterion.Example.create;

/**
 * @author toandk
 */
public class GroupProductHome {

	private static final Log log = LogFactory.getLog(GroupProductHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(GroupProduct transientInstance) {
		log.debug("persisting GroupProduct instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(GroupProduct instance) {
		log.debug("attaching dirty GroupProduct instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GroupProduct instance) {
		log.debug("attaching clean GroupProduct instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(GroupProduct persistentInstance) {
		log.debug("deleting GroupProduct instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GroupProduct merge(GroupProduct detachedInstance) {
		log.debug("merging GroupProduct instance");
		try {
			GroupProduct result = (GroupProduct) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GroupProduct findById(java.lang.Integer id) {
		log.debug("getting GroupProduct instance with id: " + id);
		try {
			GroupProduct instance = (GroupProduct) sessionFactory.getCurrentSession()
					.get("com.framgia.model.GroupProduct", id);
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

	public List<GroupProduct> findByExample(GroupProduct instance) {
		log.debug("finding GroupProduct instance by example");
		try {
			List<GroupProduct> results = (List<GroupProduct>) sessionFactory.getCurrentSession()
					.createCriteria("com.framgia.model.GroupProduct").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
