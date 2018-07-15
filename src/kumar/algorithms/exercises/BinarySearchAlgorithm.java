package kumar.algorithms.exercises;

import java.util.Scanner;

public class BinarySearchAlgorithm {
	private static int[] sample = {1,3,5,6};
	public static void main (String[]args){
		System.out.println("Please enter an item to be Searched: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output = binarySearch(input, 0, sample.length-1);
		if(output == -1){
			System.out.println("Your element is not found !");
		}else{
			System.out.println("Your element is found at index: "+ output);
		}
		sc.close();
	}
	
	private static int binarySearch(int searchItem, int startIndex, int endIndex){
		try{
			int midIndex =  (startIndex + endIndex)/2;
			System.out.println(midIndex);
			if(searchItem == sample[midIndex]){
				return midIndex;
			}else if(searchItem < sample[midIndex]){
				return binarySearch(searchItem, startIndex, endIndex -1);
			}else if(searchItem > sample[midIndex]){
				return binarySearch(searchItem, startIndex+1, endIndex);
			}
		}catch(Exception e){
			//e.printStackTrace();
		}
		
		return -1;
	}
}
