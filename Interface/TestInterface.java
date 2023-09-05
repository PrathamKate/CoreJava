package com.tns.Wrapper;


class SBI implements Bank{
	public float rateOfIntereset(){
		return 9.08f;
	}
}
class BOI implements Bank{
	public float rateOfIntereset(){
		return 9.8f;
	}
}
public class TestInterface {

	public static void main(String[] args) {
		SBI s = new SBI();
		BOI b = new BOI();
		System.out.println("The rate of interest on SBI is "+s.rateOfIntereset());
		System.out.println("The rate of interest on BOI is "+b.rateOfIntereset());
	}

}
