package kumar.coding.exercises.problemSolving;

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
									{0,0,0,0,0,0,0},
									{1,0,0,0,1,1,1},
									{0,0,1,1,0,0,0},
									{0,0,1,1,0,1,1},
									{1,1,0,0,0,1,1},
									{0,0,1,1,0,1,1},
									{0,0,1,1,0,1,1},
								};
		int count =  recursiveApproach(island);
		System.out.println("Total number of islands found " + count);
		count =  iterativeApproach(island);
		System.out.println("Total number of islands found " + count);
	}

	/**
	 * checking for horizontal and vertical columns for water.
	 * Time complexity is O(m*log n)
	 * @param grid
	 * @return
	 */
	private static int recursiveApproach(int[][] grid){
		 if(grid == null || grid.length == 0){
	            return 0;
	        }
	        int m = grid.length;
	        int n = grid[0].length;
	        int total = 0;
	        boolean [][] visited = new boolean[m][n];
	        for(int i = 0 ; i < grid.length; i++){
	            for(int j = 0; j < grid[0].length; j++){
	                if(grid[i][j] == 1 && !visited[i][j]){
	                    total += DFS(grid, i, j, visited);
	                }
	            }
	        }
	        return total;
	}

	private static int DFS(int[][] grid, int i, int j, boolean[][] visited) {
		 if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]){
	            return 0;
	        }
	        visited[i][j] = true;
	        DFS(grid, i+1 , j, visited);
	        DFS(grid, i-1 , j, visited);
	        DFS(grid, i , j+1, visited);
	        DFS(grid, i , j-1, visited);
	        return 1;
		
	}

	/**
	 * This is an iterative approach which is of O(m*nlog(k))
	 * @param island
	 * @param count
	 * @return
	 */
	private static int iterativeApproach(int[][] island) {
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
