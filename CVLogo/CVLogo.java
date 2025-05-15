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

    int xPos[] = {250, 570, 650, 550};
    int yPos[] = {300, 280, 330, 300};

    g.fillPolygon(xPos, yPos, xPos.length);

    g.setColor(Color.RED);
    g.fillOval(560, 345, 40, 30);

    g.setColor(Color.BLACK);

    int xPos2[] = {500, 560, 650, 700, 700, 650};
    int yPos2[] = {360, 340, 330, 360, 400, 360};
    g.fillPolygon(xPos2, yPos2, xPos2.length);

    int xPos3[] = {200, 400, 640, 400};
    int yPos3[] = {400, 550, 380, 500};
    g.fillPolygon(xPos3, yPos3, xPos3.length);
  }
}
;
