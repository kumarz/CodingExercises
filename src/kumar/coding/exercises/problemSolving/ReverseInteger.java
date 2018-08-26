package kumar.coding.exercises.problemSolving;
/**
 * We are checking if the integer is a palindrome.
 * Time complexity : O(log10(n). We divided the input by 10 for every iteration, so the time complexity is O(log10(n))
 * Space complexity : O(1).
 * @author Kumar
 *
 */

public class ReverseInteger {

	public static void main(String[] args) {
		int input = 1001;
		System.out.println(execute(input));

	}
	
	public static boolean execute(int x){
		 if(x < 0 || (x%10 == 0 &&  x!=0)){
           return false;
        }
        
        int reverseNumber = 0;
        while(x > reverseNumber){
            reverseNumber = reverseNumber * 10 + x%10;
            x = x/10;
        }
        return reverseNumber == x || reverseNumber/10 == x;
	}

}
