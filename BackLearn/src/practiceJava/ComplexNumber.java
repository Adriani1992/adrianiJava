package practiceJava;

public class ComplexNumber {
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return this.real;
	}
	
	public double getImaginary() {
		return this.imaginary;
	}
	
	public void add(double real, double imaginary) {
		this.real += real;
		this.imaginary += imaginary;
	}
	
	public void add(ComplexNumber ComplexNumber) {
		double a = ComplexNumber.getReal();
		double b = ComplexNumber.getImaginary();
		
		this.real +=a;
		this.imaginary +=b;
	}
	
	public void subtract(double real, double imaginary) {
		this.real -= real;
		this.imaginary -= imaginary;
	}
	
	public void subtract(ComplexNumber ComplexNumber) {
		double a = ComplexNumber.getReal();
		double b = ComplexNumber.getImaginary();
		
		this.real -=a;
		this.imaginary -=b;
	}
}
