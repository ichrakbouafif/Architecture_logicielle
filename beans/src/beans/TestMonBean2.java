package beans;

import java.beans.*;
import java.util.*;

public class TestMonBean2 {
  public static void main(String[] args) {
    new TestMonBean2();
  }
  
  public TestMonBean2() {
    MonBean2 monBean = new MonBean2();
    
    monBean.addPropertyChangeListener( new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent event) {
        System.out.println("propertyChange : valeur = "+ event.getNewValue());
      }
    } );
    
    monBean.addVetoableChangeListener( new VetoableChangeListener() {
    
      public void vetoableChange(PropertyChangeEvent event) throws PropertyVetoException {
        System.out.println("vetoableChange : valeur = " + event.getNewValue());
        if( ((Integer)event.getNewValue()).intValue() > 100 )
          throw new PropertyVetoException("valeur superieure a 100",event);
      }
    } );    
                           
    System.out.println("valeur = " + monBean.getValeur());
    monBean.setValeur(10);
    System.out.println("valeur = " + monBean.getValeur());
    monBean.setValeur(200);                       
    System.out.println("valeur = " + monBean.getValeur());
                           
  }
}
