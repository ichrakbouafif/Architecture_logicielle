package aspects;


import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class log3 {
	@Pointcut("execution(* *.*.retirer(..))")
	public void logOperation(){}
	
	@Around("logOperation()")
	public Object aroundHello(ProceedingJoinPoint joinPoint )throws Throwable {
		System.out.println("in around before " + joinPoint);
		System.out.println("in around before " + joinPoint.getSignature().getName());
		System.out.println("around before is running ! " );
		Object ret = joinPoint.proceed();
		System.out.println("in around after is running ! " );
		
		return ret;}}






