package main.java.com.ch_02_using_objects.e_02_05_rectangle_api;

import java.awt.*;

/**
 * Look into the API documentation of the {@code Rectangle} class and locate
 * the method
 * <p><pre>
 *      {@code void add(int newx, int newy)}</pre>
 * Read through the method documentation. Then determine the result of the
 * following statements:
 * <p><pre>
 *      {@code Rectangle box = new Rectangle(5, 10, 20, 30);
 *      box.add(0, 0);}</pre>
 * Write a program {@code AddTester} that prints the expected and actual
 * location, width, and height of {@code box} after the call to {@code add}.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 06.07.2018
 */
public class AddTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);
        double x = box.getX();
        double y = box.getY();
        double width = box.getWidth();
        double height = box.getHeight();
        System.out.println("Actual: x=" + x + ", y=" + y + ", width=" + width + ", height=" + height);
        System.out.println("Expected: x=0.0, y=0.0, width=25.0, height=40.0");
    }
}
