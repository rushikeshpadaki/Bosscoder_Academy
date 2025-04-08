/**
 * Program Name : Addition of Three Integers
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * To calculate the sum of three integers entered by the user.
 *
 * Description:
 * - This program prompts the user to enter three integer numbers.
 * - It reads the values using Scanner.
 * - Then it calculates and displays the sum in a formatted expression.
 *
 * Algorithm:
 * 1. Prompt and read the first integer from the user.
 * 2. Prompt and read the second integer.
 * 3. Prompt and read the third integer.
 * 4. Compute the sum of the three integers.
 * 5. Display the expression and the result.
 *
 * Time Complexity:
 * - O(1): Constant time for input and addition operation.
 *
 * Space Complexity:
 * - O(1): Constant space for storing three integer values.
 *
 * Sample Input/Output:
 *
 * Case 1:
 * Input:
 * Enter first number: 10
 * Enter second number: 20
 * Enter third number: 30
 * Output:
 * 10 + 20 + 30 = 60
 *
 * Case 2:
 * Input:
 * Enter first number: -5
 * Enter second number: 10
 * Enter third number: 0
 * Output:
 * -5 + 10 + 0 = 5
 *
 * Case 3:
 * Input:
 * Enter first number: 1
 * Enter second number: 1
 * Enter third number: 1
 * Output:
 * 1 + 1 + 1 = 3
 */

import java.util.Scanner;

public class AdditionOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));

        sc.close();
    }
}