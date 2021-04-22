package Projects.Physics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PhysicsCLI implements ItemListener {

    private static JPanel cards;
    final static String KINEMATICS_PANEL =  "Kinematics Equations";
    final static String ENERGY_PANEL = "Energy Equations";

    private static JPanel card1 = new JPanel();
    private static JPanel card2 = new JPanel();

    public void addComponentToPane(Container pane){

        JPanel comboBoxPane = new JPanel();
        String comboBoxItems[] = {KINEMATICS_PANEL, ENERGY_PANEL};
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);

        card1.add(new JButton("v\u2093 =v" +
                "\u2093\u2092" +
                "\u200B" +
                "+at"));

        cards = new JPanel(new CardLayout());
        cards.add(card1,KINEMATICS_PANEL);
        cards.add(card2,ENERGY_PANEL);

        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, (String) e.getItem());
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Physics Helper");

        Dimension minWindowSize = new Dimension();
        minWindowSize.setSize(500,200);
        frame.setMinimumSize(minWindowSize);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        PhysicsCLI physicsLayout = new PhysicsCLI();
        physicsLayout.addComponentToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);

        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


}
