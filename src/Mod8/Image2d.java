
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Image2d {

    private static final int HEIGHT = 350;
    private static final int WIDTH = 350;

    public static void main(String[] args) {
        double[][] data = new double[WIDTH][HEIGHT];
        Random r = new Random();
        //Fill in two d array to create an image
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                data[i][j] = r.nextDouble();
            }
        }

        final BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) img.getGraphics();
        // fill in to create graphic
        for (int i = 0; i < WIDTH; i++) {
            for (double j = 0; j < HEIGHT; j++) {
                if (Math.sin((double)i)-Math.sin(j) > 0){
                    g.setColor(new Color(0.99f, 0f, 0f));
                    g.fillRect(i, (int)j, 1, 1);
                } else {
                    float c = (float) data[i][(int)j];
                    g.setColor(new Color(0f, 0f, 0f));
                    g.fillRect(i, (int)j, 1, 1);
                }
            }
        }


        //Paints to graphic
        JFrame frame = new JFrame("Image test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.clearRect(0, 0, getWidth(), getHeight());
                g2d.setRenderingHint(
                        RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                // Or _BICUBIC
                g2d.scale(2, 2);
                g2d.drawImage(img, 0, 0, this);
            }
        };
        panel.setPreferredSize(new Dimension(WIDTH * 2, HEIGHT * 2));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}