package practiceJava;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean examination = isLeapYear(2600);
		System.out.println("examination " + examination);
		
	}

	public static boolean isLeapYear(int year) {
		if(year >= 1 && year <= 9999) {
			
			boolean  leapYear = false;
			
			if(year % 4 ==0 && year % 100 == 0 && year % 400 ==0) {
				leapYear = true;
			}else if(year % 4 ==0 && year % 100 == 0 && year % 400 !=0) {
				leapYear =  false;
		
			}else if (year % 4 ==0) {
				leapYear =  true;
			}

			return leapYear;
			
		}else {
			return false;
		}
		
		
		
	}
	
}
