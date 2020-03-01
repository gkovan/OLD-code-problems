package stacksandqueues;

public class QueueUsingArray {
	Integer[] queue = null;
	int start = -1;
	int end = -1;
	int elementsInQueue = 0;
	int capacity;
	
	public QueueUsingArray(int capacity) {
		queue = new Integer[capacity];
		this.capacity = capacity;
	}
	
	public boolean enqueue(Integer elem) {
	
		if (elem == null) {
			return false;
		}
		
		if (start == -1 && end == -1) {
			start = 0;
		}
		
		if (end == capacity-1) {
			resizeArray();
		}

		
		end++;
		queue[end] = elem;
		return true;
	}
	
	private void resizeArray() {
		Integer[] newQ = new Integer[capacity*2];
		int cnt = 0;
		for (int i=start; i <= end; i++) {
			newQ[cnt++] = queue[i];
		}
		queue = newQ;
		end = end - start;
		start = 0;
	}
	
	public boolean dequeue() {
		if (start >= 0) {
			start++;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = start; i <= end; i++ ) {
			sb.append(queue[i] + ",");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray(6);
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
