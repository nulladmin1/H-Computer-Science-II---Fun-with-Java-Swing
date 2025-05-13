// Emoji Runner

import java.awt.*;
import javax.swing.*;

public class EmojiRunner {
   public static void main(String args[]) {
      Emoji o = new Emoji();
      
      JFrame frame1 = new JFrame();
      
      frame1.add(o);
      
      frame1.setSize(800, 800);
      
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame1.setVisible(true);
   }
}
