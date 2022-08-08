package practiceJava;

public class Bedroom {
	private String name;
	private wallJr wall1;
	private wallJr wall2;
	private wallJr wall3;
	private wallJr wall4;
	private Ceiling ceiling;
	private Bed bed;
	private Lamp lamp;

	public Bedroom(String name, wallJr wall1, wallJr wall2, wallJr wall3, wallJr wall4, Ceiling ceiling, Bed bed,
			Lamp lamp) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}

	public Lamp getLamp() {
		return lamp;
	}
	
	public void makeBed() {
		bed.make();
	}
	
}	
