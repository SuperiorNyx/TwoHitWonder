import javax.swing.*;
import java.awt.*;
import javax.swing.Timer.*;

public class Main extends JFrame {
   
   Main (String nameOfFrame) {
      super(nameOfFrame);
      setSize(711, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      
      setLayout(new BorderLayout());
	   setContentPane(new JLabel(new ImageIcon("backsample2.jpg")));
      
      add(new Unicorn(getGraphics(), new Point(-50, 159), new ImageIcon("icon_rainbowdash.png")));
      add(new Platform(getGraphics(), new Point(-100, 100), new ImageIcon("icon_fluttershy.png")));
      add(new Platform(getGraphics(), new Point(-50, 200), new ImageIcon("icon_fluttershy.png")));
      
      addComponentsToPane(this.getContentPane());
        
      setVisible(true); 
   }
   
   public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
   }
   
   public static void main(String[] args) {
      Main main = new Main("The Frame in Main");
   }
}