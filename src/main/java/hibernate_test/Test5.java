package hibernate_test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate_test.Entity.Employee;


public class Test5 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class).buildSessionFactory();
		

		
	try {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		//Employee emp = session.get(Employee.class, 1);
		//session.delete(emp);
		
		session.createQuery("delete Employee where name = 'Oleg'").executeUpdate();
		
		
		
		session.getTransaction().commit();

		System.out.println("Done");

	}
		finally {	factory.close();
		}
	}
}
