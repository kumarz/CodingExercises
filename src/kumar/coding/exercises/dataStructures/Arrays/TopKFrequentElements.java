package kumar.coding.exercises.dataStructures.Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import kumar.codeing.exercise.model.Pair;

/**
 * This is problem solving to find the top K frequent elements in an array.
 * We are going to see two approaches hashing & bucket.
 * @author Kumar
 *
 */
public class TopKFrequentElements {

	public static void main(String[] args) {

        int[] nums = {5,3,1,1,1,3,73,1};
        int k = 2;
        
        // This is hashing algorithm which has the time complexity of O(n log K)
        
        Map<Integer, Integer> lookup = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        PriorityQueue<Pair> sorted = new PriorityQueue<Pair>(new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return b.count - a.count;
            }
        });
        
        for(int i = 0; i < nums.length; i++){
            lookup.put(nums[i], lookup.getOrDefault(nums[i], 0)+1);
            sorted.offer(new Pair(nums[i], lookup.get(nums[i])));
        }
        
        while(k > 0){
            Pair item = sorted.poll();
            if(item != null && !result.contains(item.value)) {
            	result.add(item.value);
                k--;
            }
        }
                 
         
        System.out.println(result);

	}
	
	/**
	 * This bucket approach where the time complexity is O(n)
	 * @param nums
	 * @param k
	 * @return
	 */
	public static List<Integer> bucketApproach(int[] nums, int k){
	     // corner case: if there is only one number in nums, we need the bucket has index 1.
 		List<Integer>[] bucket = new List[nums.length + 1];
 		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

 		for (int n : nums) {
 			frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
 		}

 		for (Map.Entry<Integer, Integer> set : frequencyMap.entrySet()) {
 			int frequency = set.getValue();
 			if (bucket[frequency] == null) {
 				bucket[frequency] = new ArrayList<>();
 			}
 			bucket[frequency].add(set.getKey());
 		}

 		List<Integer> rst = new ArrayList<>();
 		for (int pos = bucket.length - 1; pos >= 0 && rst.size() < k; pos--) {
 			if (bucket[pos] != null) {
                 rst.addAll(bucket[pos]);
 			}
 		}
 		
 		 System.out.println(rst);
 		 return rst;
	}
}
