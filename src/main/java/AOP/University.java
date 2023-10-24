package AOP;

import java.util.*;


import org.springframework.stereotype.Component;

@Component
public class University {

	private List<Student> students = new ArrayList<>();

	public void addStudents() {
		Student st1 = new Student("Nikita Koryagin", 4, 7.5);
		Student st2 = new Student("Mihail Ivanov", 2, 8.3);
		Student st3 = new Student("Alexandr Sidorov", 1, 9.1);
		students.add(st1);
		students.add(st2);
		students.add(st3);
		
	}

	public List<Student> getStudents() {
		
		System.out.println("Start working method getStudents");
		//System.out.println(students.get(3));
		System.out.println("Information from method getStudents: ");
		System.out.println(students);
		return students;
	}

}
