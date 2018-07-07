package main.java.com.ch_02_using_objects.e_02_08_reverse_tester;

/**
 * The {@code StringBuilder} class has a method for reversing a string.
 * In a {@code ReverseTester} class, construct a {@code StringBuilder} from a
 * given string (such as "{@code desserts}"), call the {@code reverse} method
 * followed by the {@code toString} method, and print the result. Also print
 * the expected value.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class ReverseTester {
    public static void main(String[] args) {
        String string = new StringBuilder("desserts").reverse().toString();
        System.out.println("Original word: desserts");
        System.out.println("Expected value: stressed");
        System.out.println("Actual value: " + string);
    }
}
