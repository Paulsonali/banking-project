package com.newgen.banking.client;

import com.newgen.banking.model.CurrentAccount;
import com.newgen.banking.service.TransactionService;

public class BankingCurrentAccountClient {
	public static void main(String[] args) {
		CurrentAccount currentAccount=new CurrentAccount("Vipin", 34567, "CURRENT", 1000);
		TransactionService transactionService=new TransactionService(currentAccount);
		transactionService.showCurrentAccountDetail();
		transactionService.depositInCurrentAccount(1000);
		transactionService.withdrawInCurrentAccount(500);
		
		CurrentAccount currentAccount1=new CurrentAccount("Sanika", 34568, "CURRENT", 2000);
		TransactionService transactionService1=new TransactionService(currentAccount1);
		transactionService1.showCurrentAccountDetail();
		transactionService1.depositInCurrentAccount(500);
		transactionService1.withdrawInCurrentAccount(1000);
		
		
	}

}
