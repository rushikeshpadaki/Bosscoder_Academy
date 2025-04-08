/**
 * Program Name : Natural Number Sum Calculator
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * To calculate and display the sum of the first 'n' natural numbers using a direct mathematical formula.
 *
 * Description:
 * - The program prompts the user to input a positive integer `n`.
 * - It then calculates the sum of the first `n` natural numbers using the formula: sum = n * (n + 1) / 2.
 * - The result is printed in a formatted message.
 *
 * Algorithm:
 * 1. Prompt the user to enter a positive number `n`.
 * 2. Read the number from the user.
 * 3. Compute the sum using the formula: n * (n + 1) / 2.
 * 4. Display the result.
 *
 * Time Complexity:
 * - O(1): The sum is computed in constant time using a formula.
 *
 * Space Complexity:
 * - O(1): No additional space required beyond a few variables.
 *
 * Sample Input/Output:
 *
 * Case 1:
 * Input:
 * Enter a number (n > 0): 5
 * Output:
 * Sum of natural numbers from 1 to 5 = 15
 *
 * Case 2:
 * Input:
 * Enter a number (n > 0): 10
 * Output:
 * Sum of natural numbers from 1 to 10 = 55
 *
 * Case 3:
 * Input:
 * Enter a number (n > 0): 1
 * Output:
 * Sum of natural numbers from 1 to 1 = 1
 */

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n > 0): ");
        int n = sc.nextInt();

        System.out.println("Sum of natural numbers from 1 to " + n + " = " + ((n * (n + 1)) / 2));

        sc.close();
    }
}