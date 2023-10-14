package tn.com.Application;


import tn.com.FrameWork.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
public void withdraw(float creditLimit) {
		
		System.out.println("Dear Current Account User, your Balance is: " +getAccBal()+
				" and Credit Limit is " + creditLimit);
	}
@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	
	
}
