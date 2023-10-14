package tn.com.Client;

import tn.com.Application.MMCurrentAcc;
import tn.com.Application.MMSavingAcc;
import tn.com.Application.MMBankFactory;
import tn.com.FrameWork.CurrentAcc;
import tn.com.FrameWork.SavingAcc;
import tn.com.FrameWork.BankFactory;

public class Client {

	public static void main(String[] args) {
BankFactory bf = new MMBankFactory();
		
		
		SavingAcc sa = new MMSavingAcc(321,"Faiz",1000, true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		CurrentAcc ca = new MMCurrentAcc(100,"Pradhnya",2000,100);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		
	}

}
