import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberForGuess = (int)Math.floor(Math.random()*100);
		
		int min = 0;
		int max = 99;

		
		String question = "(" + min + "," + max + ")" + "?";
		
		System.out.println(question);
		
		int guessNum = input.nextInt();
		
		while (guessNum != numberForGuess) {
			if(guessNum > 99 || guessNum < 0) {
				System.out.println("Out of range");
				System.out.println(question);
				guessNum = input.nextInt();
			}else if (guessNum > numberForGuess ) {
				max = guessNum -1;
				question = "(" + min + "," + max + ")" + "?";
				System.out.println(question);
				guessNum = input.nextInt();
			}else if(guessNum < numberForGuess) {
				min = guessNum +1;
				question = "(" + min + "," + max + ")" + "?";
				System.out.println(question);
				guessNum = input.nextInt();
			}
		}
		Boolean betweenMin = min == guessNum -1;
		Boolean betweenMax = max == guessNum +1;
		Boolean equalNum = max == min;
		if(betweenMin && betweenMax || equalNum) {
			System.out.println("Oops!");
		}else {
			System.out.println("Correct!");
		}
	
		input.close();
	}

}
