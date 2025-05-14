// Abstract

import java.awt.*;
import javax.swing.*;

public class CVLogo extends JPanel {
  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    int height = getHeight();
    int width = getWidth();

    int centerX = width / 2;
    int centerY = height / 2;

    // Red arcs

    g.setColor(Color.RED);
    g.drawOval(100, 100, 600, 600);
  }
}
;
