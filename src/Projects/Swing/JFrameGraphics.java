package Projects.Swing;

import javax.swing.*;
import java.awt.*;

public class JFrameGraphics extends Canvas {

    @Override
    public void paint(Graphics g) {
        Font f = new Font("Font1",1,12);
        g.setFont(f);
        g.drawString("Hello, world!", 100, 100);
        Color c = new Color(0x3434A7);
        g.setColor(c);
        g.fillOval(400,400,20,20);
    }

    public static void main(String[] args) {
        JFrameGraphics g = new JFrameGraphics();

        JFrame f = new JFrame();
        f.add(g);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
