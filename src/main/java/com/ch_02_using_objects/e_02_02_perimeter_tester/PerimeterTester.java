package main.java.com.ch_02_using_objects.e_02_02_perimeter_tester;

import java.awt.*;

/**
 * Write a {@code PerimeterTester} program that constructs a {@code Rectangle}
 * object and then computes and prints its perimeter. Use the {@code getWidth}
 * and {@code getHeight} methods. Also print the expected answer.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 06.07.2018
 */
public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10, 15, 20);
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();

        double rectanglePerimeter = (width + height) * 2;
        System.out.println("Area of the rectangle: " + rectanglePerimeter);
    }
}
