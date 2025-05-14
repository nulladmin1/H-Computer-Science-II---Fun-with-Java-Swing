// Landscape

import java.awt.*;
import javax.swing.*;

public class House extends JPanel {
  final Color GRASS = new Color(19, 109, 21);
  final Color SKY = new Color(135, 206, 235);

  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    int height = getHeight();
    int width = getWidth();

    int centerX = width / 2;
    int centerY = height / 2;

    // draw the sky
    g.setColor(SKY);
    g.fillRect(0, 0, width, height / 2);

    // draw the grass
    g.setColor(GRASS);
    g.fillRect(0, height / 2, width, height / 2);

    // Sun
    g.setColor(Color.YELLOW);
    g.fillOval(100, 100, 100, 100);

    // Clouds
    int cloudHeight;
    int randHeight;
    int randWidth;
    
    g.setColor(Color.WHITE);

    for (int i = 0; i < 10; i++) {
      randHeight = 70 + (int) (Math.random() * 50);
      randWidth = 70 + (int) (Math.random() * 150);

      if (Math.random() > 0.5) {
        cloudHeight = 100;
      } else {
        cloudHeight = 150;
      }

      g.fillOval(200 + i * 100, cloudHeight, randWidth, randHeight);
    }

    // House
    int roofX[] = {centerX, centerX - 200, centerX + 200};
    int roofY[] = {200, 300, 300};
    
    g.setColor(Color.DARK_GRAY);

    g.fillPolygon(roofX, roofY, roofX.length);
    
    g.fillRect(centerX - 75, 150, 50, 100);
    
    g.setColor(Color.LIGHT_GRAY);
    g.fillOval(centerX - 75, 100, 50, 50);
    g.fillOval(centerX - 25, 100, 50, 50);

    
    Color color = new Color(224, 201, 146);
    
    g.setColor(Color.RED);
    g.fillRect(centerX - 100, 300, 200, 300);
    
    g.setColor(Color.BLUE);
    g.fillRect(centerX - 80, 350, 50, 100);

    g.fillRect(centerX + 20, 350, 50, 100);
    
    g.setColor(color);
    g.fillRect(centerX - 25, 500, 50, 100);


  }
}
;
