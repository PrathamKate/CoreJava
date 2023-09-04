package com.tns.polymorphism;

class Shape {
	void show() {
		System.out.println("Shape can't be define");
	}
}

class Square extends Shape {
	void show() {
		System.out.println("Square Shape");
	}
}

public class MethodOverridding {
	public static void main() {
		Square s = new Square();
		s.show();
	}

}
