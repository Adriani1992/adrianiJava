package practiceJava;

public class loopPracticeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temA = 0;
		//int temB = 0;
		int count = 0;
		
		for(int i = 1; i <1000; i++) {
			if(i % 3 ==0 && i % 5==0) {
			System.out.println(i);
				temA += i;	
				count ++;
				if(count == 5) {
					//System.out.println("count " + count);
					//System.out.println(i);
					temA += i;	
					break;
				}
			}
		}	
		
		System.out.println("tem " + temA);
	}
}
