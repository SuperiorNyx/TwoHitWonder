import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

public class Unicorn extends Scrolling implements KeyListener {

   JLabel labelForIcon;
   
   Unicorn(Graphics pen, Point place, ImageIcon img) {
      
      super(pen, place);
      setOpaque(false);
      
      labelForIcon = new JLabel(img);
      
      labelForIcon.addKeyListener(this);
      setFocusable(true);
      
   }
   
   public void paintComponent(Graphics pen) { 
   
      this.add(labelForIcon);
      this.setLocation(place);
      super.paintComponent(pen);
      
   }
   
   public void jump() {
      place.y += 10;
      repaint();
   }
   
   public void keyPressed(KeyEvent e){
      System.out.println("pressed");
   }
   
      
   public void keyTyped(KeyEvent e){
      System.out.println("typed");
   }
   
   public void keyReleased(KeyEvent e){
      System.out.println("released");
   }
   

    
}