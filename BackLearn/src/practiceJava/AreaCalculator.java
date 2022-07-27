package practiceJava;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double circle = area(-1);
		
		System.out.println("circle " + circle);
		
		double rectangle = area(-1.0, 4.0);

		System.out.println("rectangle " + rectangle);
		
		
	}

	public static double area (double radius) {
		
		if(radius < 0) {
			return -1.0;
		}else {
			return radius * radius * 3.14159;
		}
		
	}
	
	public static double area (double x, double y) {
		if(x < 0 || y<0) {
			return -1.0;
		}else {
			return x * y;
		}	
			
	}
	
}
