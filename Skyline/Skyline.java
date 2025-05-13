// Skyline

import java.awt.*;
import javax.swing.*;

public class Skyline extends JPanel {
  public void paintComponent(Graphics g) {

    // Colors
    final Color BACKGROUNDCOLOR = new Color(19, 24, 98);
    final Color GROUND = new Color(20, 20, 20);
    final Color BUILDING1 = new Color(34, 34, 34);
    final Color SOFTYELLOW = new Color(255, 255, 191);

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
  }
}
;
