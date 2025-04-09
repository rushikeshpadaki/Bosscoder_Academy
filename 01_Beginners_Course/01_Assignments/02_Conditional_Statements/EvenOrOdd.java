/**
 * Program Name   : Even or Odd Checker
 * Author Name    : Rushikesh Padaki
 * Date           : 08 April 2025
 *
 * Program Objective:
 * To determine whether a given integer is even or odd using modular arithmetic.
 *
 * Description:
 * This program prompts the user to enter an integer and then checks whether the number
 * is even or odd. A number is even if it is divisible by 2, otherwise it's odd.
 *
 * Algorithm:
 * 1. Define a method `checkEven` that takes an integer and returns true if it is divisible by 2.
 * 2. Read an integer input from the user using Scanner.
 * 3. Call the `checkEven` method to determine whether the number is even.
 * 4. Print "Even" if true; else print "Odd".
 *
 * Time Complexity:
 * - O(1) : Constant time for modulus and conditional check.
 *
 * Space Complexity:
 * - O(1) : Constant space usage.
 *
 * Sample Executions:
 *
 * Case 1: Even number
 * Input  :  Enter a number: 12
 * Output :  The entered number is Even!
 *
 * Case 2: Odd number
 * Input  :  Enter a number: 17
 * Output :  The entered number is Odd!
 *
 * Case 3: Edge case (zero)
 * Input  :  Enter a number: 0
 * Output :  The entered number is Even!
 */

import java.util.Scanner;

public class EvenOrOdd {
    static boolean checkEven(int num) {
        return (num % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (checkEven(num))
            System.out.println("The entered number is Even!");
        else
            System.out.println("The entered number is Odd!");

        sc.close();
    }
}