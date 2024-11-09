package beans2;

import java.beans.*;
import java.util.*;
public class CompteurBeanTest2 {

  public static void main(String[] args) {
    new CompteurBeanTest2();
  }
  
  public CompteurBeanTest2() {
	  CompteurBean2 monCompteurBean2 = new CompteurBean2();
    
    monCompteurBean2.addPropertyChangeListener( new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent event) {
        System.out.println("propertyChange : valeur ou nom = "+ event.getNewValue());
      }
    } );
    
    monCompteurBean2.addVetoableChangeListener( new VetoableChangeListener() {
    
      public void vetoableChange(PropertyChangeEvent event) throws PropertyVetoException {
        System.out.println("vetoableChange : valeur ou nom = " + event.getNewValue());
        if( ((Integer)event.getNewValue()).intValue() > 12 ) {
          throw new PropertyVetoException("valeur superieure a 12",event);
      }else if ( ((Integer)event.getNewValue()).intValue() < 9) {
          throw new PropertyVetoException("valeur inferieure a 9", event);
          }}}
        
        
     );    
                           
    System.out.println("valeur = " + monCompteurBean2.getValeur());
    monCompteurBean2.setValeur(10);
    
    monCompteurBean2.incrementer();
    System.out.println("valeur = " + monCompteurBean2.getValeur());
    monCompteurBean2.incrementer();                    
    System.out.println("valeur = " + monCompteurBean2.getValeur());
    monCompteurBean2.incrementer();                    
    System.out.println("valeur = " + monCompteurBean2.getValeur());
    
    
    System.out.println("valeur = " + monCompteurBean2.getValeur());
    monCompteurBean2.setValeur(10);
    monCompteurBean2.decrementer();                    
    System.out.println("valeur = " + monCompteurBean2.getValeur());
    monCompteurBean2.decrementer();                    
    System.out.println("valeur = " + monCompteurBean2.getValeur());
    

    
    
                           
  }
}
