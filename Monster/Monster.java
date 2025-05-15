// Monster

import java.awt.*;
import javax.swing.*;

public class Monster extends JPanel {
  public void paintComponent(Graphics g) {

    super.paintComponent(g);
    g.setColor(Color.BLACK);

    JLabel l = new JLabel("gurt: yo", JLabel.CENTER);
    l.setFont(new Font("SansSerif", Font.PLAIN, 72));

    add(l);

    int height = getHeight();
    int width = getWidth();

    int centerX = width / 2;
    int centerY = height / 2;

    // Body
    g.setColor(Color.GREEN);

    int xPos[] = {100, 300, 700};
    int yPos[] = {700, 300, 700};

    g.fillPolygon(xPos, yPos, 3);

    // Eyes
    g.setColor(Color.WHITE);

    g.fillOval(260, 400, 100, 60);

    g.setColor(Color.BLACK);

    g.fillOval(260, 410, 60, 40);

    // Teeth
    g.setColor(Color.BLACK);

    g.fillRect(200, 550, 250, 90);

    g.setColor(Color.WHITE);
    g.fillRect(210, 560, 50, 30);
    g.fillRect(210, 600, 50, 30);

    g.fillRect(270, 560, 50, 30);

    g.fillRect(330, 560, 50, 30);
    g.fillRect(330, 600, 50, 30);

    g.fillRect(390, 560, 50, 30);
    g.fillRect(390, 600, 50, 30);

    // Arc Hat

    g.setColor(Color.BLUE);

    g.fillArc(200, 200, 300, 300, 0, 180);

    // Wheels
    g.setColor(Color.RED);
    g.fillOval(100, 700, 100, 100);
    g.fillOval(300, 700, 100, 100);
    g.fillOval(500, 700, 100, 100);
  }
}
;
