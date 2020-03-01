package leetcode.fb.questions;

import java.util.HashMap;
import java.util.Map;

public class ValidPalindrome {
	
	static class Solution {
	    public boolean isPalindrome(String s) {
	    	
	    	if (s == null) return false;
	    	
	    	if (s.equals("")) return true;
	    	
	    	int begIndex = 0;
	    	int endIndex = s.length()-1;
	    	
	    	while (begIndex < endIndex) {
	    		Character b = s.charAt(begIndex);
	    		b = Character.toLowerCase(b);
	    		
	    		Character e = s.charAt(endIndex);
	    		e = Character.toLowerCase(e);
	    		
	    		if (Character.isLetterOrDigit(b) == false) {
	    			begIndex++;
	    		} else if (Character.isLetterOrDigit(e) == false) {
	    			endIndex--;
	    		} else if (b.equals(e)) {
	    			begIndex++;
	    			endIndex--;
	    		} else {
	    			return false;
	    		}
	    	}    	
	        return true;
	    }
	}
	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		Map<String, Boolean> tuple = new HashMap<String, Boolean>();
		tuple.put("", true);
		tuple.put(null, false);
		tuple.put("abcba", true);
		tuple.put("abccba", true);
		tuple.put("a,bccba", true);
		tuple.put("  a  , b * c %%%%  ### c  b  a", true);
		tuple.put("A man, a plan, a canal: Panama", true);
		
		for (String key : tuple.keySet()) {
		    Boolean expectedResult = tuple.get(key);
		    boolean result = sol.isPalindrome(key);
		    if (result == expectedResult) {
		    	System.out.println("Correct: " + key + " : " + result);
		    } else {
		    	System.out.println("Wrong: " + key + " : " + result);
		    }
		    
		}	
	}

}
