import java.awt.event.*;
import javax.swing.*;

public class Key extends JFrame implements KeyListener{
   //I can change this later to make it usable as an object with other classes
   //as well as change it to fit what ever buttons are needed.
 
   
   public void keyPressed(KeyEvent e){
      int k = e.getKeyCode();
      if(k == KeyEvent.VK_LEFT) {
         System.out.println("Left pressed!");
      } else if(k == KeyEvent.VK_RIGHT) {
         System.out.println("Right pressed!");
      } else if(k == KeyEvent.VK_UP){
         System.out.println("Up pressed!");
      } else if (k == KeyEvent.VK_ESCAPE) {
         System.exit(0);
      } else {
         
      }
   }
   
   public void keyReleased(KeyEvent e){
      //System.out.println("Released");
      //KeyCode.setText("Key Code: " + e.getKeyCode());
   }
   
   public void keyTyped(KeyEvent e){
   }
    
}