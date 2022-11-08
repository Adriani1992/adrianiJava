package practiceJava.Array;

import java.util.Arrays;

public class RecerseArray {

	
	
	private static void reverse(int[] array) {
		System.out.println("Array = " + Arrays.toString(array));
		int [] reverseArray = new int[array.length] ;
		int s = 0;
		for(int i =array.length-1; i >= 0; i--) {
			reverseArray[i] = array[s];
			s++;
		}
		System.out.println("Reversed array = " + Arrays.toString(reverseArray));
		
	}
	
	
	
}
