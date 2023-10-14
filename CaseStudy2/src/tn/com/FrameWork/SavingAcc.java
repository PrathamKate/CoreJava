package tn.com.FrameWork;


public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=0;
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(float accBal) {
		System.out.println("charges are: "+ accBal);
	}
	@Override
	public String toString() {
		return "PrimeAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getaccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}