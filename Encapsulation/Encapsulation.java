package com.tns.Encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		Account obj = new Account();
		
		obj.setAcc_no(2345678);
		obj.setAmount(689000.90f);
		obj.setEmail("Exampe@gmail.com");
		obj.setName("Peter");
		
		System.out.println(obj.getAcc_no()+" "+obj.getAmount()+" "+obj.getEmail()+" "+obj.getName());
	}

}
