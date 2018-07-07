package main.java.com.ch_02_using_objects.e_02_12_die_simulator;

import java.util.Random;

/**
 * The {@code Random} class implements a <em>random number generator</em>,
 * which produces sequences of numbers that appear to be random. To generate
 * random integers, you construct an object of the {@code Random} class,
 * and then apply the {@code nextInt} method. For example, the call
 * {@code generator.nextInt(6)} gives you a random number between 0 and 5.
 * <p>
 * Write a program {@code DieSimulator} that uses the {@code Random} class to
 * simulate the cast of a die, printing a random number between 1 and 6 every
 * time that the program is run.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */

public class DieSimulator {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomNumber = generator.nextInt(6) + 1;
        System.out.println("Random number is: " + randomNumber);

    }
}
