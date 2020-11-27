
@SuppressWarnings("hiding")
public interface QueueInterface<Customer> {

	public void enqueue(Customer newEntry);

	public Customer dequeue();

	public Customer getFront();

	public boolean isEmpty();

	public void clear();

}
