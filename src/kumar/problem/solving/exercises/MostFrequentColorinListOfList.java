package kumar.problem.solving.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * This program is to find the most common color found in the list of list that has colors as String objects.
 * Bonus points, if you can solve this in less than 15 minutes.
 * 
 * @author kumas12
 *
 */
public class MostFrequentColorinListOfList {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		List<String> c = new ArrayList<String>();
		List<List<String>> d = new ArrayList<List<String>>();
		Map<String, Integer> count = new HashMap<String, Integer>();
		PriorityQueue<Integer> total = new PriorityQueue<Integer>(Collections.reverseOrder());
		List<String> output = new ArrayList<String>();
		
		a.add("RED");
		a.add("RED");
		a.add("BLACK");
		b.add("RED");
		b.add("BLACK");
		b.add("BLACK");
		c.add("PINK");
		c.add("YELLOW");
		c.add("BLUE");
		
		d.add(a);
		d.add(b);
		d.add(c);
		
		for(int out = 0; out < d.size(); out++){
			List<String> inner = d.get(out);
			for(int in = 0; in < inner.size(); in++){
				count.put(inner.get(in), count.get(inner.get(in)) != null ? count.get(inner.get(in))+1 : 0);
				total.offer(count.get(inner.get(in)));
			}
			
		}
		
		for (Map.Entry<String,Integer> entry : count.entrySet()) {
			if(entry.getValue() == total.peek()){
				output.add(entry.getKey());
			}
		}
		
		System.out.println(output);
	}

}
