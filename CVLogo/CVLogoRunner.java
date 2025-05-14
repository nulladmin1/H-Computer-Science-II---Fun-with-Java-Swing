// Abstract Runner

import javax.swing.*;

public class CVLogoRunner {
  public static void main(String[] args) {
    CVLogo a = new CVLogo();

    JFrame frame1 = new JFrame();

    frame1.add(a);

    frame1.setSize(800, 800);

    frame1.setVisible(true);

    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
