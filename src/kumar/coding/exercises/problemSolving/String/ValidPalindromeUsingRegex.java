package kumar.coding.exercises.problemSolving.String;
/**
 * This is to find if it is valid palindrome or not using regex 
 * to ignore non alphanumeric characters.
 * @author Kumar
 *
 */
public class ValidPalindromeUsingRegex {

	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama" ;
		input = input.replaceAll("\\W","");
		String reverse = new StringBuffer(input).reverse().toString();
		System.out.println(input.equalsIgnoreCase(reverse));

	}

}
