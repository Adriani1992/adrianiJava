package practiceJava.challenge;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe", "beef & bacon", 10.60, "white");
		super.addHamburgerAddition1("Chips", 4.75);
		super.addHamburgerAddition2("Drinks", 3.75);
	}
	
	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("There is no additional items can be added to a deluxe burger");
	}
	
	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("There is no additional items can be added to a deluxe burger");
	}
	
	
	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("There is no additional items can be added to a deluxe burger");
	}
	
	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("There is no additional items can be added to a deluxe burger");
	}
	

}
