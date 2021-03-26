import javax.swing.*;
import java.awt.*;

/**
 * This is a class
 * Created 2021-03-16
 *
 * @author Magnus Silverdal        (Jag gör om programmet för att bli som jag vill)
 */
public class JumpGame extends Canvas {
    private int width = 800;
    private int height = 600;

    private int houseX, houseY;
    private int houseVX, houseVY;

    public JumpGame() {
        JFrame frame = new JFrame("A simple painting");
        this.setSize(width,height);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        houseX = 300;
        houseY = 150;
        houseVX = 0;
        houseVY = 1;
    }

    public void update() {
        houseX += houseVX;
        if (houseX > width){
            houseVX = -1;
        }
        if (houseX < 0 ) {
            houseVX = 1;
        }
    }

    public void paint(Graphics g) {
        update();
        Ball(g, houseX,houseY);
        repaint();
    }



    private void Ball(Graphics g, int x, int y) {
        g.setColor(new Color(0xAA1111));
        g.fillOval(x, y-40, 50, 40);
        g.setColor(new Color(0x444444));


    }

    public static void main(String[] args) {
        JumpGame painting = new JumpGame();
    }

}