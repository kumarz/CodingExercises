package kumar.coding.exercises.dataStructures.Arrays;

public class LoneyCharacter {

	public static void main(String[] args) {
		System.out.println(findLonelyPixel());

	}
	
	public static int findLonelyPixel() {
		 char[][] picture = {
				 {'B','B','W','B','W','B','B','B','B','W'},
				 {'W','W','W','W','W','W','W','W','W','B'},
				 {'W','B','B','B','W','W','B','W','W','W'},
				 {'W','W','W','W','W','W','W','B','W','W'},
				 {'W','B','B','W','W','W','B','B','W','W'},
				 {'B','B','B','B','W','B','W','B','W','W'},
				 {'W','W','B','B','B','W','B','W','W','W'},
				 {'B','W','W','B','B','W','W','W','W','W'},
				 {'B','W','B','W','W','B','W','B','B','W'},
				 {'B','B','B','B','W','W','W','B','B','W'}
				};
	        if(picture == null ||  picture.length == 0) return -1;
	        int row = picture.length;
	        int col = picture[0].length;
	        int [] m = new int[row];
	        int [] n = new int[col];
	        int count = 0;  
	        for(int i = 0; i < row; i++){
	            for(int j = 0; j < col; j++){
	                if(picture[i][j] == 'B'){
	                    if(m[i] == 0 && n[j] == 0){
	                        m[i] = 1;
	                        n[j] = 1;
	                        count++;   
	                    }else if(m[i] == 1){
	                        m[i] = -1;
	                        count--;
	                    }else if(n[j] == 1){
	                        n[j] = -1;
	                        count--;    
	                    }
	                }
	            }
	        }
	        return count< 0 ? 0 : count;   
	    }

}
