package kumar.coding.exercises.problemSolving;

/**
 * Reversing an integer
 * Caution check for  bit overflows
 * Time complexity : O(log10(n). We divided the input by 10 for every iteration, so the time complexity is O(log10(n))
 * Space complexity : O(1).
 * @author Kumar
 *
 */
public class ReverseAnInteger {

	public static void main(String[] args) {
		System.out.println(execute(1534236469));
		System.out.println(execute(-121));
		System.out.println(execute(161));
	}

	private static int execute(int x) {
        int output = 0 ;
        try{
           while(x != 0){
	    	   int pop = x%10;
	    	   if (output > Integer.MAX_VALUE/10 || (output == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	           if (output < Integer.MIN_VALUE/10 || (output == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	           output = output*10 + pop;
	           x = x/10;
           }
        } catch(Exception e){
            return output;
        }
	    return output;
	}

}
