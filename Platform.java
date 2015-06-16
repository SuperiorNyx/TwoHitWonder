//Platform makes one rectangle that is a Scrolling object, and 
//will eventually make a way to tell unicorn its cooridinates, 
//so the two do not collide. 

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.Graphics;

public class Platform extends Scrolling {
   
   //Constructs a new Platfrom, passing the Frames Graphics
   //and the place it is at originally. 
   Platform(Graphics pen, Point place) {
      super(pen, place);
      setOpaque(false);
      
      setFocusable(true);
   }
   
   //is called in paintcomponent, or whenever the platform
   //needs to be drawn. 
   public void drawRectangle(Graphics g) {
      g.setColor(Color.WHITE);
      g.fillRect(place.x, place.y, 100, 10);
   }
   
   //is called every time the timer goes off. 
   public void paintComponent(Graphics pen) {  
      drawRectangle(pen);
      super.paintComponent(pen);
      
      
      // If it hits the edge of the screen, it puts it back on the other side.
      if (place.x <= 0) { 
            place.x = 400;
      }      
   }
    
}