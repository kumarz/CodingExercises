package kumar.coding.exercises.dataStructures.Arrays;

/**
 * This is a 2D matrix problem solving to find the number of unique paths from top leftmost corner to bottom right corner.
 * We should start analyzing this to find a formula before start writing code.
 * @author Kumar
 *
 */
public class UniquePathsIn2DMatrix {
		public static void main(String[] args) {
			int[][] island = new int [][]{
										{1,1,0,1,1,1,1,0,1,1,1,1,0,1,1},
										{0,0,1,1,0,1,1,0,1,1,1,1,0,1,1},
										{1,0,1,0,1,1,1,0,0,0,0,0,0,1,1},
										{0,0,1,1,0,1,1,0,1,1,1,1,0,1,1},
										{0,0,1,1,0,1,1,0,0,0,0,0,0,1,1},
										{1,1,0,0,0,1,1,0,1,1,1,1,0,1,1},
										{0,0,1,1,0,1,1,0,1,1,1,1,0,1,1},
										{0,0,1,1,0,1,1,0,1,1,1,1,0,1,1},
									};
			// int count =  numberOfPaths(island.length, island[0].length);
			
			int count =  uniquePaths(island.length, island[0].length);
			
			System.out.println("Total unique paths found " + count);
		}

		/**
		 * Recursive solution to find the unique path in a 2D matrix.
		 * @param row
		 * @param col
		 * @return unique paths
		 */
		private static int numberOfPaths(int row, int col){
			
			// if either given row number is first or column number is 1
			if(row == 1 || col == 1){
				return 1;
			}
			
			// if diagonal move is allowed, then uncomment the code below,
			return numberOfPaths(row-1, col) + numberOfPaths(row, col-1);
								// + numberOfPaths(row-1, col-1); 
			
		}
		
		
		/**
		 * iterative approach to find the unique path
		 * @param m
		 * @param n
		 * @return
		 */
	    public static int uniquePaths(int m, int n) {
	        int[][] matrix = new int[m][n];
	        
	        for(int i = 0; i < m ; i++){
	            
	            for(int j = 0; j < n; j++){
	                
	                if(i == 0 || j == 0){
	                    matrix[i][j] = 1;
	                }else{
	                   matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
	                }
	            }
	        }
	    
	        return matrix[m-1][n-1];
	    }

}
