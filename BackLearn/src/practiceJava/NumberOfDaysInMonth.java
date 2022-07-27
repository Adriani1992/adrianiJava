package practiceJava;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean leapExam = isLeapYear(0);
		
		System.out.println("leapExam " + leapExam);
		
		int dayMonth = getDaysInMonth(1, -2018);
		
		System.out.println("dayMonth " + dayMonth);

		
	}
	
	public static boolean isLeapYear (int year) {
		if(year <=0 || year > 9999) {
			return false; 
		}else {
			boolean  leapYear = false;
			if(year % 4 ==0 && year % 100 == 0 && year % 400 ==0) {
				leapYear = true;
			}else if(year % 4 ==0 && year % 100 == 0 && year % 400 !=0) {
				leapYear =  false;
		
			}else if (year % 4 ==0) {
				leapYear =  true;
			}
			
			return leapYear;
		}
	}
	
	public static int getDaysInMonth(int month, int year) {
			
		if(year < 1 || year > 9999) {
			return -1;
		}else {
			boolean isLeap = isLeapYear(year); 
			int day = 30;

			if(month < 1 || month >12) {
				return -1;
			}else {
				if(month ==1) {
					day = 31;
				}else if(month ==2) {
					if(isLeap) {
						day = 29;
					}else {
						day = 28;
					}
				}else if(month ==3) {
					day = 31;
				}else if(month ==5) {
					day = 31;
				}else if(month ==7) {
					day = 31;
				}else if(month ==8) {
					day = 31;
				}else if(month ==10) {
					day = 31;
				}else if(month ==12) {
					day = 31;
				}
				
				return day;
				
			}
			
		}
		
	}

}
