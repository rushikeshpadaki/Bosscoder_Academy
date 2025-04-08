/**
 * Program Name : Multiplication of Two Integers
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * To multiply two integers entered by the user and display the result.
 *
 * Description:
 * - This program reads two integers from the user using the Scanner class.
 * - It then calculates their product using the multiplication operator `*`.
 * - The result is printed in a formatted manner showing the full expression.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first number and store it in `num1`.
 * 2. Prompt the user to enter the second number and store it in `num2`.
 * 3. Multiply `num1` and `num2`.
 * 4. Display the result in the form "num1 * num2 = result".
 *
 * Time Complexity:
 * - O(1): Performs a single multiplication operation.
 *
 * Space Complexity:
 * - O(1): Constant space usage for two integers.
 *
 * Sample Input/Output:
 *
 * Case 1:
 * Input:
 * Enter first number: 7
 * Enter second number: 4
 * Output:
 * 7 * 4 = 28
 *
 * Case 2:
 * Input:
 * Enter first number: 5
 * Enter second number: 0
 * Output:
 * 5 * 0 = 0
 *
 * Case 3:
 * Input:
 * Enter first number: -3
 * Enter second number: 6
 * Output:
 * -3 * 6 = -18
 */

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        sc.close();
    }
}