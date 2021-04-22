package Projects.Swing;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Chaser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Game!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(null);

        chaseGame(frame);

        frame.setVisible(true);
    }

    private static void chaseGame(JFrame frame) {
        JButton entity = new JButton(new ImageIcon("/Users/gabrielwagner/Downloads/robber.png"));
        frame.add(entity);
        entity.setBounds(100,100,231,218);
        entity.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                entity.setLocation((int) (Math.random()*300),(int) (Math.random()*300));
            }
        });
        entity.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
                JTextArea textArea = new JTextArea();
                frame.add(textArea);
                textArea.setEditable(false);
                textArea.append("You win!");
                textArea.setBounds(100,100,100,100);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
