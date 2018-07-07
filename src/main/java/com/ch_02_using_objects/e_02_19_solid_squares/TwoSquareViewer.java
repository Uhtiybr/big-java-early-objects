package main.java.com.ch_02_using_objects.e_02_19_solid_squares;

import javax.swing.*;

/**
 * Write a program that draws two solid squares: one in pink and one in
 * purple. Use a standard color for one of them and a custom color for the
 * other. Provide a class {@code TwoSquareViewer} and a class
 * {@code TwoSquareComponent}.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class TwoSquareViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Two solid squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
