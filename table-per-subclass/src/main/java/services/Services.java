package services;

import org.hibernate.Session;

import model.Employee;
import util.HibernateUtil;

public class Services {

	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
	}
}
