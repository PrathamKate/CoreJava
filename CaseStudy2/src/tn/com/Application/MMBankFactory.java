package tn.com.Application;

import tn.com.FrameWork.CurrentAcc;
import tn.com.FrameWork.SavingAcc;
import tn.com.FrameWork.BankFactory;

public  class MMBankFactory extends BankFactory {
	
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm,float accBal, boolean isSalaried) {
		MMSavingAcc gssaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return gssaving;
}
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm,float accBal, float  creditLimit) {
		MMCurrentAcc gscurrent= new MMCurrentAcc(accNo,  accNm, accBal,  creditLimit);
		return gscurrent;
		
	}
	}
	