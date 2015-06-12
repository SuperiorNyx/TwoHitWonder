import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ScrollingBack extends Canvas implements Runnable{
   private Background back1;
   private Background back2;
   
   private BufferedImage back;
   
   public ScrollingBack(){
      back1 = new Background();
      back2 = new Background(back1.getImageWidth(), 0);
      (new Thread(new ScrollingBack())).start();
      setVisible(true);
   }
   
   public void run() {
      try {
         while (true) {
            Thread.currentThread().sleep(5);
            repaint();
         }
      } catch (Exception e) {
      }
   }
   
   public void update(Graphics frame) {
        paint(frame);
   }
   
   public void paint(Graphics frame){
      Graphics2D g2d = (Graphics2D) frame;
      if(back == null){
         back = (BufferedImage)(createImage(getWidth(), getHeight()));
      }
      
      Graphics buffer = back.createGraphics();
      back1.draw(buffer);
      back2.draw(buffer);
      g2d.drawImage(back, null, 0, 0);
   }
}