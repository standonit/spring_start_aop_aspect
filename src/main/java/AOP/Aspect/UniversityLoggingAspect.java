package AOP.Aspect;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import AOP.Student;

@Component
@Aspect
public class UniversityLoggingAspect {
/*
	@Before("execution(* getStudents())")
	public void beforeGetStudentsLoggingAdvice() {
		System.out.println(
				"beforeGetStudentsLoggingAdvice: logging receiving " + "list of students before method getStudents");
	}*/

	/*@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
	public void afterReturnStudentsLoggingAdvice(List<Student> students) {
		
		Student firstStudent = students.get(0);
		
		String nameSurname = firstStudent.getNameSurname();
		nameSurname = "Mr. " + nameSurname;
		firstStudent.setNameSurname(nameSurname);
		
		double avgGrade = firstStudent.getAvgGrade();
		avgGrade = avgGrade + 1;
		firstStudent.setAvgGrade(avgGrade);	
		
		System.out.println("afterReturnStudentsLoggingAdvice: logging receiving "
				+ "list of students after working method getStudents");
	}*/
	
	/*@AfterThrowing(pointcut = "execution(* getStudents())", 
			throwing = "exception")
	public void afterTrowingGetStudentsLoggingAdvice(Throwable exception) {
		
		System.out.println("afterTrowingGetStudentsLoggingAdvice: logging throwing an exception" + exception);
	}*/
	
	
	@After("execution(* getStudents())")
	public void afterGetStudentsLoggingAdvice() {
		System.out.println("afterGetStudentsLoggingAdvice: "
				+ "Log the normal completion of the method or the throwing of an exception");
	}
	
}
