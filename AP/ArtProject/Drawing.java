import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Graphics;

class Drawing {
  Drawing() {
    JFrame frame = new JFrame("Art");
    frame.setSize(1000, 618);
    frame.setLocation(10, 10);
    frame.add(new Sierpinski());
    frame.setVisible(true);
  }
}
