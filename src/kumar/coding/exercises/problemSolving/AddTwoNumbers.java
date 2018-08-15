package kumar.coding.exercises.problemSolving;

/**
 * Add two numbers without using '+' or '-'
 * @author Kumar
 *
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		int a = 53, b = -94;
		System.out.println(execute(a,b));
	}

	private static int execute(int a, int b) {
		if(b == 0) return a;
		int sum = 0;
		int carry = 0;
		
		sum = a^b;
		carry = (a&b)<< 1;
		return execute(sum, carry);
	}

}
