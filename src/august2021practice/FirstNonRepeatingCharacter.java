package august2021practice;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	
	static class Solution {
		
		// returns the character or _
		public char firstNonRepeatingCharacter(String input) {
			HashMap<Character, Integer> mapOfChars = new HashMap<Character,Integer>();
			
			for (int i=0; i < input.length(); i++) {
				char c = input.charAt(i);
				if ( mapOfChars.containsKey(c)) {
					mapOfChars.put(c, mapOfChars.get(c) + 1);
				} else {
					mapOfChars.put(c, 1);
				}
			}
			
			for (int i=0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (mapOfChars.get(c) == 1) {
					return c;
				}
			}
			return '_';
		}
		
	}
	
	public static void main (String[]  args) {
		Solution sol = new Solution();
		char c = sol.firstNonRepeatingCharacter("aaabbbcdddcefff");
		System.out.println(c);
	}

}
