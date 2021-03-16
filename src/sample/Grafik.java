import javax.swing.*;
import java.awt.*;

public class Grafik extends Canvas {
    public Grafik() {
        JFrame frame = new JFrame( "A simple graphic thing");
        this.setSize(1920,1080);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRoundRect(400, 300, 200, 200, 200, 200);
        g.setColor(new Color(333, 333, 333));
        g.drawOval(500, 400,10,10);

    }

}
