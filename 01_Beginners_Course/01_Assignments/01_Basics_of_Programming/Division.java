/**
 * Program Name : Division of Two Integers
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * To perform division of two integers provided by the user and handle division by zero scenario.
 *
 * Description:
 * - This program takes two integer inputs from the user.
 * - It checks whether the second number (divisor) is zero.
 * - If not zero, it performs integer division and displays the result.
 * - If zero, it prints a message indicating that division is not possible.
 *
 * Algorithm:
 * 1. Prompt and read the first integer from the user.
 * 2. Prompt and read the second integer.
 * 3. If second number is not zero, perform division and print result.
 * 4. If second number is zero, print an error message.
 *
 * Time Complexity:
 * - O(1): Single operation and constant time input.
 *
 * Space Complexity:
 * - O(1): Constant space for storing two integers.
 *
 * Sample Input/Output:
 *
 * Case 1:
 * Input:
 * Enter first number: 10
 * Enter second number: 2
 * Output:
 * 10 / 2 = 5
 *
 * Case 2:
 * Input:
 * Enter first number: 5
 * Enter second number: 0
 * Output:
 * Division operation is not possible as Divisor is zero!
 *
 * Case 3:
 * Input:
 * Enter first number: -15
 * Enter second number: 5
 * Output:
 * -15 / 5 = -3
 */

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num2 != 0)
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        else
            System.out.println("Division operation is not possible as Divisor is zero!");

        sc.close();
    }
}