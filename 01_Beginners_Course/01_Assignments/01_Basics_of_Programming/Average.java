/**
 * Program Name : Average of Two Integers
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * To compute and display the average of two integers entered by the user.
 *
 * Description:
 * - The program uses the Scanner class to read two integer inputs from the user.
 * - It calculates the average of the two numbers using the formula: (num1 + num2) / 2.
 * - The result is printed in a readable format.
 * - Note: This program performs integer division, so fractional parts will be truncated.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first integer and store it in `num1`.
 * 2. Prompt the user to enter the second integer and store it in `num2`.
 * 3. Calculate the average using integer division.
 * 4. Print the result in the format "Average of num1 and num2 = result".
 *
 * Time Complexity:
 * - O(1): Simple arithmetic and input/output operations.
 *
 * Space Complexity:
 * - O(1): Only two integer variables are used.
 *
 * Sample Input/Output:
 *
 * Case 1:
 * Input:
 * Enter first number: 10
 * Enter second number: 20
 * Output:
 * Average of 10 and 20 = 15
 *
 * Case 2:
 * Input:
 * Enter first number: 7
 * Enter second number: 5
 * Output:
 * Average of 7 and 5 = 6
 *
 * Case 3:
 * Input:
 * Enter first number: -4
 * Enter second number: 6
 * Output:
 * Average of -4 and 6 = 1
 */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Average of " + num1 + " and " + num2 + " = " + ((num1 + num2) / 2));

        sc.close();
    }
}