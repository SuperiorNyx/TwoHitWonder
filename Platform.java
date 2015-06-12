import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

public class Platform extends Scrolling {

   JLabel labelForIcon;
   
   Platform(Graphics pen, Point place, ImageIcon img) {
   
      super(pen, place);
      setOpaque(false);

      
      labelForIcon = new JLabel(img);
      
      setFocusable(true);
  
      
   }
   
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
    
}