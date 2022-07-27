package practiceJava;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isPerfectNumber(33550336);
		
		System.out.println("result " + result);

	}
	
	public static boolean isPerfectNumber(int number) {
		if(number < 1) {
			return false;
		}else {
			int sumUp =0;
			for(int i = 1; i <=number; i++) {
				if(number % i == 0 && i != number) {
					sumUp += i;
					System.out.println("i " + i);
				}
			}
			if(sumUp == number) {
				return true;
			}
			System.out.println("sumUp " + sumUp);
			return false;
		}
	}

}
