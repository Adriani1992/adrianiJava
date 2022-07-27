package practiceJava;

public class loopPracticeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 2; i<9; i++) {
			System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000, i)));
		}
		
		for(int i = 8; i>=2; i--) {
			System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000, i)));
		}
		
		
	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * interestRate);
	}

}
