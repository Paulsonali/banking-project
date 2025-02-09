package com.newgen.banking.model;

public class CurrentAccount extends BankAccount {
	private int Id;
	private static int count=1;
	private double initialBalance;

	
	public CurrentAccount(String accountHolderName, int accountNumber, String accountType,double initialBalance) {
		super(accountHolderName, accountNumber, accountType);
		this.initialBalance=initialBalance;
		Id=count++;
	}
	
	

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	
	

}
