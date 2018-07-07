package main.java.com.ch_02_using_objects.e_02_18_two_squares;

import javax.swing.*;

/**
 * Write a graphics program that draws two squares, both with the same center.
 * Provide a class {@code TwoSquareViewer} and a class {@code TwoSquareComponent}.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class TwoSquareViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Two squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
