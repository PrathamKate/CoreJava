package com.tns;

class SupMeth{
	void display() {
		System.out.println("This is Super class Method...");
	}
}
class DerMeth extends SupMeth{
	void display() {
		super.display();
		System.out.println("This is Sub class Method...");
	}
}


public class SuperMethod {

	public static void main(String[] args) {
		DerMeth  obj=new DerMeth ();
		obj.display();

	}

}
