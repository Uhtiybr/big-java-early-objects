package main.java.com.ch_02_using_objects.e_02_15_day_tester;

/**
 * Using the {@code Day} class of Worked Example 2.1, write a {@code DayTester}
 * program that constructs a {@code Day} object representing today, adds ten
 * days to it, and then computes the difference between that day and today.
 * Print the difference and the expected value.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class DayTester {
    public static void main(String[] args) {
        Day today = new Day();
        Day tenDaysFromToday = today.addDays(10);
        int difference = tenDaysFromToday.daysFrom(today);
        System.out.println("Today is: " + today);
        System.out.println("After ten days it will be: " + tenDaysFromToday);
        System.out.println("Actual number of days: " + difference);
        System.out.println("Expected value: 10");


    }
}
