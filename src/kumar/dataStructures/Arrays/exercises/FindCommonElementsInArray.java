package kumar.dataStructures.Arrays.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * @author Kumar
 * This exercise is to find the common and non-common elements in Arrays.
 *
 */

public class FindCommonElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the First array");
		int array1Size = sc.nextInt();
		Integer[] array1 = new Integer[array1Size];
		
		for(int counter = 0; counter < array1Size; counter++){
			array1[counter] = sc.nextInt();
		}
		System.out.println("Enter the size of the Second array");
		int array2Size = sc.nextInt();
		Integer[] array2 = new Integer[array2Size];
		for(int counter = 0; counter < array2Size; counter++){
			array2[counter] = sc.nextInt();
		}

		HashSet<Integer> s1 = new HashSet<Integer>(Arrays.asList(array1));
		HashSet<Integer> s2 = new HashSet<Integer>(Arrays.asList(array2));
		s1.retainAll(s2);
		s2.removeAll(s1);
		
		System.out.println("Common elements are");
		s1.forEach(item ->{
			System.out.println(item);
		});
		
		System.out.println("Non-Common elements are");
		s2.forEach(item ->{
			System.out.println(item);
		});
		sc.close();
	}

}
