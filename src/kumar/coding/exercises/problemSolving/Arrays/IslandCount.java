package kumar.coding.exercises.problemSolving.Arrays;

/**
 * This is an island problem solving to figure out the number of islands available in a 2D matrix
 * 1's are considered as land and 0's are considered as water.
 * 
 * @author Kumar
 *
 */
public class IslandCount {

	public static void main(String[] args) {
		int[][] island = new int [][]{
									{1,1,0,1,1,1,1},
									{0,0,1,1,0,0,0},
									{1,0,1,0,1,1,1},
									{0,0,1,1,0,0,0},
									{0,0,1,1,0,1,1},
									{1,1,0,0,0,1,1},
									{0,0,1,1,0,1,1},
									{0,0,1,1,0,1,1},
								};
		int count =  iterativeApproach1(island);
		count =  iterativeApproach2(island);
		
		System.out.println("Total number of islands found " + count);
	}

	/**
	 * This is an iterative approach which is of O(m*n)
	 * @param island
	 * @param count
	 * @return
	 */
	private static int iterativeApproach1(int[][] island) {
		Long start = System.currentTimeMillis();
		int count = 0;
		for(int row = 0 ; row < island.length; row++){
			for(int col = 0 ; col < island[0].length; col++){
				if(island[row][col] == 1){
					if((row == 0 || island[row-1][col] == 0) && (col == 0 || island[row][col-1] == 0)){
						count++;
					}
				}
			}
		}
		Long end = System.currentTimeMillis();
		System.out.println("Time taken in approach 1 is " + (end - start) + " and the count is " + count);
		return count;
	}
	
	/**
	 * This is an iterative approach which is of O(m*nlog(k))
	 * @param island
	 * @param count
	 * @return
	 */
	private static int iterativeApproach2(int[][] island) {
		Long start = System.currentTimeMillis();
		int count = 0;
		boolean [][] visited = new boolean[island.length][island[0].length];
		for(int row = 0 ; row < island.length; row++){
			for(int col = 0 ; col < island[0].length && !visited[row][col]; col++){
				visited[row][col] = true;
				if(island[row][col] == 1 ){
					if((row == 0 || island[row-1][col] == 0) && (col == 0 || island[row][col-1] == 0)){
						count++;
					}
				}
			}
		}
		Long end = System.currentTimeMillis();
		System.out.println("Time taken in approach 2 is " + (end - start) + " and the count is " + count);
		return count;
	}

}
