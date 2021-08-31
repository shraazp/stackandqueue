package stackandqueue;
/**
 * class to define a stack and methods to it
 * @author Shravya P
 *
 */
public class MyStack {

	private final MyLinkedList<Integer> myLinkedList;
	public MyStack()
	{
		myLinkedList=new MyLinkedList<Integer>();
	}
	/**
	 * method to add an element into the stack
	 * @param element element which is to be added to stack
	 * @return nothing
	 */
	public void push(INode<Integer> element)
	{
		myLinkedList.add(element);
	}
	/**
	 * method to print elements of the stack
	 * @return nothing
	 */
	public void printStack()
	{
		myLinkedList.printMyNodes();
	}
}
