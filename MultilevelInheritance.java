package com.tns;

class Operator{
	int a,b,c;
	void add() {
		a=60;
		b=50;
		c=a+b;
		System.out.println("The Addition of numbers is: "+c);
	}
	void sub() {
		a=60;
		b=50;
		c=a-b;
		System.out.println("The Subtraction of numbers is: "+c);
}
}
class Operator2 extends Operator{
	
	void mul() {
		a=60;
		b=10;
		c=a*b;
		System.out.println("The Multiplication of numbers is: "+c);
	}
	void div() {
		a=60;
		b=50;
		c=a/b;
		System.out.println("The Division of numbers is: "+c);
}
}
class Operator3 extends Operator2{
	void rem() {
		a=60;
		b=3;
		c=a%b;
		System.out.println("The Remainder of numbers is: "+c);
}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Operator3 obj =new Operator3();
obj.add();
obj.sub();
obj.mul();
obj.div();
obj.rem();
	}

}
