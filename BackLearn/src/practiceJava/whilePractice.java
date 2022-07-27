package practiceJava;

public class whilePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  sumNum = sumDigits(125);
		System.out.println("sumNum " + sumNum);
		
	}
	
	public static  int sumDigits(int number) {
			if(number < 10) {
				return -1;
			}else {
				
				int sum =0;
				
				while(number>0) {
					
					int digit = number % 10;
					sum += digit;
					
					number /= 10;
				}
				return sum ;
			}
	}
}
