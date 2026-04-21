package swing;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;

public class TabColorExample {

    JFrame f;

    TabColorExample() {

        f = new JFrame("Tabbed Pane Example");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        JTabbedPane tp = new JTabbedPane();

        tp.addTab("Cyan", p1);
        tp.addTab("Magenta", p2);
        tp.addTab("Yellow", p3);

        // Event handling for tab change
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();
                String title = tp.getTitleAt(index);
                System.out.println("Selected Color: " + title);
            }
        });

        f.add(tp);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabColorExample();
    }
}