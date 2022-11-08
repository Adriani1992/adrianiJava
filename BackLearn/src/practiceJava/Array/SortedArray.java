package practiceJava.Array;

import java.util.*;

public class SortedArray {
	
	int[] myArray;
	
	Scanner scanner = new Scanner(System.in);
	
	public int[] getIntegers(int number) {
		myArray = new int[number];
		System.out.println("Enter the number??");
		for(int i =0; i<myArray.length; i++) {
			myArray[i] = scanner.nextInt();
		}
		return myArray;
	}
	
	public void printArray(int[] array) {
		for(int i = 0; i < array.length; i ++) {
			System.out.println("Element " + i + " contents " + array[i]);	
		}
	}
	
	public int[] sortIntegers(int[] array) {
		for(int i =0; i<array.length; i++) {
			int now = array[i];
			int s = i-1;
			while(s>=0 && now > array[s]) {
				array[s+1] = array[s];
				s--;
			}
			array[s+1] = now;
		}
		return array;
	}

	
	
	
}
