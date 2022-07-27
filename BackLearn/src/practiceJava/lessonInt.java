package practiceJava;

public class lessonInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte myByte = 24;
		short myShort = 424;
		int myInt = 810417;
		long myLong = 50000L + (10L* ((int)myByte)+((int)myShort)+myInt);
		
		short shortTotal = (short)(50000 + (10* (myByte)+(myShort)+myInt));
		
		System.out.println(myLong);
		
		
		System.out.println(shortTotal);
		
		float myFloat = (float)5.25;
		
		System.out.println(myFloat);
		
		double pounds = 424;
		
		double resultKilo = pounds * 0.45359237;
		
		System.out.println("resultKilo "+resultKilo);
		
		
		
		
		

	}

}
