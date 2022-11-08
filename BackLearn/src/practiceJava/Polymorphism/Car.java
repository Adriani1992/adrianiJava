package practiceJava.Polymorphism;

public class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	public Car(int cylinders, String name) {
		this.engine = true;
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
	}
	
	
	
	public boolean isEngine() {
		return engine;
	}



	public int getCylinders() {
		return cylinders;
	}



	public String getName() {
		return name;
	}



	public int getWheels() {
		return wheels;
	}



	public String startEngine() {
		return "The " + getName() + "'s engine is starting.";
	}
	
	public String accelerate() {
		return "The " + getName() + " is accelerating.";
	}
	
	public String brake() {
		return "The " + getName() + " is braking.";
	}
	
	
}
