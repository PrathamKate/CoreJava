package com.tns;

class SuperVar{
	int a =10;
}


class Derived extends SuperVar{
	int a=20;
	void show() {
		System.out.println("This is super class Value: "+super.a);
		System.out.println("This is sub class Value: "+a);
	}
}



public class SuperKey {

	public static void main(String[] args) {
		Derived obj=new Derived();
		obj.show();

	}

}
