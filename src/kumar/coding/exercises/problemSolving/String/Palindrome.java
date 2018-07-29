package kumar.coding.exercises.problemSolving.String;

import java.util.Scanner;

/**
 * 
 * @author Kumar
 * This program is to demonstrate the implementation of Palindrome
 * using iteration Vs Recursive methods.
 * 
 */
public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Please pass a palindrome string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Boolean isPalindrome = checkPalindrome(input);
		System.out.println("Is it a palindrome String: "+ isPalindrome);
		sc.close();
	}

	private static Boolean checkPalindrome(String input) {
		String reverse = new StringBuffer(input).reverse().toString();
		if(input.equalsIgnoreCase(reverse)){
			return true;
		}
		return false;
	}

}
