import javax.swing.*;
import java.awt.*;
import javax.swing.Timer.*;

//The object "Main" creates a JFrame, which it extends, and adds a Unicorn and a Platform. 
//Very little action is in this object, because the action is stored in the individual 
//object classes.
public class Main extends JFrame {
   
   //The constructor for Main, which is a JFrame.
   Main (String nameOfFrame) {
      super(nameOfFrame);
      setSize(711, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      
      setLayout(new BorderLayout());
	   setContentPane(new JLabel(new ImageIcon("backsample2.jpg")));
      
      //adds all the drawables and ect. 
      add(new Unicorn(getGraphics(), new Point((this.getWidth() / -2) + 100, 0), new ImageIcon("icon_rainbowdash.png")));
      add(new Platform(getGraphics(), new Point(50, 100)));
      
      addComponentsToPane(this.getContentPane());
        
      setVisible(true); 
   }
   
   //when the components are added, it sets the layout of them to a boxlayout.
   public static void addComponentsToPane(Container pane) {
      pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
   }
   
   //The main- where a new Main is constructed and named.tre
   public static void main(String[] args) {
      Main main = new Main("Friendship is Magic");
   }
}