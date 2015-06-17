import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

public class Unicorn extends Drawable implements KeyListener, ActionListener{

   JLabel labelForUser;
   Timer time;
   
   /*
    * Constructor for a Unicorn object. This object has a Timer that repeatedly makes
    * it fall, ensuring that jump() works. It adds a KeyListener and ActionListener that enables the user
    * to control the Unicorn.
   */
   public Unicorn(Graphics pen, Point place, ImageIcon img){
      super(pen, place);
      setOpaque(false);
      addKeyListener(this);
      
      labelForUser = new JLabel(img);
      time = new Timer(30, this);
      time.start();
      
      setFocusable(true);

   }
   
   //This makes the Unicorn automatically fall so that jump() is functional.
   public void actionPerformed(ActionEvent event) {
      place.y += 3;

      repaint();
   }
   
   //draws the Unicorn onto the JFrame or JPanel
   public void paintComponent(Graphics pen) { 
   
      this.add(labelForUser);
      this.setLocation(place);
      super.paintComponent(pen);
   }
   
   //Moves the Unicorn up 50 pixels, the automatic falling ensures that
   //jump() doesn't result in the Unicorn staying there 
   public void jump() {
      place.y -= 50;
      repaint();
   }
   
   //This would be used if we added powerups.
   //It moves the Unicorn right 25 pixels
   public void dash(){
      place.x += 25;
      repaint();
   }
   
   //returns Point place for use outside of this class.
   public Point getPoint(){
      return place;
   }
   
   //returns Timer time for use outside of this class.
   public Timer getTime(){
      return time;
   }
   
   /*This is part of the KeyListener.
    *If a certain key - each key emits a key code -
    *is pressed, then the Unicorn will do an action.
   */
   public void keyPressed(KeyEvent e){
      int k = e.getKeyCode();
      if(k == KeyEvent.VK_UP){
         jump();
      } 
      if(k == KeyEvent.VK_RIGHT){
         dash();
      }   
   }
   
   //Override for KeyListener   
   public void keyTyped(KeyEvent e){
      System.out.println("typed");
   }
   
   //Override for KeyListener
   public void keyReleased(KeyEvent e){   

   }
  
}
      
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
