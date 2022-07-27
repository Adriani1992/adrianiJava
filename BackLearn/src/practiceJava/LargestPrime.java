package practiceJava;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getLargestPrime(217);
		
		System.out.println("result " + result);
		
	}
	//網路上的解答
	//質數很麻煩

	public static int  getLargestPrime(int number) {
		int largestNum  = 2;
		if(number <= 0 || number <=1) {
			return -1;
		}else {
			while(largestNum < number) {
				if(number % largestNum !=0) {
					largestNum ++;
				}else {
					number = number /largestNum;
				}
			}
			return number;
		}
	}
}
