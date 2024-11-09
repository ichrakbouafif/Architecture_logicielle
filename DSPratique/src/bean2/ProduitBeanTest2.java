package bean2;
import java.beans.*;
import java.util.*;
public class ProduitBeanTest2 {


  public static void main(String[] args) {
	 
    new ProduitBeanTest2();
  }
  
  public ProduitBeanTest2() {
	  ProduitBean2 monBean2 = new ProduitBean2();
    
    monBean2.addPropertyChangeListener( new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent event) {
        System.out.println("propertyChange : en stock = "+ event.getNewValue());
      }
    } );
    
    monBean2.addVetoableChangeListener( new VetoableChangeListener() {
    
      public void vetoableChange(PropertyChangeEvent event) throws PropertyVetoException {
        System.out.println("vetoableChange : Stock = " + event.getNewValue());
        if( ((Integer)event.getNewValue()).intValue() > 50 ) {
          throw new PropertyVetoException("quantite stock superieure a 50",event);
      }else if ( ((Integer)event.getNewValue()).intValue() < 5) {
          throw new PropertyVetoException("quantite inferieure a 5", event);
          }}}
        
        
     );    
                           
    System.out.println("Quantite Stock = " + monBean2.getQuantiteStock());
    monBean2.setQuantiteStock(5);
    
    monBean2.decrementer();
    System.out.println("QuantiteStock = " + monBean2.getQuantiteStock());
                   

    monBean2.setQuantiteStock(51);
    System.out.println("QuantiteStock = " + monBean2.getQuantiteStock());


    
      
    
                           
  }
}
