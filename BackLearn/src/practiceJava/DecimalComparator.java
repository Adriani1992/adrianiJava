package practiceJava;

public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areEqualByThreeDecimalPlaces(1.555, 1.555);
		
		boolean examination = areEqualByThreeDecimalPlaces(3.1756, 3.175);
		
		System.out.println("examination " + examination);

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double parameterA, double parameterB) {
		
		double A = (double) Math.floor(parameterA * 1000d) / 1000d;
		double B = (double) Math.floor(parameterB * 1000d) / 1000d;
		
		if(parameterA < 0 && parameterB <0) {
			A = (double) Math.ceil(parameterA * 1000d) / 1000d;
		    B = (double) Math.ceil(parameterB * 1000d) / 1000d;
		}
		
		
		if(A == B) {
			return true;
		}
		
		return false;
	}
	

}
