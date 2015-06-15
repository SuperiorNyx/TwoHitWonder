import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drawable extends JPanel implements ActionListener {

   Point place;
   Graphics pen;
   Timer time;
   
   public Drawable(Graphics g, Point p) {
      pen = g;
      this.place = p;
      Timer time = new Timer(50, this);
      time.start();
   }
   
    public void actionPerformed(ActionEvent event) {
      place.y += 5;

      repaint();
   }
   
   public void paintComponent(Graphics pen) {
   
      setLocation(place);
      super.paintComponent(pen);
   } 

}