package kumar.coding.exercises.problemSolving;
/**
 * We need to reverse the digits that are binary and find its compliment.
 * Time complexity is O(row*col)
 * @author Kumar
 *
 */
public class ReverseDigitsCompliment {

	public static void main(String[] args) {
		int[][]A = {
				{1,0,0}
		};
		
		int C = A[0].length;
        for (int[] row: A){
            for (int i = 0; i < (C + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
                
            }
        }
        for(int i = 0; i < A.length; i++){
        	for(int j = 0; j < A[i].length; j++){
        		System.out.println(A[i][j]);
        	}
        }

	}

}
