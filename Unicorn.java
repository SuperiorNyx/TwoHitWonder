import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

public class Unicorn extends Drawable implements KeyListener{

   JLabel labelForUser;
   
   public Unicorn(Graphics pen, Point place, ImageIcon img){
      super(pen, place);
      setOpaque(false);
      addKeyListener(this);
      
      labelForUser = new JLabel(img);
      
      setFocusable(true);

   }
    public void paintComponent(Graphics pen) { 
   
      this.add(labelForUser);
      this.setLocation(place);
      super.paintComponent(pen);
    }
    
    public void jump() {
      place.y -= 50;
      repaint();
   }
   
   public void fall(){
      place.y += 10;
      repaint();
   }
   
   public void keyPressed(KeyEvent e){
      int k = e.getKeyCode();
      if(k == KeyEvent.VK_UP){
         jump();
      } 
      if(k == KeyEvent.VK_DOWN){
         fall();
      }
   }
   
      
   public void keyTyped(KeyEvent e){
      System.out.println("typed");
   }
   
   public void keyReleased(KeyEvent e){
      
      

   }
  
}