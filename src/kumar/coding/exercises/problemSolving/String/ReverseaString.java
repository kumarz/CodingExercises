package kumar.coding.exercises.problemSolving.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * This exercise is to reverse a string without using String class
 * @author kumas12
 * Things to keep in mind are to avoid Synchronization, then please use StringBuilder
 *
 *
 */
public class ReverseaString {

	public static void main(String[] args) {
		String input = "12345897654343234ifhvjkfoknmsd'p3ilrhksdryt8ofilsdvjhflcvsdncm;as,c.cqwldks567790987jhrkehfgwyirhjkdsdf;r3lekfdslfhvnc;cmldf;elkfjvvuy9prypfi34lhwfsdkl65437897654ewhjkrhkjghkaraewrlekfhdks;lhjwrfkshdjlwerhjkhrjkherjkhfjkjkfhdjfasjdefuoereslf3"+
						"12345897654343234ifhvjkfoknmsd'p3ilrhksdryt8ofilsdvjhflcvsdncm;as,c.cqwldks567790987jhrkehfgwyirhjkdsdf;r3lekfdslfhvnc;cmldf;elkfjvvuy9prypfi34lhwfsdkl65437897654ewhjkrhkjghkaraewrlekfhdks;lhjwrfkshdjlwerhjkhrjkherjkhfjkjkfhdjfasjdefuoereslf3";
		
		//Approach#1
		long startTime = System.currentTimeMillis();
		StringBuffer str = new StringBuffer(input).reverse();
		long endTime = System.currentTimeMillis();
		System.out.println("Given String is " + input);
		System.out.println("Reversed string using Approach#1 StringBuffer is " + str);
		System.out.println("Time taken using StringBuffer is "+ (endTime - startTime));
		
		// Appraoch#2
		startTime = System.currentTimeMillis();
		Stack<Character> tempStack = new Stack<Character>();
		List<Character> sorted = new ArrayList<Character>();
		for(char item: input.toCharArray()){
			tempStack.push(item);
		}
		
		while(!tempStack.isEmpty()){
			sorted.add(tempStack.pop());
		}
		endTime = System.currentTimeMillis();
		System.out.println("Reversed string using Approach#2 Stack is " + sorted);
		System.out.println("Time taken using Stack is "+ (endTime - startTime));
	}

}
