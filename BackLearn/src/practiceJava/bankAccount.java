package practiceJava;

public class bankAccount {
	private int accountNumber;
	private int balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public void setAccountNum(int number) {
		this.accountNumber = number;
	}
	public void setBalance(int number) {
		this.balance = number;
	}
	public void setPhoneNumber(String number) {
		this.phoneNumber = number;
	}
	
	public void setCustomerName(String name) {
		this.customerName = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAccountNum() {
		return this.accountNumber;
	}
	public int getBalance() {
		return this.balance;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void depositFund(int number) {
		if(number < 0) {
			System.out.println("The number is invalid");
		}else {
			this.balance = this.balance + number;
		}
	}
	
	public void withdrawFund(int number) {
		if(number < 0) {
			System.out.println("The number is invalid");
		}else {
			int result = this.balance - number;
			if(result < 0) {
				System.out.println("It's out of the range of your balance!!");
			}else {
				this.balance = this.balance - number;
			}
		}
	}
	
	
	

}
