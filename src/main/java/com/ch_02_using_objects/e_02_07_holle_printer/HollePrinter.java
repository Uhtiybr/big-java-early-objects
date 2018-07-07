package main.java.com.ch_02_using_objects.e_02_07_holle_printer;

/**
 * Write a program {@code HollePrinter} that switches the letters "e" and "o"
 * in a string. Use the replace method repeatedly. Demonstrate that the string
 * "Hello, World!" turns into "Holle, Werld!"
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class HollePrinter {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        greeting = greeting.replace('o', '0');
        System.out.println(greeting);
        greeting = greeting.replace('e', 'o');
        System.out.println(greeting);
        greeting = greeting.replace('0', 'e');
        System.out.println(greeting);
    }
}
