package main.java.com.ch_01_introduction.e_01_17_hello_name_v3;

import javax.swing.*;

/**
 * Modify the program from Exercise E1.16 so that the dialog continues with the mes-
 * sage “My name is Hal! What would you like me to do?” Discard the user’s input and
 * display a message such as
 * I'm sorry, Dave. I'm afraid I can't do that.
 * Replace Dave with the name that was provided by the user.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 27.06.2018
 */

public class DialogViewer {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name);
        JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
        JOptionPane.showMessageDialog(null, "I'm sorry, " + name
                + ". I'm afraid I can't do that.");
    }
}
