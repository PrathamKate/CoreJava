package com.tns.Wrapper;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw(){
	System.out.println("Rectangle");
	}
}
class Circle extends Shape{
	void draw(){
	System.out.println("Circle");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		System.out.println("Bhopl");
		Rectangle obj= new Rectangle();
		Circle obj1= new Circle();
		obj.draw();
		obj1.draw();
	}

}
