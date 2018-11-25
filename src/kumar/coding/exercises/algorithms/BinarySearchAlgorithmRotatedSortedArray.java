package kumar.coding.exercises.algorithms;

import java.util.Scanner;

/**
 * 
 * @author Kumar
 * This is an implementation of a Binay Search Algorithm for a roated sorting algorithm.
 * This has an time complexity of O(logn)
 *
 */

public class BinarySearchAlgorithmRotatedSortedArray {
	private static int[] sample = {5,6,1,2,3,4};
	public static void main (String[]args){
		System.out.println("Please enter an item to be Searched: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output = binarySearchIterative(sample,input);
		if(output == -1){
			System.out.println("Your element is not found !");
		}else{
			System.out.println("Your element is found at index: "+ output);
		}
		sc.close();
	}
	
	private static int binarySearch(int searchItem){

        int start = 0;
        int end = sample.length - 1;
        
        while(start <= end){
            int mid = start+(end-start)/2;
            if(searchItem == sample[mid]){
                return mid;
            }
            if(searchItem < sample[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
            
        return -1;
	}
	
	public static int binarySearchIterative(int[] nums, int target) {
	    int left = 0;
	    int right= nums.length-1;
	 
	    while(left<=right){
	        int mid = left + (right-left)/2;
	        if(target==nums[mid])
	            return mid;
	 
	        if(nums[left]<=nums[mid]){
	            if(nums[left]<=target&& target<nums[mid]){
	                right=mid-1;
	            }else{
	                left=mid+1;
	            }
	        }else{
	            if(nums[mid]<target&& target<=nums[right]){
	                left=mid+1;
	            }else{
	                right=mid-1;
	            }
	        }    
	    }
	 
	    return -1;
	}
}
