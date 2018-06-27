package main.java.com.ch_01_introduction.e_01_16_hello_name_v2;

import javax.swing.*;

/**
 * Type in and run the following program:
 * <p><pre>
 *      import javax.swing.JOptionPane;
 *      public class DialogViewer
 *      {
 *          public static void main(String[] args)
 *          {
 *              String name = JOptionPane.showInputDialog("What is your name?");
 *              System.out.println(name);
 *          }
 *      }</pre>
 * Then modify the program to print "Hello, name!", displaying the name
 * that the user typed in.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 27.06.2018
 */

public class DialogViewer {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name);
    }
}