import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

public class MyCheatSheet {
	
	public static class CheatSheet {		
		public void cheatSheet() {
			
			/**************** Map *******************************/
			Map<Character, Integer> mapOfRomans = new HashMap<Character, Integer>();
        	mapOfRomans.put('I', 1);
        	mapOfRomans.put('V', 5);
        	mapOfRomans.put('X', 10);
        	mapOfRomans.put('L', 50);
            mapOfRomans.put('C', 100);
        	mapOfRomans.put('D', 500);
        	mapOfRomans.put('M', 1000);
        	Integer sumOfRomans = mapOfRomans.get('X') + mapOfRomans.get('V');
        	assert sumOfRomans == 15;
        	
        	// iterate through a map of keys
        	for (Character key : mapOfRomans.keySet()) {
        		Integer value = mapOfRomans.get(key);
        		assert value >= 1 && value <= 1000;
        	}
        	
        	// if you only want care about the values
        	for (Integer value : mapOfRomans.values()) {
        		assert value >= 1 && value <= 1000;
        	}
        	
        	Iterator<Entry<Character, Integer>> iter = mapOfRomans.entrySet().iterator();
        	while (iter.hasNext()) {
        		Entry entry = iter.next();
        		Character key = (Character) entry.getKey();
        		Integer value = (Integer) entry.getValue();
        	}
			
			/**************** Set *******************************/
			Set<Integer> mySet = new HashSet<Integer>();
			boolean mySetAddResult = mySet.add(1);
			assert mySetAddResult == true;
			boolean mySetContainsResult = mySet.contains(1);
			assert mySetContainsResult == true;
			
			/**************** Stack (LIFO): *********************/
			
			Deque<Integer> myStack = new ArrayDeque<Integer>();
			myStack.push(5);
			assert myStack.size() == 1;
			
			Integer topOfStackElement = myStack.peek(); // peek at the top element but do not remove it
			assert topOfStackElement == 5 && myStack.size() == 1;
			
			Integer x = myStack.pop();
			assert x == 5 && myStack.size() == 0;
			
			/****************** Queue (FIFO): *********************/
			Deque<Integer> myQueue = new ArrayDeque<Integer>();
			myQueue.add(1);
			myQueue.add(2);
			myQueue.remove();
			
			/******************* Arrays class **********************/
			Integer[] myArray = {1,2,3,50,8,15,6};
			Arrays.sort(myArray);   // sort an array
			
			myArray = Arrays.copyOf(myArray, 100); // resize myArray to 100 elements
			assert (myArray.length == 100);
			
			
			
			List<Integer> myList = Arrays.asList(myArray);  // converts an array to a List.
			assert myList.size() == 100;
			
			List<Integer> iniitializedList = Arrays.asList(1,2,3,4);  // initialize a list
			assert iniitializedList.size() == 4;
			
			/********************** Collections ***********************/
			// addAll
			List<String> myKids = new ArrayList<String>();
			Collections.addAll(myKids, "Daniel", "Eliana", "Michaela", "David");
			myKids.forEach(kid -> System.out.println(kid));
			myKids.stream().map(kid -> kid.toUpperCase()).forEach(kid -> System.out.println(kid));
		
			// sort in ascending order
			List<Integer> ages = Arrays.asList(15,8, 47, 11, 13, 37);
			Collections.sort(ages);
			ages.forEach(age -> System.out.println(age));
			
			// binary search
			int  found = Collections.binarySearch(ages, 15);
			System.out.println("Found returns the index of the element in list: " + found);
			
			int notFound = Collections.binarySearch(ages, 7);
			System.out.println("Not found returns -1: " + notFound);
			
			
			// swap
			Collections.swap(ages, 0, 5);   // swap first and fifth element in the list
			ages.forEach(age -> System.out.println(age));
			
			//min
			Integer minAge = Collections.min(ages);
			System.out.println("Minimum age in list is: " + minAge);
			
			//max
			Integer maxAge = Collections.max(ages);
			System.out.println("Maximum age in list is: " + maxAge);
			
			//min - another approach using the max method with comparator
			Integer minAge2 = Collections.max(ages, Collections.reverseOrder());
			System.out.println("Minimum age (approach 2 using comparator) in list is: " + minAge2);

			// sort in descending order using comparator
			List<Integer> ages2 = Arrays.asList(15,8, 47, 11, 13, 37);
			Collections.sort(ages2, Collections.reverseOrder());
			System.out.println("Sort in descending order:");
			ages2.forEach(age -> System.out.println(age));
			
			// reverse list
			System.out.println("Reverse the list - should now print ages in ascending order:");
			Collections.reverse(ages2);
			ages2.forEach(age -> System.out.println(age));
			
			// rotate the list 3 places 
			System.out.println("Rotating the list 3 places:");
			Collections.rotate(ages2, 3);
			ages2.forEach(age -> System.out.println(age));	
			
			/******************* Conversions  ***************************/
			
			Integer myInt = Integer.parseInt("85");  // convert a String to an Integer
			assert myInt == 85;
			
			assert myInt.toString().equals("85"); // convert an Integer to a String
			
			Character c1 = '9';
			int i1 = Character.getNumericValue(c1);  // convert a character to its numeric value
			assert i1 == 9;
			
			/********************  Character *****************************/
			
			Character myChar = 'a';
			boolean isAlphabetic = Character.isAlphabetic(myChar);
			assert isAlphabetic == true;
			
			boolean isAlphaNum = Character.isLetterOrDigit(myChar);
			assert isAlphaNum == true;
			
			boolean isDigit = Character.isDigit(myChar);
			assert isDigit == false;
			
			boolean isWhiteSpace = Character.isWhitespace(myChar);
			assert isWhiteSpace == false;
			
			/*******************  Function interface ***********************/
			
			MathOperation myAdd = (x1,y1) -> x1 + y1;  // functional interface and lambda function
			int z1 = myAdd.calculate(3, 5);
			assert z1 == 8;
			
			Map<String, MathOperation> mapOfMathOperations = new HashMap<String, MathOperation>();
			mapOfMathOperations.put("+",(x2,y2) -> x2+y2);
			mapOfMathOperations.put("-",(x2,y2) -> x2-y2);
			mapOfMathOperations.put("*",(x2,y2) -> x2*y2);
			mapOfMathOperations.put("/",(x2,y2) -> x2/y2);
			// Note in Java 9, you can initialize this map as follows
			// Map<String, MathOperation> mapOfMathOperations = Map.of ("+", (x2,y2) -> x2+y2), "-", (x2,y2) -> x2-y2);
			assert mapOfMathOperations.get("*").calculate(5, 6) == 30;
			
			/*********************  Streams and functional programming in Java 8 **************/
			
			List<BigDecimal> values = Arrays.asList(new BigDecimal(1.0), new BigDecimal(2.99), new BigDecimal(3.99));
			//Optional<BigDecimal> sum = values.stream().reduce(BigDecimal::add);
			BigDecimal sum = values.stream().reduce(BigDecimal.ZERO, (subtotal,element) -> subtotal.add(element));
			System.out.println("Sum of stream of Big Decimals: " + sum);
			


			List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
			int result = numbers
			  .stream()
			  .reduce(0, (subtotal, element) -> subtotal + element);
			assert result == 21;
			
			// simplest for loop for a Collection
			for (Integer number : numbers) {
				System.out.println(number);
			}
			
			// List contain a Strings that represent numbers, convert to List of BigDecimal and add up the numbers in the list
			String[] moneyValues = { "10.00", "20.50", "30.50", "1.99", "-100.00" };
			BigDecimal total = new BigDecimal(0.00);
			BigDecimal sumOfMoney = 	Arrays.asList(moneyValues).
											stream().map(value -> new BigDecimal(value)).  // covert String to BigDecimal
											filter(value -> BigDecimal.ZERO.compareTo(value) == -1).   // filter values less then 0
											reduce(BigDecimal.ZERO, (subtotal, element) -> subtotal.add(element));  // adds the values
			
			System.out.println("Sum of money: " + sumOfMoney);
			
			
		}	
		
		interface MathOperation {
			public int calculate (int x, int y);
		}
	}
	
	public static void main(String[] args) {
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
		
		CheatSheet ch = new CheatSheet();
		ch.cheatSheet();
			
	}
	


}
