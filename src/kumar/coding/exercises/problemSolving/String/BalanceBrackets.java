package kumar.coding.exercises.problemSolving.String;

/**
 * 
 * @author Kumar
 * Balance the brackets in such a way that there should be equal number of open brackets should be followed by equal number of closed brackets.
 *
 * {{{}{{}  => {{}}
 * Follow up: make it better by remove any characters other than brackets, if given.
 * 
 */

public class BalanceBrackets {
	static char OPEN_BRACKET_STR = '{';
	static char CLOSE_BRACKET_STR = '}';
	static int OPEN_BRACKETS_COUNT = 0;
	static int CLOSE_BRACKETS_COUNT = 0;
	static int TOTAL_OPEN_BRACKETS_COUNT = 0;
	static int TOTAL_CLOSE_BRACKETS_COUNT = 0;
	

	public static void main(String[] args) {
		String input = "{{{}{{}";
		StringBuffer output = new StringBuffer();
		
		// to count the brackers
		for(char item: input.toCharArray()){
			if(item == OPEN_BRACKET_STR){
				TOTAL_OPEN_BRACKETS_COUNT++;
			}else if(item == CLOSE_BRACKET_STR){
				TOTAL_CLOSE_BRACKETS_COUNT++;
			}
		}
		
		for(int count = 0; count < input.length(); count++){
			char current = input.charAt(count);
			if(current == OPEN_BRACKET_STR){
				OPEN_BRACKETS_COUNT++;
			}
			if(current == CLOSE_BRACKET_STR){
				CLOSE_BRACKETS_COUNT++;
			}
			if(current == OPEN_BRACKET_STR && OPEN_BRACKETS_COUNT <= TOTAL_CLOSE_BRACKETS_COUNT){
				output.append(current);
			}
			if(current == CLOSE_BRACKET_STR && OPEN_BRACKETS_COUNT <= TOTAL_OPEN_BRACKETS_COUNT){
				output.append(current);
			}
		}
		System.out.println(output.toString());
	}

}
