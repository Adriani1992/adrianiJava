package practiceJava;

public class PracticeMethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double centimeters = calcFeetAndInchesToCentimeters(8, 0);
		
		System.out.println("centimeters " + centimeters);

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet < 0d || inches <0 || inches >12) {
			return -1;
		}else {

			double totalinches = (feet * 12) + inches;
			
			double centimeters = calcFeetAndInchesToCentimeters(totalinches);
			
			return centimeters;
		}
	}
		
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		//System.out.println("inches " + inches);

		if(inches <0) {
			return -1;
		}
		
		double CM  = inches * 2.54;
		
		return CM;
	}
	

}
