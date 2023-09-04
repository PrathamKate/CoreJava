package com.tns.polymorphism;

public class MethodOverloading {
	
	void add() {
		int a=20,b=10,c=(a+b);
		System.out.println(c);
	}
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	void add(int a,double b) {
		double c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add(300,500);
		obj.add(200,657674.997);

	}

}
