package practiceJava;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = getEvenDigitSum(-22);
		
		System.out.println("result " + result);

	}
	
	public static int getEvenDigitSum(int number) {
		int sumUp =0;
		if(number < 0) {
			return -1;
		}else {
			while(number > 0) {
				int digits = number % 10;
				if(digits % 2 == 0) {
					sumUp += digits;
				}
				
				number /= 10;
			}
		}
		return sumUp;
	}
	

}
