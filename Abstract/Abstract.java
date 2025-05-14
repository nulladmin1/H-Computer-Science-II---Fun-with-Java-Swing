// Abstract

import java.awt.*;
import javax.swing.*;

public class Abstract extends JPanel {
  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    int height = getHeight();
    int width = getWidth();

    int centerX = width / 2;
    int centerY = height / 2;

    for (int i = 0; i < 10; i++) {
      Color c =
          new Color(
              (int) (Math.random() * 255),
              (int) (Math.random() * 255),
              (int) (Math.random() * 255),
              (int) (Math.random() * 255));
      g.setColor(c);

      g.fillArc(
          (int) (width * Math.random()),
          (int) (height * Math.random()),
          200,
          200,
          (int) (Math.random() * 360),
          (int) (Math.random() * 360));
    }

    for (int i = 0; i < 10; i++) {
      Color c =
          new Color(
              (int) (Math.random() * 255),
              (int) (Math.random() * 255),
              (int) (Math.random() * 255),
              (int) (Math.random() * 255));
      g.setColor(c);
      g.fillRect((int) (width * Math.random()), (int) (height * Math.random()), 200, 200);
    }

    for (int i = 0; i < 10; i++) {
      Color c =
          new Color(
              (int) (Math.random() * 255),
              (int) (Math.random() * 255),
              (int) (Math.random() * 255));
      g.setColor(c);
      g.fillOval((int) (width * Math.random()), (int) (height * Math.random()), 50, 50);
    }
  }
}
;
