package simple;
 
import java.awt.*;
import java.io.Serializable;
 
public class SimpleBean extends Canvas
                        implements Serializable{
 
    private Color color = Color.green;
 
    //property getter method
    public Color getColor(){
        return color;
    }
 
    //property setter method. Sets new SimpleBean
    //color and repaints.
    public void setColor(Color newColor){
        color = newColor;
        repaint();
    }
 
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(20, 5, 20, 30);
    }
 
    //Constructor sets inherited properties
    public SimpleBean(){
        setSize(60,40);
        setBackground(Color.red);
    }
}
