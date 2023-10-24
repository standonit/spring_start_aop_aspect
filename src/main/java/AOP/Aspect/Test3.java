package AOP.Aspect;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import AOP.MyConfig;
import AOP.Student;
import AOP.UniLibrary;
import AOP.University;


public class Test3 {

	public static void main(String[] args) {
		System.out.println("Method main starts");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
		
		String bookName = uniLibrary.returnBook();
		System.out.println("In library return book: " + bookName);
		
		
		
		context.close();
		System.out.println("Method main ends");
	}

}
