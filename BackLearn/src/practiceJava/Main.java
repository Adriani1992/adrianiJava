package practiceJava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(50, true);
		System.out.println(printer.addToner(50));
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPage(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPage(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
	}
	

}
