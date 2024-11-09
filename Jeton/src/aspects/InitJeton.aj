package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import metier.Jeton;

@Aspect
public class InitJeton {
    private static int nb = 0;

    @Pointcut("execution(metier.Jeton.new(..))")
    public void instanciation() {
    }

    @Around("instanciation()")
    public Object cc(ProceedingJoinPoint joinPoint) throws Throwable {
        if (nb < 3) {
            nb++;
            Object ret = joinPoint.proceed();
            System.out.println("Around after is running !");
            return ret;
        } else {
            throw new RuntimeException("Appelle au constructeur Jeton > 3 !");
        }
    }
}
