/**
 * Program Name : Subtraction of Two Integers
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * To perform subtraction of two integers entered by the user.
 *
 * Description:
 * - This program takes two integer inputs from the user.
 * - It subtracts the second number from the first number.
 * - The result is then printed in a formatted output.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first integer.
 * 2. Read the first integer.
 * 3. Prompt the user to enter the second integer.
 * 4. Read the second integer.
 * 5. Subtract the second integer from the first.
 * 6. Print the result in the format: num1 - num2 = result.
 *
 * Time Complexity:
 * - O(1): Constant time operation.
 *
 * Space Complexity:
 * - O(1): Uses constant space for two integers.
 *
 * Sample Input/Output:
 *
 * Case 1:
 * Input:
 * Enter first number: 15
 * Enter second number: 5
 * Output:
 * 15 - 5 = 10
 *
 * Case 2:
 * Input:
 * Enter first number: 7
 * Enter second number: 9
 * Output:
 * 7 - 9 = -2
 *
 * Case 3:
 * Input:
 * Enter first number: 0
 * Enter second number: 0
 * Output:
 * 0 - 0 = 0
 */

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        sc.close();
    }
}