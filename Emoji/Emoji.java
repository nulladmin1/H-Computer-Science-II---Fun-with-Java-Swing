// Emoji

import java.awt.*;
import javax.swing.*;

class Emoji extends JPanel {
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      int radius = 600;
      int height = getHeight();
      int width = getWidth();
      
      int centerY = height / 2;
      int centerX = width / 2;
      
      g.setColor(Color.YELLOW);
      
      g.fillOval(centerX - (radius / 2), centerY - (radius / 2), radius, radius);
      
      g.setColor(Color.ORANGE);
      
      g.fillRect(centerX + 50, centerY - 200, 100, 20);
      g.fillRect(centerX - 150, centerY - 200, 100, 20); 
      
      g.setColor(Color.WHITE);
      
      g.fillOval(centerX + 50, centerY - 100, 100, 100);
      g.fillOval(centerX - 150, centerY - 100, 100, 100);
      
      g.setColor(Color.BLACK);
      
      g.fillOval(centerX + 50, centerY - 75, 50, 50);
      g.fillOval(centerX - 150, centerY - 75, 50, 50);
      
      g.setColor(Color.ORANGE);
      g.fillOval(centerX - 100, centerY + 50, 200, 200);
   }
}
