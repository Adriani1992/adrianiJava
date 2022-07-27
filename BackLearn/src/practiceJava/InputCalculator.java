package practiceJava;
import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputThenPrintSumAndAverage();
		//inputTry();
	}

	public static void inputThenPrintSumAndAverage() {
		int XX = 0;
		int YY = 0;
		int count = 0;
		Scanner question = new Scanner(System.in);
		//System.out.println("Enter number ?");
		while(true) {
			
			boolean makeSure = question.hasNextInt();
			if(makeSure) {
				int num = question.nextInt();
				XX += num; 
				count++;
			}else if(count == 0){
				System.out.println("SUM = 0 AVG = 0");
				break;
			}else {
				if(XX % count == 0) {
					YY = (int)XX/count;
				}else {
					double tempNum = (double)XX/count;
					YY = (int)Math.round(tempNum);
				}
				System.out.println("SUM = " + XX + " AVG = " + YY);
				break;
			}
			question.nextLine();
		}
		question.close();
		
//		System.out.println("SUM = " + XX + " AVG = " + YY);
	}
	
	public static void inputTry(){
        int sum = 0, count = 0, avg =0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int value = sc.nextInt();
                sum += value;
                count++;
            } else if (count == 0){
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                avg = sum/count;
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }

	
}


  
