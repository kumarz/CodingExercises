package kumar.coding.exercises.dataStructures.Arrays;

/**
 * Merging two sorted array
 * NOTE: not creating an extra space to achieve this.
 * Assumptions nums1 array has enough space to store the merge
 * @author Kumar
 *
 */
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		
		int n = nums2.length ;
		int m = nums1.length - n;
		int k = m + n -1;
		
		// to load the largest values in nums1 array by comaparing it with nums2
		while(m > 0 && n > 0){
			if(nums1[m-1] > nums2[n-1]){
				nums1[k] = nums1[m-1];
				m--;
			}else{
				nums1[k] = nums2[n-1];
				n--;
				
			}
			k--;
		}
		
		// to load nums1 smallest elements while comparing with nums2
		while(n > 0){
			nums1[k--] = nums2[n-1];
			n--;
		}
		
		for(int item: nums1){
			System.out.println(item);
		}
		
	}

}
