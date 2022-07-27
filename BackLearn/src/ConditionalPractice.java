import java.util.Scanner;


public class ConditionalPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = (int)Math.floor(Math.random()*10);
		int b = (int)Math.floor(Math.random()*10);
		
		
		System.out.println("Please write the answer for"+ a +"+"+ b +"= ?");
		int z = input.nextInt();
		
		input.close();
		
		if(z == a + b) {
			System.out.println("Correct!!");
		}else {
			System.out.println("Wrong Answer!");
		}
		
		
		
	}

}
