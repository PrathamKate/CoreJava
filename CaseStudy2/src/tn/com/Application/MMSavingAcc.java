package tn.com.Application;
import tn.com.FrameWork.SavingAcc;
public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL=0;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	public void withdraw(float MINBAL) {
		System.out.println("Dear Saving Account Member, your Balance is: "+MINBAL);
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


}
