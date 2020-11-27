import java.util.Scanner;
public interface Main {
	public static void main(String[] args) {
		int MaxTT=60;
		double prob;
		@SuppressWarnings("resource")
		var in=new Scanner(System.in);
		waitingline auk = new waitingline();
		System.out.println("Enter Arrival Probability: ");
		prob = in.nextDouble();
		System.out.println("Enter Maximum Transaction Time: ");
		MaxTT=in.nextInt();
		auk.simulate(24*60, prob, MaxTT, 50);
	auk.showResults();
	}

	
}
