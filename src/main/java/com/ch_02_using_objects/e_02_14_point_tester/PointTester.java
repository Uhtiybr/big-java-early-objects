package main.java.com.ch_02_using_objects.e_02_14_point_tester;

import java.awt.*;

/**
 * Look at the API of the {@code Point} class and find out how to construct a
 * {@code Point} object. In a {@code PointTester} program, construct two points
 * with coordinates (3, 4) and (–3, –4). Find the distance between them, using
 * the {@code distance} method. Print the distance, as well as the expected
 * value. (Draw a sketch on graph paper to find the value you will expect.)
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class PointTester {
    public static void main(String[] args) {
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(-3, -4);

        double distance = firstPoint.distance(secondPoint);
        System.out.println("Actual distance: " + distance);
        System.out.println("Expected distance: 10.0");
    }
}
