package com.tns.constructor;
class Dog{
	void eat() {
		System.out.println("Eating");
	}
}

class BabyDog extends Dog{
	void bark() {
		System.out.println("Barking");
	}
}
class Animal extends BabyDog {

	

	private static Animal obj;

	public static void main(String[] args) {
	Animal.obj=new Animal();
	System.out.println(obj instanceof BabyDog);

	}

}
