/**
 * Program Name   : Maximum of Two Numbers
 * Author Name    : Rushikesh Padaki
 * Date           : 08 April 2025
 *
 * Program Objective:
 * To find and display the maximum of two input integers using conditional logic.
 *
 * Description:
 * This program reads two integer values from the user and determines which one is greater.
 * The logic is encapsulated in a static method `max()` that uses a ternary operator to return
 * the larger of the two numbers. The result is then printed to the console.
 *
 * Algorithm:
 * 1. Define a method `max(int, int)` that returns the greater of the two integers.
 * 2. Prompt the user to enter two integers.
 * 3. Call the `max()` method and display the result.
 *
 * Time Complexity:
 * - O(1) : Single-step comparison.
 *
 * Space Complexity:
 * - O(1) : Constant memory usage.
 *
 * Sample Executions:
 *
 * Case 1: First number is greater
 * Input  :  Enter first number: 25
 *           Enter second number: 10
 * Output :  Maximum of 25 and 10 is: 25
 *
 * Case 2: Second number is greater
 * Input  :  Enter first number: 12
 *           Enter second number: 30
 * Output :  Maximum of 12 and 30 is: 30
 *
 * Case 3: Both numbers are equal
 * Input  :  Enter first number: 15
 *           Enter second number: 15
 * Output :  Maximum of 15 and 15 is: 15
 */

import java.util.Scanner;

public class MaximumOfTwoNumbers {
    static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max(num1, num2));

        sc.close();
    }
}