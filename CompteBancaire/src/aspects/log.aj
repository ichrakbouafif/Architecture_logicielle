package aspects;

public aspect log {
	pointcut logOperation()
	:call (void metier.CompteBancaire.retirer(double));
	
	before(): logOperation(){
		System.out.println("Avant l'operation retrait");
	}
	after(): logOperation(){
		System.out.println("Apres l'operation retrait");
	}
	
}
