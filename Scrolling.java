//Any object that will move across the screen, from right to left, will 
//extend Scrolling. This includes Platforms, and other point gainers or 
//obstacles in the environment. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scrolling extends Drawable implements ActionListener {
   Timer time;
   
   //Constructs a Scrolling object, or one that moves to the left each time the
   //timer goes off. Constructs and starts the timer to be used.
   public Scrolling(Graphics pen, Point place) {
      super(pen, place);
      Timer time = new Timer(25, this);
      time.start();
   }
   
   //is called everytime the timer "goes off", currently set to every 25 milliseconds
   public void actionPerformed(ActionEvent event) {
      place.x -= 1;

      //repaint calls paintComponent, not sure why they are named differently
      repaint();
   }
   
   //Is called every time actionPerformed is, so every time the timer goes off. 
   //changes the location to follow that of the point, and paints it.
   public void paintComponent(Graphics pen) { 
      this.setLocation(place);
      super.paintComponent(pen);
   }
   
}