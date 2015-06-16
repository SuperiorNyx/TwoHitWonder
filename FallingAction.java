//To be used in any timer that has an object that 'falls'
//such as the unicorn class. Could be used for other obstacles,
//but currently only useful for the unicorn. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FallingAction implements ActionListener {
   Point p;
   
   public FallingAction(Point p) {
      
   }
   
   //is called every time the Unicorns timer goes off.
   public void actionPerformed(ActionEvent event) {
      if (p == null) {
         System.out.println("null af");
      } else if (p.y < 711) {
         p.y += 1; 
         //System.out.println("time");   
      }
   }
   
   public int getY(Point pp) {
      p = pp;
      int y;
      //if (p == null) {
         //y = 100;
         //System.out.println("p is null");
      //} else {
         y = p.y;
         //System.out.println(y);
      //}
      return y;
   }
}