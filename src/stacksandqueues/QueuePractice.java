package stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueuePractice {
	
	public static void main(String[] args) {
		// addLast, removeFirst, getFirst, offerLast, pollFirst, peekFirst, 
		// descendingIterator, iterator
		
		Deque<Integer> dequeQueue = new ArrayDeque<Integer>();
		dequeQueue.addLast(1);
		dequeQueue.addLast(2);
		dequeQueue.addLast(3);
		dequeQueue.addLast(4);      // add to tail
		dequeQueue.addLast(5);       
		dequeQueue.add(6);  // add to tail; same as addLast
		System.out.println(dequeQueue);
		
		Integer firstElement = dequeQueue.getFirst();
		System.out.println(firstElement);
				
		// remove an element using removeFirst method.
		try {
		   Integer elementRemoved = dequeQueue.removeFirst();  // removes first element; if queue is empty it throws an exception
		   System.out.println("element removed using removeFirst method: " + elementRemoved);
		} catch (NoSuchElementException e) {
			System.out.println("The queue is empty.  Cannot remove elemnent from empty queue.");
		}
		
		// remove an element using pollFirst method
		Integer elementRemovedUsingPoll = dequeQueue.pollFirst();
		if (elementRemovedUsingPoll != null) {
		   System.out.println("element removed using pollFirst method: " + elementRemovedUsingPoll);
		} else {
			System.out.println("The queue is empty.");
		}
		
		System.out.println(dequeQueue);
	}

}
