package com.tns.Application;

import com.tns.FrameWork.NormalAcc;
import com.tns.FrameWork.PrimeAcc;
import com.tns.FrameWork.ShopFactory;


public class GSShopFactory extends ShopFactory {
	
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm,float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsprime;
		
	}
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm,float charges, float deliveryCharge) {
		GSNormalAcc gsnormal= new GSNormalAcc(accNo,  accNm, charges,  deliveryCharge);
		return gsnormal;
		
	}
}
