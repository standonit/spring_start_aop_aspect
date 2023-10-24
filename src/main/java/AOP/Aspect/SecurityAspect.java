package AOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

	@Before("AOP.Aspect.MyPointcuts.allAddMethods()")
	public void beforeAddSecurityAdvice() {
		System.out.println("beforeAddSecurityAdvice: Checking rights to add a book or magazine");
		System.out.println("----------------------------------------");
	}

}
