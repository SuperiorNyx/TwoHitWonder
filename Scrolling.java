import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scrolling extends Drawable implements ActionListener {
   Timer time;
   
   public Scrolling(Graphics pen, Point place) {
      super(pen, place);
      Timer time = new Timer(25, this);
      time.start();
   }
   
   public void actionPerformed(ActionEvent event) {
      place.x -= 1;

      repaint();
   }
   
      
   public void paintComponent(Graphics pen) { 
   
      this.setLocation(place);
      super.paintComponent(pen);
      
   }
   
}