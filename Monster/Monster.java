// Monster

import java.awt.*;
import javax.swing.*;

public class Monster extends JPanel {
  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    int height = getHeight();
    int width = getWidth();

    int centerX = width / 2;
    int centerY = height / 2;

    // Body
    g.setColor(Color.GREEN);

    int xPos[] = {100, 300, 700};
    int yPos[] = {700, 300, 700};

    g.fillPolygon(xPos, yPos, 3);
  }
}
;
