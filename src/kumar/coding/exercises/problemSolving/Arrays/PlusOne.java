package kumar.coding.exercises.problemSolving.Arrays;

/**
 * This one adds one to the last digit of the array
 * Time complexity is O(n)
 * @author Kumar
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		int[] output = execute();
		for(int item: output){
			System.out.println(item);	
		}
		
	}

	/**
	 * calculated using carry.
	 * @return
	 */
	private static int[] execute() {
		int[] digits = {1,2,3};
		 int carry = 1;
	        
	        for(int i = digits.length -1; i >=0; i--){
	            int number = digits[i] + carry;
	            digits[i] = number % 10;
	            carry = number / 10;
	            if(carry == 0){
	            	return digits;
	            }
	        }
	        
	        int[] result = new int[digits.length+1];
	        result[0] = 1;
	        for(int i = 1; i < digits.length; i++){
	            result[i] = digits[i-1];
	        }
	        
	        return result;
	}

}
