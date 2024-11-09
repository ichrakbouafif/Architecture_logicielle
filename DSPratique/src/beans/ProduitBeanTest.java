package beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ProduitBeanTest {

	public static void main(String[] args) {
	    new ProduitBeanTest();
	  }
	  
	  public ProduitBeanTest() {
	    ProduitBean monBean = new ProduitBean();
	    
	    monBean.addPropertyChangeListener( new PropertyChangeListener() {
	      public void propertyChange(PropertyChangeEvent event) {

	        System.out.println("propertyChange : enStock = "+ event.getNewValue());

	      }
	    } );
	                               
	    System.out.println("enStock = " + monBean.getEnStock());
	    //monBean.setEnStock(true);
	    //System.out.println("enStock = " + monBean.getEnStock());
	    
	    monBean.incrementer();
	    System.out.println("quantite Stock = " + monBean.getQuantiteStock());
	    System.out.println("enStock = " + monBean.getEnStock());
	    
	    
	    monBean.decrementer();
	    monBean.decrementer();
	    monBean.decrementer();

	    System.out.println("quantite Stock = " + monBean.getQuantiteStock());
	    System.out.println("enStock = " + monBean.getEnStock());
	    
	    
	    
	    //System.out.println("nom produit = " + monBean.getNomProduit());
	    //monBean.setNomProduit("Nouveau Produit");
	    //System.out.println("nom produit = " + monBean.getNomProduit());
	                           
	  }

}
