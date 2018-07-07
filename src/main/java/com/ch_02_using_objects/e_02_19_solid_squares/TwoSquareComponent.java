package main.java.com.ch_02_using_objects.e_02_19_solid_squares;

import javax.swing.*;
import java.awt.*;

public class TwoSquareComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color color = new Color(255, 175, 175);

        Rectangle firstSquare = new Rectangle(200, 50, 100, 100);
        g2.setColor(color);
        g2.fill(firstSquare);
        g2.draw(firstSquare);

        Rectangle secondSquare = new Rectangle(50, 50, 100, 100);
        g2.setColor(Color.MAGENTA);
        g2.fill(secondSquare);
        g2.draw(secondSquare);


    }
}
