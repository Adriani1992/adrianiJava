
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2;
		for(int i =0; i<=10; i++) {
			System.out.println(pow1(x, i) == pow2(x, i));
		}

	}
	
	public static double pow1(double x, int n ) {
		double result =1;
		for(int i = 1; i<=n; i++) {
			result *=x;
		}
		return result;
		
	}
	
	public static double pow2(double x, int n ) {
		//base case
		if(n == 0) {
			return 1;
		}
		
		//recurrence case
		double result = pow2(x, n/2);
		result = result * result;
		if(n % 2 ==1)
			result = result * x;
		
		return result;
		
	}

}
