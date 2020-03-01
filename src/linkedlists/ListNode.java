package linkedlists;

public class ListNode<T> {
	public ListNode(T i, ListNode<T> object) {
		this.data = i;
		this.next = object;
	}
	
	public ListNode() {
	}
	
	public T data;
	public ListNode<T> next;
}
