package practiceJava;

public class IntEqualityPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printEqual(1, 2, 1);
		
	}
	
	public static void printEqual(int A, int B, int C) {
		if(A < 0 || B <0 || C < 0) {
			System.out.println("Invalid Value");
		}else if (A == B && B ==C && A==C){
			System.out.println("All numbers are equal");
		}else if (A != B && B != C && A !=C) {
			System.out.println("All numbers are different");
		}else {
			System.out.println("Neither all are equal or different");
		}
	}

}
