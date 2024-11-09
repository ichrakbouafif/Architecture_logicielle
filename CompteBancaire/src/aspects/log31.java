package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import metier.CompteBancaire;

@Aspect
public class log31 {
    @Pointcut("execution(* *.*.retirer(..))")
    public void logOperation() {
    }

    @Around("logOperation()")
    public Object aroundRetiter(ProceedingJoinPoint joinPoint) throws Throwable {
        CompteBancaire CB = (CompteBancaire) joinPoint.getTarget();
        System.out.println("=> Entrée dans la méthode retirer");
        System.out.println("Solde avant retrait : " + CB.getSolde());

        Object resultat = joinPoint.proceed();

        System.out.println("Solde après retrait : " + CB.getSolde());
        System.out.println("<= Sortie de la méthode retirer");
        return resultat;
    }
}








