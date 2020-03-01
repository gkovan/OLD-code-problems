package leetcode.fb.questions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	static class Solution {
	    public int romanToInt(String s) {
	        
	        Map<Character, Integer> mapOfRomans = new HashMap<Character, Integer>(); // Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
	        
	        {
	        	mapOfRomans.put('I', 1);
	        	mapOfRomans.put('V', 5);
	        	mapOfRomans.put('X', 10);
	        	mapOfRomans.put('L', 50);
                mapOfRomans.put('C', 100);
	        	mapOfRomans.put('D', 500);
	        	mapOfRomans.put('M', 1000);	        	
	        }
	        
	        Integer sum = 0;
	        Integer prevValue = 0;
	        
	        for (int i = s.length()-1; i >= 0; i--) {
	            Character c = s.charAt(i);
	            Integer currValue = mapOfRomans.get(c);
	            if (currValue >= prevValue) {
	                sum = sum + currValue;
	            } else {
	                sum = sum - currValue;
	            }
	            prevValue = currValue;
	        }
	        return sum;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "III";
		int ans = sol.romanToInt(s);
		System.out.println(ans);
	}
}
