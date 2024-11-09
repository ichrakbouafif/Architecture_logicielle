package beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ProduitBean {
	protected int quantiteStock;
	protected String nomProduit;
	protected boolean enStock;
	  
	  PropertyChangeSupport changeSupport;
	  
	  public ProduitBean(){ 
	    quantiteStock = 0;
	    nomProduit="Old Produit";
	    enStock=false;
	    changeSupport = new PropertyChangeSupport(this);
	  }
	  
	  public synchronized void setQuantiteStock(int q) {
	    int oldValeur = quantiteStock;
	    quantiteStock = q;
	    
	    changeSupport.firePropertyChange("quantiteStock",oldValeur,quantiteStock);
	  }
	  public synchronized void setNomProduit(String name ) {
		String oldNom = nomProduit;
		nomProduit = name;
		    
		changeSupport.firePropertyChange("nomProduit",oldNom,nomProduit);
		  }
	  public synchronized void setEnStock(boolean state ) {
		boolean oldState = enStock;
		enStock = state;
		    
		changeSupport.firePropertyChange("enStock",oldState,enStock);
		  }
	  
	  public synchronized int getQuantiteStock() {
	    return quantiteStock;
	  }
	  public synchronized String getNomProduit() {
		    return nomProduit;
		  }
	  public synchronized boolean getEnStock() {
		    return enStock;
		  }
	  
      public void incrementer() {
          setQuantiteStock(quantiteStock + 1);
          if (this.quantiteStock>0) {
        	  this.enStock=true;
          }
          }
      

      public void decrementer() {
          setQuantiteStock(quantiteStock - 1);
          if (this.quantiteStock<=0) {
        	  this.enStock=false;
          }
      }
	  public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
	    changeSupport.addPropertyChangeListener(listener);
	  }
	  
	  public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
	    changeSupport.removePropertyChangeListener(listener);
	  }  

}
