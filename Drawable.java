import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drawable extends JPanel {

   Point place;
   Graphics pen;
   
   public Drawable(Graphics g, Point p) {
      pen = g;
      this.place = p;
   }
   
   public void paintComponent(Graphics pen) {
   
      setLocation(place);
      super.paintComponent(pen);
   } 

}