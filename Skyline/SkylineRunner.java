// Skyline Runner

import javax.swing.*;

public class SkylineRunner {
  public static void main(String[] args) {
    Skyline s = new Skyline();

    JFrame frame1 = new JFrame();

    frame1.add(s);

    frame1.setSize(800, 800);

    frame1.setVisible(true);

    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
