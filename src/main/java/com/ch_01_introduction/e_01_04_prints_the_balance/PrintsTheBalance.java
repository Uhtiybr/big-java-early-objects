package main.java.com.ch_01_introduction.e_01_04_prints_the_balance;

/**
 * Write a program that prints the balance of an account after the first, second, and
 * third year. The account has an initial balance of $1,000 and earns 5 percent interest
 * per year.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 26.06.2018
 */
public class PrintsTheBalance {
    public static void main(String[] args) {
        double balance = 1000;
        double interest;


        for (int year = 1; year < 4; year++) {
            interest = balance * 0.05;
            System.out.println("For the year " + year);
            System.out.println("Interest: " + interest);
            balance = balance + interest;
            System.out.println("Balance: " + balance);
            System.out.println();
        }


    }
}
