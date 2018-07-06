package main.java.com.ch_02_using_objects.e_02_04_rectangle_42;

import java.awt.*;

/**
 * Write a program that constructs a rectangle with area 42 and a rectangle with
 * perimeter 42. Print the widths and heights of both rectangles.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 06.07.2018
 */
public class Rectangle42 {
    public static void main(String[] args) {
        Rectangle rectangleArea = new Rectangle(6, 7);

        double areaWidth = rectangleArea.getWidth();
        double areaHeight = rectangleArea.getHeight();
        double area = areaHeight * areaWidth;

        System.out.println("Rectangle with width " + areaWidth + " and height " + areaHeight + " has area " + area);

        Rectangle rectanglePerimeter = new Rectangle(10, 11);

        double perimeterWidth = rectanglePerimeter.getWidth();
        double perimeterHeight = rectanglePerimeter.getHeight();
        double perimeter = (perimeterWidth + perimeterHeight) * 2;

        System.out.println("Rectangle with width " + perimeterWidth + " and height " + perimeterHeight + " has perimeter " + perimeter);
    }
}
