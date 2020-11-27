public class waitingline {

	private QueueInterface<Customer> line;
	private int number;
	private int numberServed;
	private int totalTimeWaited;
	public waitingline() {
	line = new LinkedQueue();
	reset();
	} 
	public int getservedcustomers() {return this.numberServed;}
	
	public void simulate(int duration, double arrivalProbability, int maxTransactionTime, int linecapacity) {
	int count=0;
	int transactionTimeLeft = 0;
	int transactionTimeLeft1 = 0;
	for (int arrivaltime = 0; arrivaltime < duration; arrivaltime++) {
	if(count<linecapacity)
	{
	if (Math.random() < arrivalProbability) {
	count++;
	number++; 
	int transactionTime = (int) ((Math.random() * maxTransactionTime) + 1);
	Customer nextArrival=new Customer(arrivaltime, transactionTime, number);
	line.enqueue(nextArrival);
	System.out.println("Customer Number: " + number + " entered line at time " + arrivaltime	+ ". Transaction time is " + transactionTime);	
	} 
	}
	if (transactionTimeLeft > 0)
	transactionTimeLeft--;
	else if (!line.isEmpty()) 
	{
	Customer nextCustomer = (Customer) line.dequeue();
	transactionTimeLeft = nextCustomer.getTransactionTime() - 1;
	int timeWaited = arrivaltime - nextCustomer.getArrivalTime();
	totalTimeWaited = totalTimeWaited + timeWaited;
	numberServed++;
	count--;
	System.out.println("Customer " + nextCustomer.getCustomerNumber() + " begins service at time " + arrivaltime + ". Waiting Time is " + timeWaited);
	} 
	if (transactionTimeLeft1 > 0)
		transactionTimeLeft1--;
		else if (!line.isEmpty()) 
		{
		Customer nextCustomer = (Customer) line.dequeue();
		transactionTimeLeft1 = nextCustomer.getTransactionTime() - 1;
		int timeWaited = arrivaltime - nextCustomer.getArrivalTime();
		totalTimeWaited = totalTimeWaited + timeWaited;
		numberServed++;
		count--;
		System.out.println("Customer " + nextCustomer.getCustomerNumber() + " begins service at time " + arrivaltime + ". Waiting Time is " + timeWaited);
		}

	} 

	} 
	public void showResults() {

	System.out.println();

	System.out.println("Number of Customers served = " + numberServed);

	System.out.println("Total Waiting Time = " + totalTimeWaited);

	double averageTimeWaited = ((double) totalTimeWaited) / numberServed;

	System.out.println("Average Waiting Time = " + averageTimeWaited);

	int leftInLine = number - numberServed;

	System.out.println("Number of Customers left in line = " + leftInLine);

	} 



	public void reset() {

	line.clear();
	number = 0;
	numberServed = 0;
	totalTimeWaited = 0;

	} 


}
