package kumar.coding.exercises.problemSolving;

import java.util.LinkedList;

import java.util.Queue;
/**
 * Time complexity is  O(rows * cols)
 * Space complexity is O(rows * cols)
 * @author Kumar
 */
public class WallsAndGates {
	
	public static void main(String[] args) {
		int[][] rooms = new int [][]{
			{Integer.MAX_VALUE,1,0,Integer.MAX_VALUE},
			{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
			{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
			{0,Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE}
			};
			print(rooms);
			System.out.println("math starts from here...");
		  if (rooms.length == 0 || rooms[0].length == 0) return;
	        Queue<int[]> queue = new LinkedList<>();
	        for (int i = 0; i < rooms.length; i++) {
	            for (int j = 0; j < rooms[0].length; j++) {
	                if (rooms[i][j] == 0) queue.add(new int[]{i, j});
	            }
	        }
	        while (!queue.isEmpty()) {
	            int[] top = queue.remove();
	            int row = top[0], col = top[1];
	            if (row > 0 && rooms[row - 1][col] == Integer.MAX_VALUE) {
	                rooms[row - 1][col] = rooms[row][col] + 1;
	                print(rooms);
	                queue.add(new int[]{row - 1, col});
	            }
	            if (row < rooms.length - 1 && rooms[row + 1][col] == Integer.MAX_VALUE) {
	                rooms[row + 1][col] = rooms[row][col] + 1;
	                print(rooms);
	                queue.add(new int[]{row + 1, col});
	            }
	            if (col > 0 && rooms[row][col - 1] == Integer.MAX_VALUE) {
	                rooms[row][col - 1] = rooms[row][col] + 1;
	                print(rooms);
	                queue.add(new int[]{row, col - 1});
	            }
	            if (col < rooms[0].length - 1 && rooms[row][col + 1] == Integer.MAX_VALUE) {
	                rooms[row][col + 1] = rooms[row][col] + 1;
	                print(rooms);
	                queue.add(new int[]{row, col + 1});
	            }
	        }
	        print(rooms);

	}
	
	public static void print(int[][]rooms){
		System.out.println("--------------------------------------");
		for(int i = 0; i < rooms.length; i++){
			for(int j = 0;  j < rooms[0].length; j++){
				System.out.print(rooms[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}
