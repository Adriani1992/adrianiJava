package practiceJava;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberToWords(0);
		
		int result = getDigitCount(0);
		System.out.println("result " + result);
	}

	public static void numberToWords(int number) {
		if(number < 0) {
			System.out.println("Invalid Value");
		}else if(number == 0){
			System.out.println("Zero");
		}else {
			int temp = 0;
			int reverseNum = reverse(number);
			int countOriginal = getDigitCount(number);
			int countAfter = getDigitCount(reverseNum);
			while(reverseNum > 0) {
				temp = reverseNum % 10;
				if(temp == 0) {
					System.out.println("Zero");
				}else if(temp == 1) {
					System.out.println("One");
				}else if(temp == 2) {
					System.out.println("Two");
				}else if(temp == 3) {
					System.out.println("Three");
				}else if(temp == 4) {
					System.out.println("Four");
				}else if(temp == 5) {
					System.out.println("Five");
				}else if(temp == 6) {
					System.out.println("Six");
				}else if(temp == 7) {
					System.out.println("Seven");
				}else if(temp == 8) {
					System.out.println("Eight");
				}else if(temp == 9) {
					System.out.println("Nine");
				}
				reverseNum /= 10;
				
			}
			
			if(countOriginal != countAfter) {
				for(int i = 1; i <=(countOriginal - countAfter); i++) {
					System.out.println("Zero");
				}
			}

		}
	}
	
	public static int reverse(int num) {
		int temp = 0;
		int reverseNum = 0;
		while(num > 0) {
			temp = num % 10;
			reverseNum = (reverseNum * 10)+ temp;
			num /=10;
		}	
		while(num < 0) {
			temp = num % 10;
			reverseNum = (reverseNum * 10)+ temp;
			num /=10;
		}	
		return reverseNum;
	}
	
	public static int getDigitCount(int numA) {
		int count =0;
		if(numA < 0) {
			return -1;
		}else if(numA == 0) {
			count = 1;
		}
		
		while(numA > 0) {
			int temp = 0;
			temp = numA % 10;
			count++;
			numA /=10;
		}	
		
		return count;
	}
}
