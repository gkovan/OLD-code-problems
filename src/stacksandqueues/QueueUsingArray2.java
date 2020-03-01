package stacksandqueues;

import java.util.Arrays;
import java.util.Collections;

public class QueueUsingArray2 {

	private int head = 0, tail = 0, numQueueElements = 0;
	private int SCALE_FACTOR = 2;
	private Integer[] entries;
	
	public QueueUsingArray2(int  capacity) {
		entries = new Integer[capacity];
	}
	
	public void enqueue (Integer x) {
		if (numQueueElements == entries.length) {  // resize
			Collections.rotate(Arrays.asList(entries), -head);
			head = 0;
			tail = numQueueElements;
			entries = Arrays.copyOf(entries, numQueueElements*SCALE_FACTOR);
		}
		entries[tail] = x;
		tail = (tail+1) % entries.length;
		++numQueueElements;
	}
	
	public Integer dequeue() {
		--numQueueElements;
		Integer result = entries[head];
		head = (head+1) % entries.length;
		return result;
	}
	
	public int size() {
		return numQueueElements;
	}
	
	@Override
	public String toString() {
		return "QueueUsingArray2(" + "head=" + head + ", tail=" + tail + ",  entries= " + Arrays.toString(entries) + ")";
		
	}
	
	public static void main(String[] args) {
		QueueUsingArray2 q = new QueueUsingArray2(6);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.toString());
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		System.out.println(q.toString());
		q.enqueue(7);
		System.out.println(q.toString());
		q.dequeue();
		System.out.println(q.toString());
		q.dequeue();
		System.out.println(q.toString());
	}
	
}
