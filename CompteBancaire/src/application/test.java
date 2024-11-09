package application;
import metier.CompteBancaire ;
public class test {
	 public static void main(String[] args) {
		CompteBancaire CB = new CompteBancaire(2,10000) ;

	    CB.retirer(500);
	    //System.out.println(CB);
	    
	    //CB.deposer(500);
	    //System.out.println(CB);
	 }

}
