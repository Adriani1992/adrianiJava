package practiceJava;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted = 0;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		}else {
			this.tonerLevel = -1;
		}
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount > 0 && tonerAmount <= 100) {
			int result = tonerAmount + tonerLevel;
			if(result > 100) {
				return -1;
			}else {
				this.tonerLevel = result;
			}
		}
		return this.tonerLevel;
	}
	
	public int printPage(int pages) {
		int pagesToPrint = 0;
		if(duplex) {
			System.out.println("Printing in duplex mode");
			if(pages % 2 == 0) {
				pagesToPrint = pages/2;
			}else {
				pagesToPrint = (pages/2 ) +1;
			}
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return this.pagesPrinted;
	}
	
}
