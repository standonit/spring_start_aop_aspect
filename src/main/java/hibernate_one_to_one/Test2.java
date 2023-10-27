package hibernate_one_to_one;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate_one_to_one.Entity.Detail;
import hibernate_one_to_one.Entity.Employee;


public class Test2 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
		
 
		
	try(Session session = factory.getCurrentSession()) {
		/*Employee employee = new Employee("Marina", "Koryagina", "HR", 850);
		Detail detail = new Detail("Khabarovsk", "+79242155316", "koryaginamarina@mail.ru");
		
		employee.setEmpDetail(detail);
		
		detail.setEmployee(employee);
		
		session.save(detail);
		
		session.getTransaction().commit();
		System.out.println("Done");*/
		
		
		
		/*session.beginTransaction();

		Detail detail = session.get(Detail.class, 1);
		
		System.out.println(detail.getEmployee());
		session.getTransaction().commit();
		System.out.println("Done");*/
		
		
		session.beginTransaction();

		Detail detail = session.get(Detail.class, 1);
		detail.getEmployee().setEmpDetail(null);
		
		session.delete(detail);
		session.getTransaction().commit();
		System.out.println("Done");
		
		
		
		
		
		
		
		
			}
		}
	}