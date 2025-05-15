// Spirograph Runner

import javax.swing.*;

public class SpirographRunner {
  public static void main(String[] args) {
    Spirograph a = new Spirograph();

    JFrame frame1 = new JFrame();

    frame1.add(a);

    frame1.setSize(800, 800);

    frame1.setVisible(true);

    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
