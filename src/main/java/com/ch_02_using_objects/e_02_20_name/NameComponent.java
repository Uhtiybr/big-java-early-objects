package main.java.com.ch_02_using_objects.e_02_20_name;

import javax.swing.*;
import java.awt.*;

public class NameComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLUE);
        Rectangle rectangle = new Rectangle(45, 150, 65, 40);
        g2.fill(rectangle);
        g2.draw(rectangle);

        g2.setColor(Color.RED);
        g2.drawString("Alexander", 50, 175);


    }

}
