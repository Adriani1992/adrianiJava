package practiceJava.Array;

import java.util.ArrayList;

import AutoBoxing.Branch;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	
	
	public Customer(String name, double transaction) {
		this.name = name;
		transactions = new ArrayList<Double>();
		this.transactions.add(Double.valueOf(transaction));
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	
	public void addTransaction(double transaction) {
		this.transactions.add(Double.valueOf(transaction));
	}
	
}

