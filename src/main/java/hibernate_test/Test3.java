package hibernate_test;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate_test.Entity.Employee;


public class Test3 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class).buildSessionFactory();
		

		
	try {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		//List<Employee> emps = session.createQuery("from Employee").getResultList();
		
		List<Employee> emps = session.createQuery("from Employee "
				+ "where name = 'Marina'").getResultList();
		
		for(Employee e : emps) {
			System.out.println(e);
		}
		
		session.getTransaction().commit();

		System.out.println("Done");

	}
		finally {	factory.close();
		}
	}

}