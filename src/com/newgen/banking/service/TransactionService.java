package com.newgen.banking.service;

import com.newgen.banking.model.BankAccount;
import com.newgen.banking.model.BankAccountInterface;
import com.newgen.banking.model.CurrentAccount;
import com.newgen.banking.model.SavingAccount;

public class TransactionService implements BankAccountInterface {
	private BankAccount bankAccount;
	private SavingAccount savingAccount;
	private CurrentAccount currentAccount;


	public TransactionService(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
		
		
		
	}
	public TransactionService(CurrentAccount currentAccount) {
		
		this.currentAccount = currentAccount;
		
		
	}

	@Override
	public void depositInSavingAccount(double amount) {
		if (savingAccount instanceof BankAccount) {

			double balance = savingAccount.getInitialBalance() + amount;
			savingAccount.setInitialBalance(balance);
			System.out.println("After Deposit " + amount + " is : " + savingAccount.getInitialBalance());
		}
	}

	@Override
	public void depositInCurrentAccount(double amount) {
		if (currentAccount instanceof BankAccount) {
			double balance = currentAccount.getInitialBalance() + amount;
			currentAccount.setInitialBalance(balance);
			System.out.println("After Deposit " + amount + " is : " + currentAccount.getInitialBalance());
		}

	}

	@Override
	public void withdrawInSavingAccount(double amount) {
		if (savingAccount instanceof BankAccount) {
			
				double balance = savingAccount.getInitialBalance() - amount;
				savingAccount.setInitialBalance(balance);
				System.out.println("After withdraw " + amount + " is : " + savingAccount.getInitialBalance());
			} 
		}

	

	@Override
	public void withdrawInCurrentAccount(double amount) {
		if (savingAccount instanceof BankAccount) {
			double balance = currentAccount.getInitialBalance() - amount;
			currentAccount.setInitialBalance(balance);
			System.out.println("After withdraw " + amount + " is : " + currentAccount.getInitialBalance());
		}

	}

	@Override
	public void showSavingAccountDetail() {
		System.out.println(savingAccount.getId());
		System.out.println("Name : " + savingAccount.getAccountHolderName());
		System.out.println("Account_Number: " + savingAccount.getAccountNumber());
		System.out.println("Account_Type : " + savingAccount.getAccountType());
		System.out.println("InitialBalance : " + savingAccount.getInitialBalance());

	}

	@Override
	public void showCurrentAccountDetail() {
		System.out.println(currentAccount.getId());
		System.out.println("Name : " + currentAccount.getAccountHolderName());
		System.out.println("Account_Number: " + currentAccount.getAccountNumber());
		System.out.println("Account_Type : " + currentAccount.getAccountType());
		System.out.println("InitialBalance : " + currentAccount.getInitialBalance());

	}

}
