package practiceJava.Polymorphism;

public class Holden extends Car {

	public Holden(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String startEngine() {
		return "The "+ getName() + "'s engine is starting.";
	}
	
	@Override
	public String accelerate() {
		return "The " + getName() + " is accelerating.";
	}
	
	@Override
	public String brake() {
		return "The " + getName() + " is braking.";
	}
	
}
