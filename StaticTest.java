package com.tns.Buffer;

class StatDemo{
	static int a = 10;
	static void display() {
		System.out.println("This is static method");
	}
	static {
		System.out.println("STSIC CONST");
	}
}
public class StaticTest {

	public static void main(String[] args) {
System.out.println(StatDemo.a);
StatDemo.display();
	}

}
