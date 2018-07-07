package main.java.com.ch_02_using_objects.e_02_20_name;

import javax.swing.*;

/**
 * Write a graphics program that draws your name in red, contained inside a
 * blue rectangle. Provide a class {@code NameViewer} and a class
 * {@code NameComponent}.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class NameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Name inside rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NameComponent component = new NameComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
