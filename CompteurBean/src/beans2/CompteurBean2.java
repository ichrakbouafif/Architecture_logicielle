package beans2;

import java.io.Serializable;
import java.beans.*;
public class CompteurBean2 implements Serializable{

	  protected int oldValeur;
	  protected int valeur;
	  
	  protected String oldNom;
	  protected String nom;
	  
	  PropertyChangeSupport changeSupport;
	  VetoableChangeSupport vetoableSupport;
	  
	  public CompteurBean2(){ 
	    valeur = 0; 
	    oldValeur = 0;
	    
	    nom="Compteur";
	    oldNom="OldNom";
	    
	    changeSupport = new PropertyChangeSupport(this);
	    vetoableSupport = new VetoableChangeSupport(this);     
	  }
	  
	   
	  public synchronized void setValeur(int val) {
	    oldValeur = valeur;
	    valeur = val;
	    
	    try {  
	      vetoableSupport.fireVetoableChange("valeur",new Integer(oldValeur),
	              new Integer(valeur));    
	    } catch(PropertyVetoException e) {     
	      System.out.println("MonBean, un veto est emis :  "+e.getMessage());
	      valeur = oldValeur;
	    }
	    if ( valeur != oldValeur ) {   
	      changeSupport.firePropertyChange("valeur",oldValeur,valeur);
	    }
	    
	  }
	  
	  public synchronized void setNom(String name) {
		    String oldNom = nom;
		    nom = name;
		    
		    try {  
		        vetoableSupport.fireVetoableChange("nom", new String(oldNom), nom);    
		    } catch(PropertyVetoException e) {     
		        System.out.println("MonBean, un veto est emis :  " + e.getMessage());
		        nom = oldNom;
		    }
		    if (!nom.equals(oldNom)) {   
		        changeSupport.firePropertyChange("nom", oldNom, nom);
		    }
		}

	  
	  public synchronized int getValeur() {
	    return valeur;
	  }
	  
	  public synchronized String getNom() {
		    return nom;
		  }
	  
	  
	  public synchronized void incrementer() {
	    	oldValeur = valeur;
		    valeur = valeur + 1;
	    	try {  
	  	      vetoableSupport.fireVetoableChange("valeur",new Integer(oldValeur),
	  	              new Integer(valeur));    
	  	    } catch(PropertyVetoException e) {     
	  	      System.out.println("MonBean, un veto est emis :  "+e.getMessage());
	  	      valeur = oldValeur;
	  	    }
	  	    if ( valeur != oldValeur ) {   
	  	      changeSupport.firePropertyChange("valeur",oldValeur,valeur);
	  	    }
	    }

	    public synchronized void decrementer()  {
	    	oldValeur = valeur;
		    valeur = valeur - 1;
	    	try {  
	  	      vetoableSupport.fireVetoableChange("valeur",new Integer(oldValeur),
	  	              new Integer(valeur));    
	  	    } catch(PropertyVetoException e) {     
	  	      System.out.println("MonBean, un veto est emis :  "+e.getMessage());
	  	      valeur = oldValeur;
	  	    }
	  	    if ( valeur != oldValeur ) {   
	  	      changeSupport.firePropertyChange("valeur",oldValeur,valeur);
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
