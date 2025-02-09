package com.newgen.banking.model;

public class BankAccount {

	private String accountHolderName;
	private int accountNumber;

	private String accountType;

	public BankAccount(String accountHolderName, int accountNumber, String accountType) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber
				+ ", accountType=" + accountType + "]";
	}
	
	

}
