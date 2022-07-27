package practiceJava;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int number) {
		this.x = number;
	}
	
	public void setY(int number) {
		this.y = number;
	}
	public double distance() {
		return distance(0,0);
	}
	
	public double distance(int x , int y) {
		double result = (((this.x - x) * (this.x-x))+((this.y - y) * (this.y -y)));
		return Math.sqrt(result);
	}
	
	public double distance(Point another) {
		return distance(another.x, another.y);
		
	}
	
	
	
}

