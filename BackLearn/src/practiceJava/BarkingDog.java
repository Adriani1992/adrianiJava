package practiceJava;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean exnamination = shouldWakeUp(true, 22);
		
		System.out.println("exnamination "+ exnamination);
	}
	
	public static boolean shouldWakeUp(boolean dogBarking, int hourOfDay) {
		
		if(!dogBarking) {
			dogBarking =  false;
		}else {
			if(hourOfDay < 0 || hourOfDay > 23) {
				dogBarking =  false;
			}else if (hourOfDay > 22 || hourOfDay < 8) {
				dogBarking =  true;
			}else {
				dogBarking =  false;
			}
		}	
		return dogBarking;
	}

}
