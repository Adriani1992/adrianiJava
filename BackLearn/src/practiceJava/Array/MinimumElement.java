package practiceJava.Array;

import java.util.Scanner;

public class MinimumElement {
	
	
	
	private static int readInteger() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number??");
		int num = input.nextInt();
		input.close();
		return num;
	}
	
	public int[] readElements(int num) {
		int [] array = new int[num];
		Scanner input = new Scanner(System.in);
		for(int i =0; i<array.length; i++) {
			System.out.println("Enter number you like?");
			array[i] = input.nextInt();
		}
		input.close();
		return array;
	}
	
	public int finMin(int[] array) {
		int min = array[0];
		for(int i=0; i < array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		return min;
	}
	
	
	
}
