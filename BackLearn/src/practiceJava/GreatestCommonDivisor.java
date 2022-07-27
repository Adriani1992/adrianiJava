package practiceJava;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = getGreatestCommonDivisor(81, 153);
		
		System.out.println("result " + result);

	}
	
	public static int getGreatestCommonDivisor(int numA, int numB) {
		int gcd = 1; 
		if(numA < 10 || numB < 10) {
			return -1;
		}else {
			for(int i = 1; i<=numA || i <= numB; i++) {
				if(numA % i ==0 && numB % i ==0) {
					gcd = i;
				}
			}
		}
		return gcd;
	}

}
