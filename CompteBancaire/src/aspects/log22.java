package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import metier.CompteBancaire ;

@Aspect
public class log22 {
	@Pointcut("call (* *.*.retirer(..))&& target(CB)") 
	public void log(CompteBancaire CB){}
	
	@Before("log(CB)")
	public void avant(CompteBancaire CB) {
		System.out.println("Avant (aspect avec annotations)....Solde = "+ CB.getSolde());
		}
	@After("log(CB)")
	public void apres(CompteBancaire CB) {
		System.out.println("Apres (aspect avec annotations)....Solde = "+ CB.getSolde());
		}

}







