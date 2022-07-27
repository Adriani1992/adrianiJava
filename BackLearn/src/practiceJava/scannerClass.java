package practiceJava;
import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1;
		int counter = 0;
		Scanner question = new Scanner(System.in);
		
		
		while (count <= 10) {
			
			
			System.out.println("Enter number #" + count + " ?");
			
			boolean makeSure = question.hasNextInt()
;
			if(makeSure) {
				int num = question.nextInt();
				counter += num;
				count++;
			}else {
				System.out.println("Invalid Number");
			}
			
			question.nextLine();
			
		}
		
		question.close();
		System.out.println("counter " + counter);

	}

}
