//The Unicorn object is also a keylistener, responding to the up key.

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

public class Unicorn extends Drawable implements KeyListener {
   JLabel labelForUser;
   FallingAction fall;
   Timer time;
      
   //Constructs a Unicorn, passing the Frame's Graphics, the point it is at originally,
   //and the imageicon that is to be displayed representing the unicorn.
   public Unicorn(Graphics pen, Point pp, ImageIcon img){
      super(pen, pp);
      place = pp;
      setOpaque(false);
      addKeyListener(this);
      
      labelForUser = new JLabel(img);
      fall = new FallingAction(place);
      time = new Timer(25, fall);
      
      time.start();      
      repaint();
      
      setFocusable(true);
   }
   
   //Is called whenever repaint is called.
    public void paintComponent(Graphics pen) {
      this.add(labelForUser);
      if (100 <= fall.getY(place)){
         super.paintComponent(pen);
         System.out.println("hit");
      } else if (fall.getY(place) < 300) {
         place.y = fall.getY(place);
         super.paintComponent(pen);  
      }

    }
    
    //Is called in the keyListener, just changes the y coordinate 
    //and calls paintComponent.
    public void jump() {
      place.y -= 100;
      repaint();
   }
   
      
   //is called whenever a key is pressed, passing a KeyEvent as a parameter.
   //if the keyevent is the up key, it calls jump.
   public void keyPressed(KeyEvent e) {
      int k = e.getKeyCode();
      if(k == KeyEvent.VK_UP){
         jump();
         System.out.println("up");
      } 
   }
   
   //Not used in our program, but necessary to using keylisteners. 
   public void keyTyped(KeyEvent e){
      //System.out.println("typed");
   }
   
   //ditto.
   public void keyReleased(KeyEvent e){
      
   }
  
}