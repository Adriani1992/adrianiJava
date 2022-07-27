import java.util.Arrays;

public class randomNum {

	public static void main(String[] args) {
		// 宣告一個長度為5的Array
		int [] A = new int[5];
		
		for (int i = 0; i < A.length ; ++i) {
			A[i] = (int)Math.floor(Math.random()*100);
		}
		
		//Display all elements of A:
		
		int max = A[0];
		int min = A[0];
		int secMax = A[0];
		
		for(int i = 0; i< A.length; ++i) {
			System.out.printf("%d ", A[i]);
			if(max < A[i]) {
				max = A[i];
				secMax = max;
			}else if(secMax > A[i]) {
				secMax = A[i];
			}
			if(min > A[i]) {
				min = A[i];
			}	
		}
		int sum = 0;
		for(int i = 0; i <A.length; ++i) {
			sum += A[i];
		}
		
		int mean = 0;
		
		mean = sum / A.length;
		
		double varianceContent = 0;
		
	
		for(int i = 0; i <A.length; ++i) {
			varianceContent += Math.pow(A[i] - mean, 2);
		}
		
		double variance = 0;
		
		variance = Math.sqrt(varianceContent/ 3);
		
		for(int i =0; i<A.length ; ++i) {
			int tem = A[i];
			int j = (int)Math.random()*A.length;
			
			A[i] = A[j];
			A[j] = tem;
		}

		String [] letters = {"A", "B", "C", "D", "E"};
		
		for(String letter: letters) {
			System.out.printf("%s", letter);
		}
		System.out.println();
		
		System.out.println("max " +  max);
		System.out.println("min " +  min);
		System.out.println("sum " +  sum);
		System.out.println("secMax " +  secMax);
		System.out.println("variance " +  variance);
		
	
		
	}

}
