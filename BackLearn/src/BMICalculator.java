import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner Name = new Scanner(System.in);
		
		System.out.println("What's your name ??");
		Scanner Height = new Scanner(System.in);
		
		System.out.println("How tall are you??");
		Scanner Weight = new Scanner(System.in);
		System.out.println("What's your weight?");
		
		
		String n = Name.nextLine();
		double h = Height.nextDouble();
		double w = Weight.nextDouble();
		
		double bmiResult = (w/(h*h));
		
		System.out.println("My Name is" + n + " " + "and my BMI is " + bmiResult);
	
		Name.close();
		Height.close();
		Weight.close();
		
	}

}
