
public class shuffleMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] porkerImg = {"Club", "Diamon" ,"Heart", "Spade"};
		String [] porkerNum = {"A", "2", "3", "4", "5", "6","7", "8","9","10", "J", "Q", "K"};
		
		int size = 52;
		int [] desk = new int[size];
		
		for(int i = 0; i < desk.length; i++ ) {
			desk[i]=i;
		
			
			
		}
		for(int i = 0; i <size-1; i++) {
			int j = ((int)Math.random()* size-i)+i;
			
		}
		
		
		

	}

}
