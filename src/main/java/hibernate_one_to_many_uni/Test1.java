package hibernate_one_to_many_uni;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate_one_to_many_uni.Entity.Employee;
import hibernate_one_to_many_uni.Entity.Department;


public class Test1 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
		

		
	try(Session session = factory.getCurrentSession()) {
		
		/*Department department = new Department("HR", 500, 1200);
		Employee emp1 = new Employee("lil", "rat", 750);
		Employee emp2 = new Employee("peep", "rat", 850);
	
		department.addEmployeeToDepartment(emp1);
		department.addEmployeeToDepartment(emp2);
		
		
		session.beginTransaction();

		session.save(department);
		
		session.getTransaction().commit();
		System.out.println("Done");*/
		
		
		
		/*session.beginTransaction();
		Department department = session.get(Department.class, 5);
		
		System.out.println(department);
		System.out.print(department.getEmps());
		
		session.getTransaction().commit();
		System.out.println("Done");*/
		
		
		
		/*session.beginTransaction();
		Department department = session.get(Department.class, 6);
		
		session.delete(department);
		
		session.getTransaction().commit();
		System.out.println("Done");*/
			}
		}
	}

