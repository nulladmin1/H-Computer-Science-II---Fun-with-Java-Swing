// Skyline

import java.awt.*;
import javax.swing.*;

public class Skyline extends JPanel {
   // Colors
   final Color BACKGROUNDCOLOR = new Color(19, 24, 98);
   final Color GROUND = new Color(20, 20, 20);
   final Color BUILDING1 = new Color(34, 34, 34);
   final Color BUILDING2 = new Color(69, 69, 69);
   final Color SOFTYELLOW = new Color(255, 255, 191);
   final Color DARKBLUE = new Color(0, 0, 139);

   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      setBackground(BACKGROUNDCOLOR);

      int height = getHeight();
      int width = getWidth();
   
      int centerX = width / 2;
      int centerY = height / 2;
   
      // Ground
      g.setColor(GROUND);
      g.fillRect(0, centerY, width, height);
   
      // Building 1
      g.setColor(BUILDING1);
      g.fillRect(100, centerY - 200, 200, 500);
   
      boolean window = false;
      for (int i = 2; i <= 10; i++) {
        if (Math.random() > 0.5) {
          g.setColor(SOFTYELLOW);
        } else {
          g.setColor(GROUND);
        }
   
        if (window) {
           g.fillRect(150, centerY - 300 + (50 * i), 100, 50);
        }
           window = !window;
      }
       
      // Building 2
      g.setColor(BUILDING2);
      g.fillRect(200, centerY - 300, 100, 700);
      
      g.setColor(Color.BLACK);
      g.fillRect(245, centerY - 400, 10, 100);
      
      g.setColor(DARKBLUE);
      g.fillRect(210, centerY - 200, 80, 500);
      
      // Building 3
      g.setColor(BUILDING1);
      
      g.fillRect(300, centerY - 100, 100, 500);
      
      for (int i = 2; i <= 10; i++) {
        if (Math.random() > 0.5) {
          g.setColor(SOFTYELLOW);
        } else {
          g.setColor(GROUND);
        }
   
        if (window) {
           g.fillRect(310, centerY - 150 + (50 * i), 80, 50);
        }
           window = !window;
      }
      
      // Building 4
      g.setColor(BUILDING2);
      g.fillRect(450, centerY - 300, 100, 700);
      
      for (int i = 2; i <= 40; i++) {
        if (Math.random() > 0.5) {
          g.setColor(SOFTYELLOW);
        } else {
          g.setColor(GROUND);
        }
   
        if (window) {
           g.fillRect(470, centerY - 300 + (20 * i), 60, 20);
        }
           window = !window;
      }
      
      // Building 5
      g.setColor(BUILDING1);
      
      g.fillRect(560, centerY - 100, 100, 400);
      
      for (int i = 2; i <= 10; i++) {
        if (Math.random() > 0.5) {
          g.setColor(SOFTYELLOW);
        } else {
          g.setColor(GROUND);
        }
   
        if (window) {
           g.fillRect(570, centerY - 100 + (40 * i), 80, 40);
        }
           window = !window;
      }
      
      // Building 6
      g.setColor(BUILDING2);
      g.fillRect(600, centerY - 400, 100, 900);
      
      for (int i = 2; i <= 30; i++) {
        if (Math.random() > 0.5) {
          g.setColor(SOFTYELLOW);
        } else {
          g.setColor(GROUND);
        }
   
        if (window) {
           g.fillRect(620, centerY - 500 + (30 * i), 60, 30);
        }
           window = !window;
      }
      
      // Building 7
      g.setColor(BUILDING1);
      g.fillRect(750, centerY - 200, 100, 600);
      
      for (int i = 2; i <= 25; i++) {
        if (Math.random() > 0.5) {
          g.setColor(SOFTYELLOW);
        } else {
          g.setColor(GROUND);
        }
   
        if (window) {
           g.fillRect(760, centerY - 100 + (30 * i), 80, 20);
        }
           window = !window;
      }
      
      // Building 8     
      g.setColor(BUILDING2);

      g.fillRect(900, centerY - 100, 200, 600);
      
      for (int i = 2; i <= 20; i++) {
        if (Math.random() > 0.5) {
          g.setColor(SOFTYELLOW);
        } else {
          g.setColor(GROUND);
        }
   
        if (window) {
           g.fillRect(920, centerY - 100 + (30 * i), 160, 40);
        }
           window = !window;
      }
  }
}
;
