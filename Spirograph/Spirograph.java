// Spirograph

import java.awt.*;
import javax.swing.*;

public class Spirograph extends JPanel {
  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    int height = getHeight();
    int width = getWidth();

    int centerX = width / 2;
    int centerY = height / 2;

    for (int i = 0; i < 360; i++) {
      double angle = Math.toRadians(i);
      int x = (int) (centerX + 100 * Math.cos(angle));
      int y = (int) (centerY + 100 * Math.sin(angle));
      g.drawLine(centerX, centerY, x, y);
    }
  }
}
;
