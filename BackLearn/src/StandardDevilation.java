import java.util.Scanner;

public class StandardDevilation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("x = ?");
		double x = input.nextDouble();
		System.out.println("y = ?");
		double y = input.nextDouble();
		System.out.println("z = ?");
		double z = input.nextDouble();
		input.close();
		
		double mean = (x+y+z)/3;
		double standard = Math.sqrt(Math.pow(x - mean, 2) + Math.pow(y-mean, 2)+Math.pow(z-mean, 2)/ 3);
		
		System.out.println("mean"+" "+ mean);
		System.out.println("standard" +" "+ standard);
		
	}

}
