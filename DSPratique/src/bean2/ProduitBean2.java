package bean2;

import java.beans.MethodDescriptor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;





public class ProduitBean2 implements Serializable{
	
	protected int oldquantiteStock;
	protected int quantiteStock;
	protected String nomProduit;
	protected boolean enStock;
	protected boolean oldenStock;
	  
	  //protected String oldNom;
	 // protected String nom;
	  
	  PropertyChangeSupport changeSupport;
	  VetoableChangeSupport vetoableSupport;
	  
	  public ProduitBean2(){ 
		  quantiteStock = 0; 
		  oldquantiteStock = 0;
		  
		  oldenStock=false;
		  enStock=false;
		  
	    
	    //nom="Compteur";
	    //oldNom="OldNom";
	    
	    changeSupport = new PropertyChangeSupport(this);
	    vetoableSupport = new VetoableChangeSupport(this);     
	  }
	  
	   
	  public synchronized void setQuantiteStock(int val) {
	    oldquantiteStock = quantiteStock;
	    quantiteStock = val;
	    
	    try {  
	      vetoableSupport.fireVetoableChange("quantiteStock",new Integer(oldquantiteStock),
	              new Integer(quantiteStock));    
	    } catch(PropertyVetoException e) {     
	      System.out.println("MonBean, un veto est emis :  "+e.getMessage());
	      quantiteStock = oldquantiteStock;
	    }
	    if ( quantiteStock != oldquantiteStock ) {   
	      changeSupport.firePropertyChange("quantiteStock",oldquantiteStock,quantiteStock);
	    }
	    
	  }
	  
	 

	  
	  public synchronized int getQuantiteStock() {
	    return quantiteStock;
	  }
	  
	  public synchronized boolean getEnStock() {
		    return enStock;
		  }
	  
	  
	  public synchronized void incrementer() {
	    	oldquantiteStock = quantiteStock;
	    	quantiteStock = quantiteStock + 1;
	    	try {  
	  	      vetoableSupport.fireVetoableChange("valeur",new Integer(oldquantiteStock),
	  	              new Integer(quantiteStock));    
	  	    } catch(PropertyVetoException e) {     
	  	      System.out.println("MonBean, un veto est emis :  "+e.getMessage());
	  	    quantiteStock = oldquantiteStock;
	  	    }
	  	    if ( quantiteStock != oldquantiteStock ) {   
	  	      changeSupport.firePropertyChange("quantite Stock",oldquantiteStock,quantiteStock);
	  	    }
	    }

	    public synchronized void decrementer()  {
	    	oldquantiteStock = quantiteStock;
	    	quantiteStock = quantiteStock - 1;
	    	try {  
	  	      vetoableSupport.fireVetoableChange("quantite Stock",new Integer(oldquantiteStock),
	  	              new Integer(quantiteStock));    
	  	    } catch(PropertyVetoException e) {     
	  	      System.out.println("MonBean, un veto est emis :  "+e.getMessage());
	  	    quantiteStock = oldquantiteStock;
	  	    }
	  	    if ( quantiteStock != oldquantiteStock ) {   
	  	      changeSupport.firePropertyChange("valeur",oldquantiteStock,quantiteStock);
	  	    }
	    }
	  
	  
	  public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
	    changeSupport.addPropertyChangeListener(listener);
	  }
	  
	  public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
	    changeSupport.removePropertyChangeListener(listener);
	  }
	  public synchronized void addVetoableChangeListener(VetoableChangeListener listener) {
	    vetoableSupport.addVetoableChangeListener(listener);
	  }
	  public synchronized void removeVetoableChangeListener(VetoableChangeListener listener) {
	    vetoableSupport.removeVetoableChangeListener(listener);
	  }




}
