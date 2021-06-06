package ex22.base;

import java.util.Scanner;

/**
 * Exercise 22 - Comparing Numbers
 * Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.
 *
 * Write a program that asks for three numbers. Check first to see that all numbers are different.
 * If they’re not different, then exit the program. Otherwise, display the largest number of the three.
 *
 * Example Output
 *
 * Enter the first number: 1
 * Enter the second number: 51
 * Enter the third number: 2
 * The largest number is 51.
 *
 * Constraint
 *
 * Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 *
 * Challenges
 *
 * Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
 * Modify the program so that it asks for ten numbers instead of three.
 * Modify the program so that it asks for an unlimited number of numbers.
 */

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] numbers = {0,0,0};
		System.out.print("Enter the first number: ");
		numbers[0] = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the second number: ");
		numbers[1] = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the third number: ");
		numbers[2] = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					System.out.println("You can't enter the same number more than once!!");
					return;
				}
			}
		}
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > max)
				max = numbers[i];
		}
		
		System.out.println("The largest number is " + max);
	}
}
