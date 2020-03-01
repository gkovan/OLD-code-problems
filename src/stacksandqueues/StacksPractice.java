package stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class StacksPractice {
	
	public static void main(String[] args) {
	    // push, peak, pop, addFirst, peekFirst, removeFirst , isEmpty
	    // descendingIterator, iterator
		
		Deque<Integer> dequeStack = new ArrayDeque<>();
		dequeStack.push(1);
		dequeStack.push(2);
		dequeStack.push(3);
		dequeStack.push(4);
		dequeStack.push(5);
		dequeStack.addFirst(6);  // this is equivalent to push
		System.out.println(dequeStack.toString());
		dequeStack.pop();
		System.out.println(dequeStack.toString());
		dequeStack.removeFirst();   // this is the same as pop
		System.out.println(dequeStack.toString());
		
		Integer xyz = dequeStack.peekFirst();  // returns the element at top of stack but does not pop it off the stack.
		System.out.println(xyz); 
		
		System.out.println(dequeStack); // 
		
		boolean checkIfEmpty = dequeStack.isEmpty();
		System.out.println("\nCheck if empty: " + checkIfEmpty);
		
		System.out.println("\nIterator:");
		Iterator<Integer> iter = dequeStack.iterator();
		while (iter.hasNext()) {
			Integer abc = iter.next();
			System.out.println(abc);
		}
		
		System.out.println("\nDescending iterator");
		Iterator<Integer> descendingIter = dequeStack.descendingIterator();
		descendingIter.hasNext();
		while(descendingIter.hasNext()) {
			Integer def = descendingIter.next();
			System.out.println(def);
		}
	}
}
