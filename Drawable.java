//The Drawable Class is used in every object that will be drawn 
//on the JFrame, making it a parent (or a grandparent) to every
//class but Main. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drawable extends JPanel{

   Point place;
   Graphics pen;

   //Creates a Drawable object, this object can use and save graphics
   //and a point 
   public Drawable(Graphics g, Point p) {
      pen = g;
      this.place = p;
   }
   
   //called every time repaint is called or a listener 
   //goes off. Sets the location and paints the object.
   public void paintComponent(Graphics pen) {
   
      setLocation(place);
      super.paintComponent(pen);
   } 

}
