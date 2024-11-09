package aspects;
import metier.CompteBancaire ;
public aspect log2 {
	pointcut logOperation(CompteBancaire CB)
	:call (void metier.CompteBancaire.retirer(double))&& target(CB);
	
	before(CompteBancaire CB): logOperation(CB){
		System.out.println("*******Avant l'operation retrait solde = "+ CB.getSolde()+ "********");
		System.out.println(CB.toString());

	}
	after(CompteBancaire CB): logOperation(CB){
		System.out.println("********Apres l'operation retrait "+ CB.getSolde()+ "********");
		System.out.println(CB.toString());

	}
	
}
