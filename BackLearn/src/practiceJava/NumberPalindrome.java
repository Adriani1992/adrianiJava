package practiceJava;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result = isPalindrome(1221);
		
		System.out.println("result " + result);
		
	}
	
	public static boolean isPalindrome(int number) {
		int temNum = number;
		int reverseNum = 0;
		while(number > 0) {
			int digitNum = number % 10;
			reverseNum = (int)( reverseNum * 10) + digitNum;		
			number /= 10;
		}
		
		while(number < 0) {
			int digitNum = number % 10;
			reverseNum = (int)( reverseNum * 10) + digitNum;
			System.out.println(digitNum);				
			number /= 10;
		}
		if(temNum == reverseNum) {
			return true;
		}
		return false;
	}
}
