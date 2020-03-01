package leetcode.topquestions.easycollection.arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	private Map<String, Integer> subValues = new HashMap<String, Integer>();

	public RomanToInteger() {
		subValues.put("IV", 4);
		subValues.put("IX", 9);
		subValues.put("XL", 40);
		subValues.put("XC", 90);
		subValues.put("CD", 400);
		subValues.put("CM", 900);
	}
	
	public int convert(String romNum) {
		
		int total = 0;
		
		for (int i = 0; i < romNum.length(); i++) {
			int endIndex = (i == romNum.length() - 1) ? i+1 : i+2;
			String str = romNum.substring(i, endIndex);

			Integer subVal = subValues.get(str);
			
			if (subVal != null) {
				System.out.println(str);
				total = total + subVal;
				i++;
			} else {
				// process single char

				char c = romNum.charAt(i);
				System.out.println(c);
				if (c == 'L') {
					total = total + 50;
				} else if (c == 'X') {
					total = total + 10;
				} else if (c == 'I') {
					total = total + 1;
				}
			}
			
		}
		
		return total;
	}
	
}
