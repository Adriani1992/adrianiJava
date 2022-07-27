package practiceJava;

public class WeekChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayOfTheWeek(0);
		printDayOfTheWeekChallenge(3);

	}
	
	public static void printDayOfTheWeek(int day) {
		switch(day) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid Day");
		}
	}
	
	public static void printDayOfTheWeekChallenge(int day) {
		if(day ==0) {
			System.out.println("Sunday");
		}else if (day ==1) {
			System.out.println("Monday");
		}else if (day ==6) {
			System.out.println("Saturday");
		}else {
			System.out.println("Invalid Day");
		}
	}
	
	

}
