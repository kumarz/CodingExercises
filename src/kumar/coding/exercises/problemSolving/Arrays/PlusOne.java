package kumar.coding.exercises.problemSolving.Arrays;

/**
 * This one adds one to the last digit of the array
 * Time complexity is O(n)
 * @author Kumar
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		// int[] output = execute();
		int[] output = execute2();
		for(int item: output){
			System.out.println(item);	
		}
		
	}

	/**
	 * calculated using carry.
	 * Time complexity is O(n)
	 * Space complexity is O(1)
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
	

	/**
	 * calculated using just array.
	 * @return
	 */
	private static int[] execute2() {
		int[] digits = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
	        
	        for(int i = digits.length -1; i >=0; i--){
	            if(digits[i] < 9){
	            	digits[i]++;
	            	return digits;
	            }
	            digits[i] = 0;
	        }
	        
	        int[] result = new int[digits.length+1];
	        result[0] = 1;
	        
	        return result;
	}

}
