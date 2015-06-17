/*Project: TwoHitWonder/RainbowUnicornDash
 *APCS Final Project
 *@author: Monica King
 *@author: Rebecca Nicacio
 *version 6/16/2015
*/
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer.*;

public class Main extends JFrame {
   
   private final int unicornSizeX = 50;
   private final int unicornSizeY = 41;
   private final int platformSizeX = 255;
   private final int platformSizeY= 31;
   Unicorn user;
   Platform start;
   
   //Creates the dimensions for the game window, displays it, and initializes
   //the starting variables 
   Main (String nameOfFrame) {
      super(nameOfFrame);
      setSize(711, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      
      //This makes it so that there can be more than one object displayed at a time
      setLayout(new BorderLayout());
	   setContentPane(new JLabel(new ImageIcon("backsample2.jpg")));
      
      //Creates a Unicorn for the user to control, and a Platform that the
      //Unicorn would initially be on
      user = new Unicorn(getGraphics(), new Point(-300, 159), new ImageIcon("icon_rainbowdash.png"));
      start = new Platform(getGraphics(), new Point(-300, 200), new ImageIcon("platformsample.jpg"));
      add(user);
      add(start);
      
      //Draws 2 randomly placed Platforms
      add(this.drawPlatforms());
      add(this.drawPlatforms());
      
      /* These pieces of code would create a sample of 10 Platforms, and allow
       * the Unicorn to rest on the starting Platform.  
      for(int sampleGame = 0; sampleGame < 10; sampleGame++){ 
          add(this.drawPlatforms());
      }
      
      this.stopFall();
      */  
        
      addComponentsToPane(this.getContentPane());
        
      setVisible(true); 
   }
   
   //Allows the JFrame to hold and display more than one object at a time
   public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
   }
   
   //creates a Platform at a random point.
   public Platform drawPlatforms(){
      Random random = new Random();
      int r1 = random.nextInt(400 - platformSizeY) + unicornSizeY;
      int r2 = random.nextInt(350);
      Platform p = new Platform(getGraphics(), new Point(r2, r1), new ImageIcon("platformsample.jpg"));
      return p;
   }
   
   //Eventually, this would allow the Unicorn to rest on 
   //more platforms than just the starting one
   //but for now it makes the Unicorn stay at a jumped position
   public void stopFall(){
      if((user.getPoint().y + unicornSizeY) == start.getPoint().y){
         user.setLocation(-300, (start.getPoint().y - unicornSizeY));
         user.getTime().stop();
      } else if ((user.getPoint().y + unicornSizeY) != start.getPoint().y){
         user.getTime().restart();
      }
         
                   
   }
   
   //Initializes and executes the game.
   public static void main(String[] args) {
      Main main = new Main("The Frame in Main");
   }
}
