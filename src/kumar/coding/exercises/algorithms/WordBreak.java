package kumar.coding.exercises.algorithms;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		String s = "aaa";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("aaa");
		wordDict.add("aaaa");
        System.out.println(DFS(s, wordDict));
	}

	/**
	 * @param s
	 * @param wordDict
	 */
	private static boolean DFS(String s, List<String> wordDict) {
		if(s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0){
            return false;
        }
        
        boolean[] f = new boolean[s.length() + 1];
        
        f[0] = true;
        
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && wordDict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        
        return f[s.length()];
	}

}
