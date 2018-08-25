package kumar.coding.exercises.problemSolving.Arrays;
/**
 * Time complexity is O(n*m)
 * @author Kumar
 *
 */
public class IslandCountWithObstacle {

	public static void main(String[] args) {
		int[][]grid = {
				{0,0,0},
				{0,1,0},
				{0,0,0}
		};
		System.out.println(execute(grid));

	}
	
	public static int execute(int[][] grid){
		
        int row = grid.length;
        int col = grid[0].length;
        
        // if the start or end is blocked then there is no unique path
        if(grid[row-1][col-1] == 1 || grid[0][0] == 1){
            return 0;
        }
        
        // marking it as -1 since 1 is considered as block
        grid[row-1][col-1] = -1;
        
        // bottom up approach
        for(int i = row-1 ; i >= 0 ; i--){
            for(int j = col-1; j >= 0; j--){
                
                if(i+1 < row && grid[i+1][j] != 1 && grid[i][j] != 1){
                    grid[i][j] += grid[i+1][j];
                }
                if(j+1 < col && grid[i][j+1] != 1 && grid[i][j] != 1){
                    grid[i][j] += grid[i][j+1];
                } 
                System.out.print(grid[i][j]);
                
            }
            System.out.println("\n");
        }
        
        return -1 * grid[0][0];
	}
}
