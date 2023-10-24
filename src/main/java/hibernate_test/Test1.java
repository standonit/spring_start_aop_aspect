package hibernate_test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate_test.Entity.Employee;


public class Test1 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class).buildSessionFactory();
		

		
	try {
		Session session = factory.getCurrentSession();
		Employee emp = new Employee("Marina", "Koryagina", "HR", 750);
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
	}
		finally {	factory.close();
		}
	}

}
