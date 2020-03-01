package stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class WellFormed {
	
	Map<Character, Character> charMap = new HashMap<Character, Character>();
	{
		charMap.put(')', '(');
		charMap.put('}', '{');
		charMap.put(']', '[');
	}
	
	Deque<Character> charStack = new ArrayDeque<Character>();
	
	public boolean wellFormed(String input) {
		
		for (int i=0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(' || c == '{'  || c == '[')  {
				charStack.push(c);
			} else {
				 Character x = charStack.pop();
				 if (!x.equals(charMap.get(c))) {
					 return false;
				 }
			}
		}
		
		if (charStack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		WellFormed wf = new WellFormed();
		//String input = "()";
		String input = "([{(){}[]}])";
		boolean isWellFormed = wf.wellFormed(input);
		System.out.println(isWellFormed);
	}
}
