package AutoBoxing;

import java.util.ArrayList;

import practiceJava.Array.Customer;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		branches = new ArrayList<Branch>();
	};
	
	public boolean addBranch(String name) {
		Branch isExisting = findBranch(name);
		if(isExisting == null) {
			Branch isNew = new Branch(name);
			this.branches.add(isNew);
			return true;
		}
		
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double transaction) {
		Branch findOutBranch = findBranch(branchName);
		if(findOutBranch !=null) {
			Boolean addingSuccess = findOutBranch.newCustomer(customerName, transaction);
			if(addingSuccess) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
		Branch findOutBranch = findBranch(branchName);
		if(findOutBranch !=null) {
			Boolean addingSuccess = findOutBranch.addCustomerTransaction(customerName, transaction);
			if(addingSuccess) {
				return true;
			}
		}
		return false;
	}
	
	public boolean listCustomers(String branchName, boolean transactions) {
		Branch findOutBranch = findBranch(branchName);
		if(findOutBranch !=null) {
			ArrayList<Customer> customerList = findOutBranch.getCustomers();
			System.out.print("Customer details for branch " + findOutBranch.getName()+"\n");
				for(int i = 0; i< customerList.size();i++) {
					if(transactions && customerList.get(i).getTransactions().size()!=0) {
						System.out.print("Customer: "+customerList.get(i).getName() + "["+(i+1)+"]\n"
								);
						System.out.print("Transactions\n");
						ArrayList<Double> haveList = customerList.get(i).getTransactions();
						for(int s = 0; s < haveList.size(); s++) {
							System.out.print("[" + (s+1) + "]   " + "Amount " + haveList.get(s)+"\n");
						}
					}else {
						System.out.print("Customer: "+customerList.get(i).getName() + "["+(i+1)+"]\n"
								);
					}
					
				}
				return true;
			}
		return false;
	}
	
	
	
	private Branch findBranch(String name) {
		int findNumber = -1;
		for(int i=0; i<this.branches.size(); i++) {
			Branch branch = this.branches.get(i);
			if(branch.getName().equals(name)) {
				findNumber = i;
			}
		}
		if(findNumber < 0) {
			return null;
		}else {
			Branch branch = this.branches.get(findNumber);
			return branch;
		}
	}
	
}
