package practiceJava;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumFirstAndLastDigit(252);
		
		int result = sumFirstAndLastDigit(-10);
		
		System.out.println("result " + result);

	}
	
	public static int sumFirstAndLastDigit(int number) {
		int sumUp = 0;
		int count = 0;
		int lastTem = 0;
		int firstTem = 0;
		if(number < 0) {
			return -1;
		}
		while(number > 0) {
			int digits = number % 10;
			
			if(count == 0) {
				lastTem = lastTem * 10 + digits;
			}
			if(number < 10) {
				firstTem = digits;
			}
			
			count++;
			number /= 10;
			
			sumUp = firstTem + lastTem;
		}

		return sumUp;
	}
}
