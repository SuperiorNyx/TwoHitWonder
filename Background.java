import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Background{
   private BufferedImage img;
   private int x;
   private int y;
   
   public Background(){
      this(0,0);
   }
   
   public Background(int x, int y){
      this.x = x;
      this.y = y;
      try{
         img = ImageIO.read(new File("backsample.png"));
      } catch (Exception e){
         System.out.println(e);
      }
   }
   
   public void draw(Graphics frame){
      frame.drawImage(img, getX(), getY(), img.getWidth(), img.getHeight(), null);
      this.x -= 5;
      
      if(this.x <= -1 * img.getWidth()){
         this.x += img.getWidth() * 2;
      }
   }
   
   public void setX(int x){
      this.x = x;
   }
   
   
   public int getX(){
      return this.x;
   }
   
   public int getY(){
      return this.y;
   }
   
   public int getImageWidth(){
      return img.getWidth();
   }
   
   public String toString(){
      return "Background: x=" + getX() + ", y=" + getY() + ", height=" + img.getHeight() + ", width=" + img.getWidth();
   }
}