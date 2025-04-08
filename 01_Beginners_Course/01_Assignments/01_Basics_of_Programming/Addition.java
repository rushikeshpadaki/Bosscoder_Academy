/**
 * Program Name : Addition of Two Integers
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * To perform addition of two integers entered by the user.
 *
 * Description:
 * - This program prompts the user to input two integer values.
 * - It reads the input values and computes their sum.
 * - Finally, it prints the result in a formatted manner.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first integer.
 * 2. Read the first integer using Scanner.
 * 3. Prompt the user to enter the second integer.
 * 4. Read the second integer.
 * 5. Add both integers.
 * 6. Display the result in the format: num1 + num2 = result.
 *
 * Time Complexity:
 * - O(1): Constant time for taking inputs and performing addition.
 *
 * Space Complexity:
 * - O(1): Constant space usage for storing two integers.
 *
 * Sample Input/Output:
 *
 * Case 1:
 * Input:
 * Enter first number: 10
 * Enter second number: 15
 * Output:
 * 10 + 15 = 25
 *
 * Case 2:
 * Input:
 * Enter first number: -7
 * Enter second number: 3
 * Output:
 * -7 + 3 = -4
 *
 * Case 3:
 * Input:
 * Enter first number: 0
 * Enter second number: 0
 * Output:
 * 0 + 0 = 0
 */

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        sc.close();
    }
}