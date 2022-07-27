package practiceJava;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(24);

	}
	
	public static void printSquareStar(int number) {
		if(number < 5) {
			System.out.println("Invalid Value");
		}else {
			//first || last row
			//first || last column 
			//row number == columns number
			// currentRow  == current row number => space
			
			for(int i = 1; i<= number; i++) {
				int row = i;
				for(int s=1; s<= number; s++) {
					int col = s;
					if(row ==1 || row == number || col ==1 || col ==number) {
						System.out.print("*");
					}else if(row == col) {
						System.out.print("*");
					}else if(col == (number - row + 1)) {
						System.out.print("*");	
					}else {
						System.out.print(" ");
					}
				}
				
				System.out.println();
			}
			
			
			
		}
	}

}
