package hibernate_many_to_many;

/*
CREATE TABLE children (
		  id serial not null primary key,
		  name varchar(15),
		  age integer
		);

		CREATE TABLE section (
		  id serial not null primary key,
		  name varchar(15)
		);

		CREATE TABLE child_section (
		  child_id integer REFERENCES children(id),
		  section_id integer REFERENCES section(id),
		  constraint child_section_pkey primary key (child_id, section_id)
		);
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_many_to_many.Entity.Section;
import hibernate_many_to_many.Entity.Child;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Child.class).addAnnotatedClass(Section.class).buildSessionFactory();
		
		try(Session session = factory.getCurrentSession()) {
		
			/*Section section1 = new Section("football");
			
			Child child1 = new Child("Marina", 23);
			Child child2 = new Child("lil", 2);
			Child child3 = new Child("peep", 3);
			
			section1.addChildToSection(child1);
			section1.addChildToSection(child2);
			section1.addChildToSection(child3);
			
			session.beginTransaction();
			
			session.save(section1);
			
			session.getTransaction().commit();
			
			System.out.println("DONE");*/
			
			
			
			
	
			session.beginTransaction();
			
			Section section = session.get(Section.class, 1);
			
			System.out.println(section);
			System.out.println(section.getChildren());
			
			session.getTransaction().commit();
			
			System.out.println("DONE");
			
		}
	}
}
