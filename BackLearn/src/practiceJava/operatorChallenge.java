package practiceJava;

public class operatorChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A = 20.00;
		double B = 80.00;
		double sumAB = (A + B) * 100.00;
		double reminderAB = sumAB % 30.00;
		
		boolean resultFromreminderAB = reminderAB == 0? true : false;
		if(!resultFromreminderAB) {
			System.out.println("Got some reminder!");
		};
		
		System.out.println("resultFromreminderAB " +  resultFromreminderAB);
		
		
	}

}
