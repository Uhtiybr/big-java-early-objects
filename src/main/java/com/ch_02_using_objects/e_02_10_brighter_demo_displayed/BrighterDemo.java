package main.java.com.ch_02_using_objects.e_02_10_brighter_demo_displayed;

import javax.swing.*;
import java.awt.*;

/**
 * Repeat Exercise E2.9, but place your code into the following class.
 * Then the color will be displayed.
 * <p><pre>
 *      import java.awt.Color;
 *      import javax.swing.JFrame;
 *      public class BrighterDemo
 *      {
 *          public static void main(String[] args)
 *          {
 *              JFrame frame = new JFrame();
 *              frame.setSize(200, 200);
 *              Color myColor = ...;
 *              frame.getContentPane().setBackground(myColor);
 *              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *              frame.setVisible(true);
 *          }
 *      }</pre>
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class BrighterDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor = new Color(50, 100, 150);
        myColor = myColor.brighter();
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
