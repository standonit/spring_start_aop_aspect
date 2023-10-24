package AOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

	@Before("AOP.Aspect.MyPointcuts.allAddMethods()")
	public void beforeAddExceptionHandlingAdvice() {
		System.out.println("beforeAddExceptionHandlingAdvice: catch/handle"
				+ " an exception when trying to add a book or magazine");
		System.out.println("----------------------------------------");
	}

}
