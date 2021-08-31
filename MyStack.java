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
	 * to get the top most element of the stack
	 * @return top most element of the stack
	 */
	public Integer peak()
	{
		return myLinkedList.head.getKey();
	}
	/**
	 * to remove elements from the top of the stack
	 * @return the stack
	 */
	public INode<Integer> pop()
	{
		return myLinkedList.pop();
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
