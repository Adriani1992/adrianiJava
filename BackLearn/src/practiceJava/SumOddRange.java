package practiceJava;

public class SumOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isOddNum = isOdd(1);
		System.out.println("isOddNum " + isOddNum);
		
		int sumUp = sumOdd(100, 1000);
		System.out.println("sumUp " +sumUp);
	}
	
	public static boolean isOdd(int number) {
		if(number > 0) {
			if(number % 2 != 0) {
				return true;
			}else {
				return false;
			}		
		}
		return false;
	}
	
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if(start < 0 || end <0) {
			return -1;
		}else {
			if(end >= start) {
				for(int i = start; i < (end +1 ); i++) {
					if(isOdd(i)) {
						sum += i;
					}
				}
			}else {
				return -1;
			}
		}
		return sum;
	}

}
