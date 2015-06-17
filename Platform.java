//Platform makes one rectangle that is a Scrolling object, and 
//will eventually make a way to tell unicorn its cooridinates, 
//so the two do not collide. 

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

public class Platform extends Scrolling {

   JLabel labelForIcon;
   
   //Creates a Platform object, that would eventually interact with Unicorn.
   //This object scrolls continuously across the screen. Uses an image icon
   //so that an editor could create a platform out of images of their own.
   Platform(Graphics pen, Point place, ImageIcon img) {
   
      super(pen, place);
      setOpaque(false);

      
      labelForIcon = new JLabel(img);
      
      setFocusable(true);
  
      
   }
   
   //draws the platform, and has it leapfrog from one side to the other
   //when it reaches the edge of the screen.
   public void paintComponent(Graphics pen) { 
   
      this.add(labelForIcon);
      this.setLocation(place);
      super.paintComponent(pen);
      if (place.x <= -400) {
 
            // If it has, line it back up so that its left edge is
            // lined up to the right side of the other background image
            place.x = 400;
      }      
   }
   
   //returns Point place for use outside this class
   public Point getPoint(){
      return place;
   }
    
}
