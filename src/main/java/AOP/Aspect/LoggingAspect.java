package AOP.Aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.weaver.JoinPointSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import AOP.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

	/*
	@Pointcut("execution (* AOP.UniLibrary.*(..))")
	private void allMethodsFromUniLibrary() {}
	
	@Pointcut("execution (public void AOP.UniLibrary.returnMagazine())")
	private void returnMagazineFromUniLibrary() {}
	
	@Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
	private void allMethodsExceptReturnMagazineFromUniLibrary() {}
	
	@Before("allMethodsExceptReturnMagazineFromUniLibrary()")
	public void beforeAllMethodsExceptReturnMagazineAdvice() {
		System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: log #10");
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Pointcut("execution(* AOP.UniLibrary.get*())")
	private void allGetMethodsFromUniLibrary() {}
	
	@Before("allGetMethodsFromUniLibrary()")
	public void beforeGetLoggingAdvice() {
		System.out.println("beforeGetLoggingAdvice: writing log #1");
	}
	
	@Pointcut("execution(* AOP.UniLibrary.return*())")
	private void allReturnMethodsFromUniLibrary() {}
	
	@Before("allReturnMethodsFromUniLibrary()")
	public void beforeReturnLoggingAdvice() {
		System.out.println("beforeReturnLoggingAdvice: writing log #2");
	}
	
	@Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
	private void allGetAndReturnMethodsFromUniLibrary() {}
	
	@Before("allGetAndReturnMethodsFromUniLibrary()")
	public void beforeGetAndReturnLoggingAdvice() {
		System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
	}
	*/
	
	
	
	
	
	
	
	
	
	@Before("AOP.Aspect.MyPointcuts.allAddMethods()")
	public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
		
	MethodSignature methodSignature = (MethodSignature) 	joinPoint.getSignature();
	System.out.println("methodSignature = " + methodSignature);
	System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
	System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
	System.out.println("methodSignature.getName = " + methodSignature.getName());
	
	if(methodSignature.getName().equals("addBook")) {
		Object[] arguments = joinPoint.getArgs();
		for(Object obj : arguments) {
			if(obj instanceof Book) {
				Book myBook = (Book) obj;
				System.out.println("information about book: Name of book -" +
				myBook.getName() + ", autor - " + myBook.getAuthor() + 
				", yearOfPublication - " + myBook.getYearOfPublication());
			} else if (obj instanceof String) {
				System.out.println("The book in library add " + obj);
			}
		}
	}
		
		
		
		
		
		
		
		System.out.println("beforeAddBookAdvice: logging trying to add a book/magazine");
		System.out.println("----------------------------------------");
	}
	
	
	/*
	@Pointcut("execution(* get*())")
	private void allGetMethods() {}
	
	
	
	
	@Before("allGetMethods()")
	public void beforeGetSecurityAdvice() {
		System.out.println("beforeAddSecurityAdvice: Checking rights to receive a book or magazine");
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Before("execution(* returnBook())")
	public void beforeReturnBookAdvice() {
		System.out.println("beforeGetBookAdvice: trying to return a book");
	}*/
	
	
}
