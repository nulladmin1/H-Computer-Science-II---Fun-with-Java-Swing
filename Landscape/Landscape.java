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
  }
}
;
