package practiceJava;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hasSharedDigit(11, 62);
		
		boolean result = hasSharedDigit(15, 55);
		
		System.out.println("result " + result);

	}
	
	public static boolean hasSharedDigit(int numA, int numB) {
		boolean result = false;
		if(numA < 10 || numA > 99 || numB< 10 || numB > 99) {
			return false;
		}else {
			int count = 0;
			int digitAOne = 0;
			int digitBOne = 0;
			int digitATwo = 0;
			int digitBTwo = 0;
			while (numA > 0 || numB > 0) {
				int digitA = numA % 10;
				int digitB = numB % 10;	
				
				if(count == 0) {
					digitAOne = digitA;
					digitBOne = digitB;
				}else if (count ==1) {
					digitATwo = digitA;
					digitBTwo = digitB;
				}
				count++;
				numA /= 10;
				numB /= 10;	
			}	
			
			if(digitAOne == digitBOne || digitAOne == digitBTwo) {
				result = true;
			}else if (digitATwo == digitBOne || digitATwo == digitBTwo) {
				result = true;
			}
			
		}
		
		return result;
	}
	
}
