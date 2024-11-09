package beans;

import java.io.Serializable;
import java.beans.*;

public class MonCompteurBean {

	protected int valeur;
	protected String nom;
	  
	  PropertyChangeSupport changeSupport;
	  
	  public MonCompteurBean(){ 
	    valeur = 0;
	    nom="";
	    
	    changeSupport = new PropertyChangeSupport(this);
	  }
	  
	  public synchronized void setValeur(int val) {
	    int oldValeur = valeur;
	    valeur = val;
	    
	    changeSupport.firePropertyChange("valeur",oldValeur,valeur);
	  }
	  public synchronized void setNom(String name ) {
		String oldNom = nom;
		nom = name;
		    
		changeSupport.firePropertyChange("nom",oldNom,nom);
		  }
	  public synchronized int getValeur() {
	    return valeur;
	  }
	  public synchronized String getNom() {
		    return nom;
		  }
	  
      public void incrementer() {
          setValeur(valeur + 1);
      }

      public void decrementer() {
          setValeur(valeur - 1);
      }
	  public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
	    changeSupport.addPropertyChangeListener(listener);
	  }
	  
	  public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
	    changeSupport.removePropertyChangeListener(listener);
	  }  

}
