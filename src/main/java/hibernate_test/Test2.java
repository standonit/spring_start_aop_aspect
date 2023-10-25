package hibernate_test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate_test.Entity.Employee;


public class Test2 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class).buildSessionFactory();
		

		
	try {
		Session session = factory.getCurrentSession();
		Employee emp = new Employee("Oleg", "Sidorov", "HR", 700);
		session.beginTransaction();
		session.save(emp);
	//	session.getTransaction().commit();
		
		//получение объекта из базы данных по ID
		int myId = emp.getId();
		//session = factory.getCurrentSession();
		//session.beginTransaction();
		Employee employee = session.get(Employee.class, myId);
		session.getTransaction().commit();
		System.out.println(employee);
	}
		finally {	factory.close();
		}
	}

}