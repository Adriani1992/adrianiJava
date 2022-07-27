package practiceJava;

public class Wall {
	private double width;
	private double height;
	
	public Wall() {
		this(0.0, 0.0);
	}
	
	public Wall(double width, double height) {
		if(width < 0) {
			this.width = 0;
		}else {
			this.width = width;
		}
		
		if(height < 0) {
			this.height = 0;
		}else {
			this.height = height;
		}
	}

	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setWidth(double num) {
		if(num <=0) {
			this.width = 0;
		}else {
			this.width = num;
		}
	}
	
	public void setHeight(double num) {
		if(num < 0) {
			this.height = 0;
		}else {
			this.height = num;
		}
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
}
