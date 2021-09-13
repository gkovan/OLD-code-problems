package august2021practice;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class CollectionsPractice {
	
	static class Practice {
		
		
		public void practice() {
			System.out.println("###########  LISTS #############");
			List<Integer> myList = new ArrayList<Integer>();
			myList.add(1);
			myList.add(2);
			myList.add(3);
			myList.add(4);
			myList.add(-1);
			myList.add(-2);
			myList.add(-3);
			myList.add(-4);
			
			assert myList.size() == 8;
			
			// loop through list
			System.out.println("LOOP THROUGH LIST COLLECTION");
			myList.forEach(x -> System.out.println("forEach-Loop " + x));
			
			myList.forEach(x -> { 
				System.out.print(x + ",");
			});
			System.out.println("");
			
			for (Integer element: myList) {
				System.out.println("for-Loop " + element);
			}
			
			// Collection streams
			System.out.println("COLLECTION STREAMS");
			
			myList.stream().forEach(x -> System.out.println(x));
			
			System.out.println("Filter all numbers > 0 in list.");
			myList.stream().filter(x -> x > 0).forEach(x -> System.out.println(x));
			
			System.out.println("Reduce by summing all numbers in list.");
			Integer sum = myList.stream().reduce(0, (subtotal, element) -> subtotal + element);
			System.out.println("Sum: " + sum);
			
			System.out.println("Filter all numbers > 0 and reduce by summing.");
			Integer sumFilter = myList.stream().filter(x -> x > 0).reduce(0, (subtotal, element) -> subtotal + element);
			System.out.println("Sum filter: " + sumFilter);
			
			
			System.out.println("###########  HashMap #############");
			
			Map<String, Integer> myMap = new HashMap<String,Integer>();
			String myString = "Hello hello HeLlo My MY NAME name Is IS iS Gerry GERRY GeRrY";
			
			StringTokenizer st = new StringTokenizer(myString);
			while (st.hasMoreElements()) {
				String token = st.nextToken().toLowerCase();
				if (myMap.containsKey(token)) {
					myMap.put(token,  myMap.get(token) + 1);
				} else {
					myMap.put(token, 1);
				}
			}
			
			System.out.println("### iterate through the elements in the hashmap ###");
			myMap.forEach((key, val) -> System.out.println("KEY::: " + key + " VALUE::: " + val));
			
			System.out.println("### iterate through keys in HashMap ###");
			for (String key: myMap.keySet()) {
				System.out.println(key);
			}
			
			System.out.println("### iterate through values in HashMap ###");
			for (Integer value: myMap.values()) {
				System.out.println(value);
			}	
			
			System.out.println("### FIFO QUeue ###");
			Deque<Integer> myQue = new ArrayDeque<Integer>();
			myQue.add(1);
			myQue.add(2);
			myQue.add(3);
			Integer topOfQue = myQue.remove();
			assert topOfQue == 1;
			assert myQue.size() == 2;
			System.out.println("Top of que is: " + topOfQue);
			for (Integer queElement: myQue) {
				System.out.println("Que element: " + queElement);
			}
			
			System.out.println("### LIFO Stack ###");
			Deque<Integer> myStack = new ArrayDeque<Integer>();
			myStack.push(1);
			myStack.push(2);
			myStack.push(3);
			Integer topOfStack = myStack.pop();
			assert topOfStack == 3;
			assert myStack.size() == 2;
			
			for (Integer stackElement : myStack) {
				System.out.println("Stack element: " + stackElement);
			}
			
			System.out.println("### array practice ######");
			int myIntArray[] = new int[10];
			assert myIntArray.length == 10;
			for (int i=0; i < myIntArray.length; i++) {
				System.out.print(myIntArray[i]);
			}
			System.out.println("");
			
			Arrays.fill(myIntArray, 9);
			for (int i=0; i < myIntArray.length; i++) {
				System.out.print(myIntArray[i]);
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
		

		
		Practice practice = new Practice();
		practice.practice();
	}
	


}
