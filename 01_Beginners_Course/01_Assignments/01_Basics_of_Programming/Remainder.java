/**
 * Program Name : Remainder Calculator
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * This program calculates and displays the remainder when one integer is divided by another.
 *
 * Description:
 * - The program takes two integers as input from the user.
 * - It then calculates the remainder using the modulus operator (%).
 * - Finally, it prints the result in a formatted output.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first number and store it in `num1`.
 * 2. Prompt the user to enter the second number and store it in `num2`.
 * 3. Calculate the remainder using `num1 % num2`.
 * 4. Print the formatted result.
 *
 * Time Complexity:
 * - O(1) : Constant time for input, calculation, and output.
 *
 * Space Complexity:
 * - O(1) : Constant space usage.
 *
 * Sample Input/Output:
 * Case 1:
 * Input:
 * Enter first number: 10
 * Enter second number: 3
 * Output:
 * 10 % 3 = 1
 *
 * Case 2:
 * Input:
 * Enter first number: 25
 * Enter second number: 7
 * Output:
 * 25 % 7 = 4
 *
 * Case 3:
 * Input:
 * Enter first number: 100
 * Enter second number: 10
 * Output:
 * 100 % 10 = 0
 */

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        sc.close();
    }
}