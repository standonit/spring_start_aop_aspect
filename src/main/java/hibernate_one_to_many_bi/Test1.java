package hibernate_one_to_many_bi;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate_one_to_many_bi.Entity.Employee;
import hibernate_one_to_many_bi.Entity.Department;


public class Test1 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
		

		
	try(Session session = factory.getCurrentSession()) {
		
		/*Department dep = new Department("IT", 500, 1200);
		Employee emp1 = new Employee("Nikita", "Koryagin", 700);
		Employee emp2 = new Employee("Marina", "Koryagina", 1200);
		
		dep.addEmployeeToDepartment(emp1);
		dep.addEmployeeToDepartment(emp2);

		session.beginTransaction();
	
		session.save(dep);
		
		session.getTransaction().commit();
		System.out.println("Done");*/
		
		
		
		/*session.beginTransaction();
		
		Department department = session.get(Department.class, 4);
		
		System.out.println(department);
		System.out.println(department.getEmps());

		
		session.getTransaction().commit();
		System.out.println("Done");*/
		
		
		
		
		/*session.beginTransaction();
		
		Employee employee = session.get(Employee.class, 5);
		
		System.out.println(employee);
		System.out.println(employee.getDepartment());

		
		session.getTransaction().commit();
		System.out.println("Done");*/
		
		
		
		
		session.beginTransaction();
		
		Employee employee = session.get(Employee.class, 5);
		
		session.delete(employee);

		
		session.getTransaction().commit();
		System.out.println("Done");
			}
		}
	}

