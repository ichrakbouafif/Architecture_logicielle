package aspects;

import metier.CompteBancaire;

public aspect PatchAspect {
	pointcut patch(CompteBancaire c, double mt): call(* metier..CompteBancaire.retirer(..)) && args(mt) && target(c);	
	void around(CompteBancaire c, double mt): patch(c,mt){		
		if(mt<c.getSolde()) {
			proceed(c,mt);
		}		
		else {
			throw new RuntimeException("Solde insuffisant [mt="+mt
					+", Solde ="+c.getSolde()+"]");
		}		
	}
}


