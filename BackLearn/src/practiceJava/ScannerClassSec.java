package practiceJava;
import java.util.Scanner;

public class ScannerClassSec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner question = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		while(true) {
			
			System.out.println("Enter number?");
			
			boolean makeSure = question.hasNextInt();
			
			if(makeSure) {
				int num  = question.nextInt();
	
				if (num > max) {
					max = num;
					min = max;
				}else if(num < max) {
					min = num;
				}
				
				
			}else {
				break;
			}
			question.nextLine();
		}
		
		question.close();
		
		System.out.println("Max" + max);
		System.out.println("Min" + min);
		
	}

}
