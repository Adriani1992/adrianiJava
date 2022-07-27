package practiceJava;

public class TeenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean examination = hasTeen(22, 23, 34);

		System.out.println("examination " + examination);
		
		boolean examinationB = isTeen(16);

		System.out.println("examinationB " + examinationB);

	}
	
	public static boolean hasTeen (int peopleA, int peopleB, int peopleC) {
		
		if(peopleA >=13 && peopleA <=19) {
			return true;
		}else if(peopleB >=13 && peopleB <=19) {
			return true;
		}else if (peopleC >=13 && peopleC <=19) {
			return true;
		}
		return false;
		
	}
	
	public static boolean isTeen(int teenA) {
		if(teenA >=13 && teenA <=19) {
			return true;
		}
		return false;
	}

}
