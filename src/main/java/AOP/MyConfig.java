package AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import AOP.Aspect.ExceptionHandlingAspect;
import AOP.Aspect.LoggingAspect;
import AOP.Aspect.SecurityAspect;

@Configuration
@ComponentScan("AOP")
@EnableAspectJAutoProxy
public class MyConfig {
	
	/*@Bean
	public UniLibrary uniLibraryBean() {
		return new UniLibrary();
	}
		
		@Bean
		public ExceptionHandlingAspect exceptionHandlingAspectBean() {
			return new ExceptionHandlingAspect();
		}
			
			
			@Bean
			public SecurityAspect securityAspectBean() {
				return new SecurityAspect();
			}
				
				@Bean
				public LoggingAspect loggingAspectBean() {
					return new LoggingAspect();
	}*/

}
