/**
 * Program Name   : Check If Number Is Positive
 * Author Name    : Rushikesh Padaki
 * Date           : 08 April 2025
 *
 * Program Objective:
 * To determine whether a given integer is positive using a simple conditional check.
 *
 * Description:
 * This program takes an integer input from the user and checks if it is greater than zero.
 * A number greater than 0 is considered positive. The logic is encapsulated in the
 * `isPositive` method which returns a boolean value.
 *
 * Algorithm:
 * 1. Define a method `isPositive` that checks whether a number is greater than 0.
 * 2. Take input from the user using Scanner.
 * 3. Use the `isPositive` method to evaluate the input.
 * 4. Display appropriate output based on the result.
 *
 * Time Complexity:
 * - O(1) : Single comparison operation.
 *
 * Space Complexity:
 * - O(1) : Constant space usage.
 *
 * Sample Executions:
 *
 * Case 1: Positive number
 * Input  :  Enter a number: 25
 * Output :  The entered number is positive!
 *
 * Case 2: Zero
 * Input  :  Enter a number: 0
 * Output :  The entered number is not positive!
 *
 * Case 3: Negative number
 * Input  :  Enter a number: -10
 * Output :  The entered number is not positive!
 */

import java.util.Scanner;

public class CheckPositive {
    static boolean isPositive(int num) {
        return (num > 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPositive(num))
            System.out.println("The entered number is positive!");
        else
            System.out.println("The entered number is not positive!");

        sc.close();
    }
}