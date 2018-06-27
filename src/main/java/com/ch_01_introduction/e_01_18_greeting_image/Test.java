package main.java.com.ch_01_introduction.e_01_18_greeting_image;

import javax.swing.*;
import java.net.URL;

/**
 * Type in and run the following program:
 * <p><pre>
 *      import java.net.URL;
 *      import javax.swing.ImageIcon;
 *      import javax.swing.JOptionPane;
 * <p>
 *      public class Test
 *      {
 *          public static void main(String[] args) throws Exception
 *          {
 *              URL imageLocation = new URL(
 *                  "http://horstmann.com/java4everyone/duke.gif");
 *              JOptionPane.showMessageDialog(null, "Hello", "Title",
 *                  JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
 *          }
 *      }</pre>
 * Then modify it to show a different greeting and image.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 27.06.2018
 */

public class Test {
    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL(
                "http://lurkmore.so/images/8/8d/1238521509967.png"); //replace with your image
        JOptionPane.showMessageDialog(null, "EBA,ETO TI?!", "Title",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}