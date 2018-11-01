package martin.ma.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
	
	@Pointcut("execution( * martin.ma.springboot.controller.*.*(..))")
	public void pointcut() {}
	
	
	
	@Around(value = "pointcut()")
	public Object doAround(ProceedingJoinPoint pjp) {
		try {
			
			System.out.println("Aspect: before");
			Object res =  pjp.proceed();
			System.out.println("Aspect: after");
			return res;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
