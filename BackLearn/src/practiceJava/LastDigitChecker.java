package practiceJava;

public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		boolean result = hasSameLastDigit(9, 99, 999);
		
		System.out.println("result " + result);
	}
	
	public static boolean hasSameLastDigit(int numA, int numB, int numC) {
		boolean result =false;
		boolean validNum = isValid(numA) && isValid(numB) && isValid(numC);
		if(validNum) {
			int lastNumA = 0;
			int lastNumB = 0;
			int lastNumC = 0;
			int count =0;
			while(numA > 0 || numB > 0 || numC >0) {
				int digitA = numA % 10;
				int digitB = numB % 10;
				int digitC = numC % 10;
				
				if(count ==0) {
					lastNumA = digitA;
					lastNumB = digitB;
					lastNumC = digitC;
				}
				
				count++;
				numA/=10;
				numB/=10;
				numC/=10;
			}
			
			if(lastNumA == lastNumB || lastNumA == lastNumC || lastNumB == lastNumC) {
				result = true;
			}
		
		}
		return result;
	}
	
	public static boolean isValid(int num) {
		if(num < 10 || num > 1000) {
			return false;
		}
		return true;
	}
}
