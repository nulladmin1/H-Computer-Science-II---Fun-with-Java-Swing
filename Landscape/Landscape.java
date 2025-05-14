// Landscape

import java.awt.*;
import javax.swing.*;

public class Landscape extends JPanel {
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

    for (int i = 0; i < 10; i++) {
      randHeight = 70 + (int) (Math.random() * 50);
      randWidth = 70 + (int) (Math.random() * 150);

      if (Math.random() > 0.5) {
        g.setColor(Color.LIGHT_GRAY);
      } else {
        g.setColor(Color.WHITE);
      }

      if (Math.random() > 0.5) {
        cloudHeight = 100;
      } else {
        cloudHeight = 150;
      }

      g.fillOval(200 + i * 100, cloudHeight, randWidth, randHeight);
    }

    // Hill
    int hillPosX[] = {400, 200, 600};
    int hillPosY[] = {200, 600, 600};
    
    g.setColor(Color.DARK_GRAY);

    g.fillPolygon(hillPosX, hillPosY, hillPosX.length);

  }
}
;
