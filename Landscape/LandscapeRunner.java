// Abstract Runner

import javax.swing.*;

public class LandscapeRunner {
  public static void main(String[] args) {
    Landscape a = new Landscape();

    JFrame frame1 = new JFrame();

    frame1.add(a);

    frame1.setSize(800, 800);

    frame1.setVisible(true);

    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
