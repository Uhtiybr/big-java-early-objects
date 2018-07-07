package main.java.com.ch_02_using_objects.e_02_18_two_squares;

import javax.swing.*;
import java.awt.*;

public class TwoSquareComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle firstSquare = new Rectangle(100, 100, 100, 100);
        g2.draw(firstSquare);

        Rectangle secondSquare = new Rectangle(50, 50, 200, 200);
        g2.draw(secondSquare);

    }

}
