package practiceJava.Polymorphism;

public class Mitsubishi extends Car{

	public Mitsubishi(int cylinders, String name) {
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
