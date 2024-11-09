package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class log1Aspect {
    @Pointcut("call (* *.*.Incrementer(..))")
    public void logInc() {}

    @Pointcut("call (* *.*.Decrementer(..))")
    public void logDec() {}

    @Before("logInc()")
    public void avantInc() {
        System.out.println(" ....Avant l'incrementation (aspect avec annotations)....");
    }

    @After("logInc()")
    public void apresInc() {
        System.out.println("....Apres l'incrementation (aspect avec annotations)....");
    }

    @Before("logDec()")
    public void avantDec() {
        System.out.println(" ....Avant la decrementation (aspect avec annotations)....");
    }

    @After("logDec()")
    public void apresDec() {
        System.out.println("....Apres la decrementation (aspect avec annotations)....");
    }
}
