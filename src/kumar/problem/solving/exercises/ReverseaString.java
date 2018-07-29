package kumar.problem.solving.exercises;

/**
 * This exercise is to reverse a string without using String class
 * @author kumas12
 *
 */
public class ReverseaString {

	public static void main(String[] args) {
		String input = "12345";
		StringBuffer str = new StringBuffer(input).reverse();
		System.out.println("Given String is " + input);
		System.out.println("Reversed string using Approach#1 StringBuffer is " + str);
	}

}
