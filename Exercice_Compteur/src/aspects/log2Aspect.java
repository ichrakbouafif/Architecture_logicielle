package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import metier.Compteur;

@Aspect
public class log2Aspect {
	 @Pointcut("call (* *.*.Incrementer(..)) && target(c)")
	    public void logIncT(Compteur c){}

	 @Pointcut("call (* *.*.Decrementer(..)) && target(c)")
	    public void logDecT(Compteur c){}

	    @Before("logIncT(c)")
	    public void avantIncT(Compteur c) {
	        System.out.println(" ....Avant l'incrementation (aspect avec annotations target)...." + c.getValeur());
	    }

	    @After("logIncT(c)")
	    public void apresIncT(Compteur c) {
	        System.out.println("....Apres l'incrementation (aspect avec annotations target)...." + c.getValeur());
	    }

	    @Before("logDecT(c)")
	    public void avantDecT(Compteur c) {
	        System.out.println(" ....Avant la decrementation (aspect avec annotations target)...." + c.getValeur());
	    }

	    @After("logDecT(c)")
	    public void apresDecT(Compteur c) {
	        System.out.println("....Apres la decrementation (aspect avec annotations target)...." + c.getValeur());
	    }
}
