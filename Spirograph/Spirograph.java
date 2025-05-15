// Spirograph

import java.awt.*;
import javax.swing.*;

public class Spirograph extends JPanel {
  public void paintComponent(Graphics g) {

    super.paintComponent(g);
    setBackground(Color.WHITE);

    int height = getHeight();
    int width = getWidth();

    int centerX = width / 2;
    int centerY = height / 2;

    g.setColor(Color.CYAN);

    for (int i = 0; i < 80; i++) {
      g.drawLine(0, height, (width * (i) / 80), 0);
    }

    for (int i = 0; i < 80; i++) {
      g.drawLine(width, height, 0, (height * (i) / 80));
    }

    for (int i = 0; i < 80; i++) {
      g.drawLine(0, 0, width, (height * (i) / 80));
    }

    for (int i = 0; i < 80; i++) {
      g.drawLine(width, 0, (width * (i) / 80), height);
    }

    g.setColor(Color.RED);

    for (int i = 0; i < 100; i++) {

      double r = i * 5;

      g.fillOval(
          (int) (centerX + r * Math.cos(i) - 10), (int) (centerY + r * Math.sin(i) - 10), 20, 20);
    }

    g.setColor(Color.BLUE);

    for (int i = 0; i < 36; i++) {

      double r = i * 20;

      g.fillOval(
          (int) (centerX + r * Math.sin(i) - 10), (int) (centerY + r * Math.cos(i) - 10), 40, 40);
    }

    g.setColor(Color.GREEN);

    for (int i = 0; i < 100; i++) {

      double r = i * 10;

      g.fillArc(
          (int) (centerX + r * Math.cos(i) - 10),
          (int) (centerY + r * Math.sin(i) - 10),
          100,
          100,
          (i + 360) % 360,
          20);
    }
  }
}
;
