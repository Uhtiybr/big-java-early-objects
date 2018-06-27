package main.java.com.ch_01_introduction.e_01_15_hello_name;

import javax.swing.*;

/**
 * Type in and run the following program:
 * <p><pre>
 *      import javax.swing.JOptionPane;
 * <p>
 *      public class DialogViewer
 *      {
 *          public static void main(String[] args)
 *          {
 *              JOptionPane.showMessageDialog(null, "Hello, World!");
 *          }
 *      }</pre>
 * Then modify the program to show the message "Hello, your name!".
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 27.06.2018
 */

public class DialogViewer {
    public static void main(String[] args) {
        String name = "Alex";
        JOptionPane.showMessageDialog(null, "Hello, " + name);
    }
}