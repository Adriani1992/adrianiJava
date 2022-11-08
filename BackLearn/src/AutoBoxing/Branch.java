package AutoBoxing;

import java.util.ArrayList;
import practiceJava.Array.Customer;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;
	
	public Branch(String name){
		this.name = name;
		customers = new ArrayList<Customer>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public boolean newCustomer(String name, double transaction) {
		Customer isExisting = findCustomer(name);
		if(isExisting == null) {
			Customer isNew = new Customer(name, transaction);
			this.customers.add(isNew);
			return true;
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String name, double transaction) {
		Customer isExisting = findCustomer(name);
		if(isExisting == null) {
			return false;
		}else {
			isExisting.addTransaction(Double.valueOf(transaction));
			return true;
		}
	}
	
	
	private Customer findCustomer(String name) {
		int findNumber = -1;
		for(int i=0; i<this.customers.size(); i++) {
			Customer customer = this.customers.get(i);
			if(customer.getName().equals(name)) {
				findNumber = i;
			}
		}
		if(findNumber < 0) {
			return null;
		}else {
			Customer customer = this.customers.get(findNumber);
			return customer;
		}
		 
	}
	
	
}
