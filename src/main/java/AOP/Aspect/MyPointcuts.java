package AOP.Aspect;

import org.aspectj.lang.annotation.Pointcut;


public class MyPointcuts {

	@Pointcut("execution(* sga*(..))")
	public void allAddMethods() {
	}

}
