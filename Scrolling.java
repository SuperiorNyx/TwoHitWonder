import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scrolling extends Drawable implements ActionListener {
   Timer time;
   
   //Creates a Scrolling object. This object uses a Timer
   //so that it continually scrolls across the screen
   //from right to left.
   public Scrolling(Graphics pen, Point place) {
      super(pen, place);
      Timer time = new Timer(45, this);
      time.start();
   }
   
   //scrolls the object at a rate of 5 pixels per 45 miliseconds
   public void actionPerformed(ActionEvent event) {
      place.x -= 5;

      repaint();
   }
   
   //Is called every time actionPerformed is, so every time the timer goes off. 
   //changes the location to follow that of the point, and paints it.  
   public void paintComponent(Graphics pen) { 
   
      this.setLocation(place);
      super.paintComponent(pen);
      
   }
   
}
