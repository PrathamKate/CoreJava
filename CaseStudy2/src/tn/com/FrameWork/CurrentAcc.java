package tn.com.FrameWork;



public abstract class CurrentAcc extends BankAcc {
	

	protected final float creditLimit;
	

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public float getCreditLimit() {
		return creditLimit;
	}

	public void withdraw(float creditLimit) {
		System.out.println("Credit Limit are: "+ creditLimit);
	}

	@Override
	public String toString() {
		return "NormalAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	

}
