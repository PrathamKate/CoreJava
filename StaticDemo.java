package com.tns.Buffer;

public class StaticDemo {
	static int a=10;
	static void display() {
		System.out.println("This is static method");
	}
	static {
		System.out.println("static");
	}
	public static void main(String[] args) {
	System.out.println(a);
	display();

	}

}
