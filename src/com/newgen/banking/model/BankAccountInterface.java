package com.newgen.banking.model;

public interface BankAccountInterface {
	
	public void depositInSavingAccount(double amount);
	public void depositInCurrentAccount(double amount);
	public void withdrawInSavingAccount(double amount);
	public void withdrawInCurrentAccount(double amount);
	public void showSavingAccountDetail();
	public void showCurrentAccountDetail();
	

}
