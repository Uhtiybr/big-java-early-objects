package main.java.com.ch_02_using_objects.e_02_01_area_tester;

import java.awt.*;

/**
 * Write an {@code AreaTester} program that constructs a {@code Rectangle}
 * object and then computes and prints its area. Use the {@code getWidth}
 * and {@code getHeight} methods. Also print the expected answer.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 06.07.2018
 */
public class AreaTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10, 15, 20);
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();

        double rectangleArea = width * height;
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
