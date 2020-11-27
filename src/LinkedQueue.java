
public final class LinkedQueue implements QueueInterface<Customer>{

	private Node firstNode;
	private Node lastNode;
	private int counter;
	public LinkedQueue() {
		firstNode = null;
		lastNode = null;
		counter = 0;
	}

	public void enqueue(Customer newEntry) {
		if(counter<50)
		{
		Node newNode=new Node(newEntry,null);
		if(isEmpty())
			firstNode=newNode;
		else lastNode.setNextNode(newNode);
		lastNode=newNode;
		counter++;
		}
		else
			System.out.println("Queue is Full!");
	}

	public Customer dequeue() {
		counter--;
		Customer front =getFront();
		assert firstNode!=null;
		firstNode.setdata(null);
		firstNode=firstNode.getNextNode();
		if(firstNode==null)
			lastNode=null;
		return front;
	}

	public Customer getFront() {
		if(isEmpty())
			System.out.println("Queue is Empty!");
		else 
			return firstNode.getdata();
		return null;
	}

	public boolean isEmpty() {
		return (firstNode == null) && (lastNode == null);
	}

	public void clear() {
		firstNode=null;
		lastNode=null;
	}

	

}
