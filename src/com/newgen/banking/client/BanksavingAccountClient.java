package com.newgen.banking.client;

import com.newgen.banking.model.SavingAccount;
import com.newgen.banking.service.TransactionService;

public class BanksavingAccountClient {
	
	public static void main(String[] args) {
		SavingAccount savingAccount=new SavingAccount("Arohi", 234567, "SAVING", 300);
		TransactionService transactionService=new TransactionService(savingAccount);
		transactionService.showSavingAccountDetail();
		transactionService.depositInSavingAccount(500);
		transactionService.withdrawInSavingAccount(400);
		
		SavingAccount savingAccount1=new SavingAccount("Poonam", 234568, "SAVING", 500);
		TransactionService transactionService1=new TransactionService(savingAccount1);
		transactionService1.showSavingAccountDetail();
		transactionService1.depositInSavingAccount(300);
		transactionService1.withdrawInSavingAccount(200);
	}

}
