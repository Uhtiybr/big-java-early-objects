package main.java.com.ch_02_using_objects.e_02_03_mississippi;

/**
 * Write a program that initializes a string with "Mississippi" . Then replace all "i" with
 * "ii" and print the length of the resulting string. In that string, replace all "ss" with "s"
 * and print the length of the resulting string.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 06.07.2018
 */
public class Mississippi {
    public static void main(String[] args) {
        String river = "Mississippi";
        river = river.replace("i", "ii");
        System.out.println("Length of " + river + " is " + river.length());
        river = river.replace("ss", "s");
        System.out.println("Length of " + river + " is " + river.length());

    }
}
