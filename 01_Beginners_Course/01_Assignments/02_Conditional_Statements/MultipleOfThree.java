/**
 * Program Name   : Check If Number Is a Multiple of 3
 * Author Name    : Rushikesh Padaki
 * Date           : 08 April 2025
 *
 * Program Objective:
 * To check whether a given integer is a multiple of 3 using modular arithmetic.
 *
 * Description:
 * This program takes an integer input from the user and checks if it is divisible by 3.
 * A number is considered a multiple of 3 if the remainder when divided by 3 is zero.
 * The logic is implemented in the `isMultipleOfThree` method which returns a boolean.
 *
 * Algorithm:
 * 1. Define a method `isMultipleOfThree` that checks if the number modulo 3 equals 0.
 * 2. Read an integer from the user.
 * 3. Pass the number to the method and check the result.
 * 4. Display a message indicating whether it is a multiple of 3.
 *
 * Time Complexity:
 * - O(1) : Constant time modular operation.
 *
 * Space Complexity:
 * - O(1) : No extra space is used.
 *
 * Sample Executions:
 *
 * Case 1: Number is a multiple of 3
 * Input  :  Enter a number: 9
 * Output :  The entered number is a multiple of 3
 *
 * Case 2: Number is not a multiple of 3
 * Input  :  Enter a number: 10
 * Output :  The entered number is not a multiple of 3
 *
 * Case 3: Negative number that is a multiple of 3
 * Input  :  Enter a number: -15
 * Output :  The entered number is a multiple of 3
 */

import java.util.Scanner;

public class MultipleOfThree {
    static boolean isMultipleOfThree(int num) {
        return (num % 3 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isMultipleOfThree(num))
            System.out.println("The entered number is a multiple of 3");
        else
            System.out.println("The entered number is not a multiple of 3");

        sc.close();
    }
}