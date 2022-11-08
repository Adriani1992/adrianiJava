package practiceJava.challenge;

public class Hamburger {
	private String name;
	private String meat;
	private String breadRollType;
	private double price;
	
	//Possible Variable
	private String addition1Name;
	private String addition2Name;
	private String addition3Name;
	private String addition4Name;
	private double addition1Price;
	private double addition2Price;
	private double addition3Price;
	private double addition4Price;
	
	public Hamburger(String name, String meat,  double price, String breadRollType) {
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.price = price;
		System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
	}
	
	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
		System.out.println("Added " + this.addition1Name + " an extra " + this.addition1Price);
	}
	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
		System.out.println("Added " + this.addition2Name + " an extra " + this.addition2Price);
	}
	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
		System.out.println("Added " + this.addition3Name + " an extra " + this.addition3Price);
	}
	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
		System.out.println("Added " + this.addition4Name + " an extra " + this.addition4Price);
	}
	public double itemizehamburger() {
		this.price = this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
		return this.price;
	}
}
