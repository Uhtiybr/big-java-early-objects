package main.java.com.ch_02_using_objects.e_02_06_replace_tester;

/**
 * Write a program {@code ReplaceTester} that encodes a string by replacing all
 * letters "{@code i}" with "{@code !}" and all letters "{@code s}" with
 * "{@code $}". Use the {@code replace} method. Demonstrate that you can
 * correctly encode the string "Mississippi". Print both the actual
 * and expected result.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class ReplaceTester {
    public static void main(String[] args) {
        String river = "Mississippi";
        river = river.replace('i', '!');
        river = river.replace('s', '$');

        System.out.println("Expected: M!$$!$$!pp!");
        System.out.println("Actual: " + river);
    }
}
