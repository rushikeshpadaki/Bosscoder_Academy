/**
 * Program Name : Integer Input Reader
 * Author       : Rushikesh Padaki
 * Date         : 08 April 2025
 *
 * Program Objective:
 * To read an integer input from the user and display the entered value.
 *
 * Description:
 * - This program prompts the user to input an integer.
 * - It reads the integer value using `Scanner.nextInt()`.
 * - Finally, it prints the entered number back to the user.
 *
 * Algorithm:
 * 1. Prompt the user to enter an integer.
 * 2. Read the integer using Scanner.
 * 3. Display the integer using a print statement.
 *
 * Time Complexity:
 * - O(1): Constant time for reading and printing a single integer.
 *
 * Space Complexity:
 * - O(1): Uses constant space for storing a single integer variable.
 *
 * Sample Input/Output:
 *
 * Case 1:
 * Input:
 * Enter a number: 42
 * Output:
 * You entered the number : 42
 *
 * Case 2:
 * Input:
 * Enter a number: -123
 * Output:
 * You entered the number : -123
 *
 * Case 3:
 * Input:
 * Enter a number: 0
 * Output:
 * You entered the number : 0
 */

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("You entered the number : " + num);

        sc.close();
    }
}
