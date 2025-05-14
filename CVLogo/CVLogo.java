// Abstract

import java.awt.*;
import javax.swing.*;

public class CVLogo extends JPanel {
  public void paintComponent(Graphics g) {

    super.paintComponent(g);
    setBackground(Color.WHITE);

    int height = getHeight();
    int width = getWidth();

    int centerX = width / 2;
    int centerY = height / 2;

    // Red arcs

    g.setColor(Color.RED);
    g.fillOval(100, 200, 600, 400);

    g.setColor(Color.WHITE);
    g.fillOval(150, 240, 600, 320);

    // top black line

    g.setColor(Color.BLACK);
    g.drawArc(200, 300, 800, 320, 0, 180);
  }
}
;
