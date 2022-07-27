import java.util.Scanner;


public class covidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of people's size??");
		
		int personSize = input.nextInt();
		
		int [] personNum = new int[personSize];
		
		for(int i =0; i < personNum.length; i++) {
			personNum[i]=i;
			//System.out.printf("%d", personNum[i]);
		};
		System.out.println();
		
		int [] contactee = new int[personSize];
		
		for(int i =0; i < contactee.length; i++) {
			contactee[i]=i;
		};
		
		for(int i = 0; i < contactee.length; i++) {
			int temp = contactee[i];
			int randomNum = ((int)Math.random()*contactee.length - i)+i;
			
			contactee[i] = contactee[randomNum];
			contactee[randomNum] = temp;
			
		}
		
		int rows = 2;
		int [][] covidCheck = new int[rows][personSize];
		
		for(int i = 0; i<covidCheck.length; i++) {
			if(i==0) {
				for(int j = 0; j<covidCheck[i].length; j++) {
					covidCheck[i][j]= personNum[j];
					System.out.printf("%3d", covidCheck[i][j]);
				}
			}
			System.out.println();
			if(i==1) {
				for(int j = 0; j<covidCheck[i].length; j++) {
					covidCheck[i][j]= contactee[j];
					System.out.printf("%3d", covidCheck[i][j]);
				}
			}
			
		}
		
		
		
		
		
		
		
		

		
		
		input.close();
	}

}
