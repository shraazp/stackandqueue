package stackandqueue;
/**
 * class to perform the operations of a queue
 * @author Shravya P
 *
 */
public class MyQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue=new MyQueue();
		myQueue.push(myFirstNode);
		myQueue.push(mySecondNode);
		myQueue.push(myThirdNode);
		myQueue.printQueue();
		System.out.println("Performing dequeue operations till the queue is empty!!");
		myQueue.pop();
		myQueue.printQueue();
		myQueue.pop();
		myQueue.printQueue();
		myQueue.pop();
		myQueue.printQueue();
	}

}
