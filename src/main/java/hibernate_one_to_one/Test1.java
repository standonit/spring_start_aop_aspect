package hibernate_one_to_one;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate_one_to_one.Entity.Detail;
import hibernate_one_to_one.Entity.Employee;


public class Test1 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
		

		
	try(Session session = factory.getCurrentSession()) {
		Employee employee = new Employee("Marina", "Koryagina", "HR", 1200);
		Detail detail = new Detail("Khabarovsk", "+79242155316", "koryaginamarina@mail.ru");
		employee.setEmpDetail(detail);
		session.beginTransaction();
		session.save(employee);
		

		
		//Employee emp = session.get(Employee.class, 3);
		//session.delete(emp);
		
	
		
		session.getTransaction().commit();
		System.out.println("Done");
			}
		}
	}


