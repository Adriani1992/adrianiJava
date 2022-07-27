package practiceJava;

public class EqualSumChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean examination = hasEqualSum(1, 1, 1);
		
		System.out.println("examination " + examination);

	}
	
	public static boolean hasEqualSum(int paramsA, int paramsB, int paramsC) {
		
		if(paramsA + paramsB == paramsC) {
			return true;
		}
		return false;
		
	}

}
