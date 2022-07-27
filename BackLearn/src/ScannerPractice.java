import java.util.Scanner;


public class ScannerPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Input
		
		System.out.println("Enter r ??");
		
		int r = input.nextInt();
		
		double A = r * r * 3.14;
		
		System.out.println(A);
		
		input.close();
		
	}

}
