package beans;

import java.beans.*;
import java.util.*;


public class TestMonCompteurBean {
	  public static void main(String[] args) {
		    new TestMonCompteurBean();
		  }
		  
		  public TestMonCompteurBean() {
		    MonCompteurBean monCompteurBean = new MonCompteurBean();
		    
		    monCompteurBean.addPropertyChangeListener( new PropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		        System.out.println("propertyChange : valeur or nom = "+ event.getNewValue());

		      }
		    } );
		                               
		    System.out.println("valeur = " + monCompteurBean.getValeur());
		    monCompteurBean.setValeur(10);
		    System.out.println("valeur = " + monCompteurBean.getValeur());
		    monCompteurBean.incrementer();
		    System.out.println("valeur = " + monCompteurBean.getValeur());
		    monCompteurBean.decrementer();
		    System.out.println("valeur = " + monCompteurBean.getValeur());
		    
		    
		    
		    System.out.println("nom = " + monCompteurBean.getNom());
		    monCompteurBean.setNom("Compteur");
		    System.out.println("nom = " + monCompteurBean.getNom());
		                           
		  }


}
