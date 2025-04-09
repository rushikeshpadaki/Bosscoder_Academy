/**
 * Program Name   : Leap Year Checker
 * Author Name    : Rushikesh Padaki
 * Date           : 08 April 2025
 *
 * Program Objective:
 * To determine whether a given year is a leap year or not based on the Gregorian calendar rules.
 *
 * Description:
 * This program takes a year as input and checks if it is a leap year using standard rules:
 * - A year is a leap year if it is divisible by 4.
 * - But, if it is divisible by 100, it is not a leap year.
 * - However, if it is divisible by 400, then it is a leap year.
 * The logic is encapsulated in the `isLeap` method.
 *
 * Algorithm:
 * 1. Define a method `isLeap` to return true if the year follows leap year rules.
 * 2. Read the year input from the user.
 * 3. Call `isLeap` and display the result based on its return value.
 *
 * Time Complexity:
 * - O(1) : Constant-time arithmetic checks.
 *
 * Space Complexity:
 * - O(1) : No additional memory usage beyond a few variables.
 *
 * Sample Executions:
 *
 * Case 1: Year is a leap year (divisible by 4 and not 100)
 * Input  :  Enter a year: 2024
 * Output :  The entered year is a leap year!
 *
 * Case 2: Year is not a leap year (divisible by 100 but not 400)
 * Input  :  Enter a year: 1900
 * Output :  The entered year is not a leap year!
 *
 * Case 3: Year is a leap year (divisible by 400)
 * Input  :  Enter a year: 2000
 * Output :  The entered year is a leap year!
 *
 * Case 4: Year is not a leap year (not divisible by 4)
 * Input  :  Enter a year: 2023
 * Output :  The entered year is not a leap year!
 */

import java.util.Scanner;

public class LeapYear {
    static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeap(year))
            System.out.println("The entered year is a leap year!");
        else
            System.out.println("The entered year is not a leap year!");

        sc.close();
    }
}