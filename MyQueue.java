package stackandqueue;
/**
 * class contains definition of a queue and methods for different operations
 * @author Shravya P
 *
 */
public class MyQueue {
	private final MyLinkedList<Integer> myLinkedList;
	public MyQueue()
	{
		myLinkedList=new MyLinkedList<Integer>();
	}
	/**
	 * method to add elements to the queue
	 * @param element to be added to queue
	 * @return nothing
	 */
	public void push(INode<Integer> element)
	{
		myLinkedList.append(element);
	}
	/**
	 * method to print elements of the stack
	 * @return nothing
	 */
	public void printQueue()
	{
		myLinkedList.printMyNodes();
	}
}
