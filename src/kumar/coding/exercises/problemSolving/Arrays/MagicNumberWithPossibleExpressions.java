package kumar.coding.exercises.problemSolving.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Kumar
 * Write a function that takes a magic number and a list of numbers. 
 *	It returns true if it can insert add or subtract operations in the list of numbers to get the magic number. 
 * Otherwise, it returns false.
 *	
 *	For example:
	
	f(10, [1,2]) = false. There's no way to add or subtract 1 and 2 to get 10.
	f(2, [1,2,3,4]) = true. 1 + 2 + 3 - 4 = 2.
	f(-42, [13,57,17,19,35]) = true. 13 - 57 + 17 + 19 - 35 = -42.
	f(0, []) = true
	f(1, []) = false
	f(1, [1]) = true
	f(0, [1]) = false
 */

public class MagicNumberWithPossibleExpressions {

	static int magicNumber = 2;
	static List<Integer> arr = new ArrayList<Integer>();
	
 	public static void main(String[] args) {
 		/*arr.add(1);
 		arr.add(13);
 		arr.add(57);
 		arr.add(17);
 		arr.add(19);
 		arr.add(35);*/
 		arr.add(1);
 		arr.add(2);
 		arr.add(3);
 		arr.add(4);
 		
 		
		Boolean response = possibleExpression(magicNumber, arr);
		System.out.println(response);
	}
 	
 	public static Boolean possibleExpression(int magicNumber, List<Integer> numbers){
 		if(numbers.isEmpty() && magicNumber > 0){
 			return false;
 		}
 		int sum = 0;
 		int output = 0;
 		
 		if(magicNumber > 0){ // checking for +ve numbers
 			for(int count = 0 ; count < numbers.size(); count++){
 				if(numbers.get(count) >= magicNumber * 2){
 					sum -= numbers.get(count);
 				}else{
 					sum += numbers.get(count);
 				}
 				
 	 		}
 	 		
 		}else if(magicNumber < 0){ // checking for -ve numbers
 			for(int count = 0 ; count < numbers.size(); count++){
 				if(numbers.get(count) > Math.abs(magicNumber/2)){
 					sum -= numbers.get(count);
 				}else{
 					sum += numbers.get(count);
 					
 				}
 	 		}
 		}
 		if(sum == magicNumber){
				return true;
		}
	 	return false;
 	}
 	
}
