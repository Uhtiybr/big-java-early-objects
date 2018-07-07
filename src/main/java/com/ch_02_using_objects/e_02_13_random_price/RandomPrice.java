package main.java.com.ch_02_using_objects.e_02_13_random_price;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Write a program {@code RandomPrice} that prints a random price between
 * $10.00 and $19.95 every time the program is run.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class RandomPrice {
    public static void main(String[] args) {
        Random generator = new Random();
        DecimalFormat df = new DecimalFormat("##.##"); //a way to make it only 2 dec places, it's optional
        String randomPrice = df.format(generator.nextDouble() * (19.95 - 10.0) + 10.0);
        System.out.println("Random price is: " + randomPrice);
    }
}
