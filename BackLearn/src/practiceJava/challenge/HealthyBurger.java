package practiceJava.challenge;

public class HealthyBurger extends Hamburger {
	
	private String healthExtra1Name;
	private double healthExtra1Price;
	private String healthExtra2Name;
	private double healthExtra2Price;
	

	public HealthyBurger( String meat, double price) {
		super("Healthy", meat, price, "White");
		// TODO Auto-generated constructor stub
		
	}
	
	public void addHealthyAddition1(String name, double price) {
		this.healthExtra1Name = name;
		this.healthExtra1Price = price;
		System.out.println("Added " + this.healthExtra1Name + " an extra " + this.healthExtra1Price);
	}
	
	public void addHealthyAddition2(String name, double price) {
		this.healthExtra2Name = name;
		this.healthExtra2Price = price;
		System.out.println("Added " + this.healthExtra2Name + " an extra " + this.healthExtra2Price);
	}
	
	@Override
	public double itemizehamburger() {
		double result = super.itemizehamburger();
		result = result + this.healthExtra1Price + this.healthExtra2Price;
		return result;
	}

}
