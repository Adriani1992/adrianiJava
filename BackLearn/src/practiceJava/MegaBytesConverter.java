package practiceJava;

public class MegaBytesConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(5000);

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		int MB = Math.round(kiloBytes / 1024);
		int remainingKilo = kiloBytes % 1024;
		
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		}else {		
			System.out.println(kiloBytes + " KB = " + MB + " MB and " + remainingKilo + " KB");
		}
	}

}
