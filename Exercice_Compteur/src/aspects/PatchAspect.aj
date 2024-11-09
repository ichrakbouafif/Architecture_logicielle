package aspects;

import metier.Compteur;

public aspect PatchAspect {
	pointcut patch(Compteur c, int pas): call(* metier..Compteur.Decrementer(..)) && args(pas) && target(c);	
	void around(Compteur c, int pas): patch(c,pas){		
		if(c.getValeur()- pas >= 0) {
			proceed(c,pas);
		}		
		else {
			throw new RuntimeException("la valeur "+c.getValeur()
					+" est inferieure au pas "+pas);
		}		
	}
}


