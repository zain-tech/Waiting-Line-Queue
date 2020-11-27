class Customer {
	int number;
	int arrivaltime;
	int transactionTime;
public Customer(int arrivaltime, int transactionTime, int number){
		this.arrivaltime=arrivaltime;
		this.transactionTime=transactionTime;
		this.number=number;
	}
public int getTransactionTime() {return this.transactionTime;}
public int getArrivalTime() {return this.arrivaltime;}
public int getCustomerNumber() {return this.number;}
public void printdata() {
	System.out.println("Customer Data");
	System.out.println("Customer Number: " + this.number);
	System.out.println("Arrival Time: " + this.arrivaltime);
	System.out.println("Transaction Time: " + this.transactionTime);
}
	

}
