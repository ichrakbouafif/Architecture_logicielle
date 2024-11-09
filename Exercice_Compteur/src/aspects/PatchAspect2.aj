package aspects;

import metier.Compteur;

public aspect PatchAspect2 {
    pointcut patch2(int pas): call(* metier..Compteur.Decrementer(..)) && args(pas);

    void around(int pas): patch2(pas) {
        Compteur c = (Compteur) thisJoinPoint.getTarget();

        if(c.getValeur()- pas >= 0) {
			proceed(pas);
		}		
		else {
			throw new RuntimeException("la valeur "+c.getValeur()
					+" est inferieure au pas "+pas);
		}
    }
}
