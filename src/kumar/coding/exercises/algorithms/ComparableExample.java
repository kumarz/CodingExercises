package kumar.coding.exercises.algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 
 * @author Kumar
 * This is just an implementation of Comparable interface that overrides CompateTo method
 * for sorting objects based on our criteria.
 *
 */
public class ComparableExample implements Comparable<ComparableExample>{
	int age;
	String name;
	

	public static void main(String[] args) {
		
		ArrayList<ComparableExample> list = new ArrayList<ComparableExample>();
		ComparableExample obj = new ComparableExample();
		obj.age = 30;
		obj.name = "Kumar";
		
		ComparableExample obj1 = new ComparableExample();
		obj1.age = 10;
		obj1.name = "Sathish";
		
		ComparableExample obj2 = new ComparableExample();
		obj2.age = 5;
		obj2.name = "Brad";
		
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		
		System.out.println("Before sorting");
		
		for(ComparableExample aObj : list){
			System.out.println(aObj.age);
			System.out.println(aObj.name);
		}
		
		System.out.println("after sorting");
		Collections.sort(list);
		
		for(ComparableExample aObj : list){
			System.out.println(aObj.age);
			System.out.println(aObj.name);
		}
		
		
	}

	@Override
	public int compareTo(ComparableExample o) {
		if(age==o.age)  
			return 0;  
		else if(age>o.age)  
			return 1;  
		else  
			return -1;  
	}

}
