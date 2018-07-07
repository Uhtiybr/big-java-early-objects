package main.java.com.ch_02_using_objects.e_02_11_darker_demo;

import java.awt.*;

/**
 * Repeat Exercise E2.9, but apply the darker method of the Color class twice
 * to the object {@code Color.RED}. Call your class {@code DarkerDemo}.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class DarkerDemo {
    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println("Original value: " + color);
        color = color.darker().darker();
        System.out.println("After making twice darker: " + color);
    }
}