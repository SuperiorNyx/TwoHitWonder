import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

public class Back extends Scrolling {
   JLabel label;
   
   public Back (Graphics pen, Point place) {
   
      super(pen, place);
      label = new JLabel(new ImageIcon("backsample.jpg"));
      setOpaque(false);
      System.out.println(isOpaque());
      
   }
   
   public void paintComponent(Graphics pen) { 
      
      this.add(label);
      this.setLocation(place);
      super.paintComponent(pen);
      
   }
}