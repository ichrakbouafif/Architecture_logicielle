package beans;

import java.io.Serializable;
import java.beans.*;

public class MonBean2 implements Serializable {
	  protected int oldValeur;
	  protected int valeur;
	  
	  PropertyChangeSupport changeSupport;
	  VetoableChangeSupport vetoableSupport;
	  
	  public MonBean2(){ 
	    valeur = 0; 
	    oldValeur = 0;
	    
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
	  public synchronized int getValeur() {
	    return valeur;
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
