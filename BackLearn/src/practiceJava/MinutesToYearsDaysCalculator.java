package practiceJava;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printYearsAndDays(-561600);
		

	}

	public static void printYearsAndDays(long minutes) {
		
		if(minutes <0) {
			System.out.println("Invalid Value");
		}else {
		
			long hour = minutes  / 60L ;
			long day = hour /24L;
			long year = day /365L ;
		
			if(year >=1L && day % 365L ==0) {
				day = 0;
			}else {
				day = day % 365L;
			}
			
	
			System.out.println( minutes + " min = " + year + " y and " + day + " d");
		}
	}
	
	
}
