
public class MaxNumber {

	public static void main(String[] args) {
		int a = (int)Math.floor(Math.random()*(101))-50;
		int b = (int)Math.floor(Math.random()*(101))-50;
		int c = (int)Math.floor(Math.random()*(101))-50;
		
		int maxNum = a;
		if(a<b) {
			maxNum = b;
		}else if(b<c) {
			maxNum = c;
		};
		
		System.out.println("Max Number is " + " "+ maxNum);
	}

}
