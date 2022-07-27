package practiceJava;

public class SpeedConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printConversion(-2);
		
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		if(kilometersPerHour < 0d) {
			return -1;
		}
		
		long milesPerHour = Math.round(kilometersPerHour/1.609);
		return milesPerHour;
		
	}
	
	public static void printConversion(double kilometersPerHour) {
		
		if(kilometersPerHour < 0d) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
		}	
		
	}

}
