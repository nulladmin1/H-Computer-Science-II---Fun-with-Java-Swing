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
      g.fillArc(
          (int) (centerX - (centerX * Math.random())),
          (int) (centerY - (centerY * Math.random())),
          100,
          100,
          0,
          (int) (Math.random() * 360));
    }
  }
}
;
