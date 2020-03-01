package stacksandqueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class ReversePolishNotationStack {
	
	@FunctionalInterface
	interface MathOperations {
		int calculate(int x, int y);  
	}
	
	Map<String, MathOperations> mathOperationsMap = new HashMap<String, MathOperations>();	
	{
		mathOperationsMap.put("+", (x,y) -> (x + y));
		mathOperationsMap.put("-", (x,y) -> (x - y));
		mathOperationsMap.put("*", (x,y) -> (x * y));
		mathOperationsMap.put("/", (x,y) -> (x / y));
	}

	
	Deque<Integer> myStack = new ArrayDeque<Integer>();

	
	public Integer calculateUsingFunctionalInterface (String input) {
		String[] tokens = input.split(",");
		
		for (int i = 0; i < tokens.length; i ++ ) {
			if (mathOperationsMap.get(tokens[i]) != null) {
				MathOperations mathOp = mathOperationsMap.get(tokens[i]);
				int result = mathOp.calculate(myStack.pop(), myStack.pop());
				myStack.push(result);
			} else {
				myStack.push(Integer.parseInt(tokens[i]));
			}
			
		}
			
		return myStack.pop();
	}
	
	public Integer calculateBruteForce(String input) {
	   String[] tokens = input.split(",");
	   
	   for (int i = 0; i < tokens.length; i ++) {
		  if (tokens[i].equals("+")) {
			  Integer val1 = myStack.pop();
			  Integer val2 = myStack.pop();
			  Integer result = val1 + val2;
			  myStack.push(result);
		  } else if (tokens[i].equals("-")) {
			  Integer val1 = myStack.pop();
			  Integer val2 = myStack.pop();
			  Integer result = val1 - val2;
			  myStack.push(result);	  
		  } else if (tokens[i].equals("*")) {
			  Integer val1 = myStack.pop();
			  Integer val2 = myStack.pop();
			  Integer result = val1 * val2;
			  myStack.push(result);	
		  } else if (tokens[i].equals("/")) {
			  Integer val1 = myStack.pop();
			  Integer val2 = myStack.pop();
			  Integer result = val1 / val2;
			  myStack.push(result);	
		  } else {
			  // Integer value to be pushed onto the stack
			  myStack.push(Integer.parseInt(tokens[i]));
		  }
	   }	   
	   return myStack.pop();
	}
	
	public static void main(String[] args) {
		String rpnExp1 = "3,4,+,2,*,1,+";		
		ReversePolishNotationStack rpns1 = new ReversePolishNotationStack();
		System.out.println(rpns1.calculateBruteForce(rpnExp1));		
		
		String rpnExp2 = "3,4,+,2,*,1,+";		
		ReversePolishNotationStack rpns2 = new ReversePolishNotationStack();
		System.out.println(rpns2.calculateUsingFunctionalInterface(rpnExp2));
	}

}
