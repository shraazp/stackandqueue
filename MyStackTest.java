package stackandqueue;
/**
 * class to perform functions of stack
 * @author Shravya P
 *
 */
public class MyStackTest {
	public static void main(String [] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack=new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		
		
	}
}
