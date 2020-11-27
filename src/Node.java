
class Node {
	private Customer data;
	private Node next=null;
	
	public Node(Customer newEntry,Object next)
	{
		this.data=newEntry;
		this.next= (Node) next;
	}
	public Customer getdata() {return data; }
	public void setdata(Customer data) {this.data=data;}
	public Node getNextNode() {return next;}
	public void setNextNode(Node next) {this.next=next;}

}
