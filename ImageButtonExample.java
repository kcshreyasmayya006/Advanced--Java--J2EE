package Swings;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {

    JLabel l1;

    ImageButtonExample() {
        JFrame f = new JFrame("Image Button Example");

        // Label
        l1 = new JLabel();
        l1.setBounds(50, 50, 400, 30);

        // Load images (make sure images are in project folder)
        ImageIcon digitalIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Buttons with images
        JButton b1 = new JButton(digitalIcon);
        JButton b2 = new JButton(hourglassIcon);

        b1.setBounds(50, 100, 120, 120);
        b2.setBounds(200, 100, 120, 120);

        // Event handling
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Digital Clock is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Hour Glass is pressed");
            }
        });

        // Add components
        f.add(b1);
        f.add(b2);
        f.add(l1);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}