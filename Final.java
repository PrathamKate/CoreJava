package com.tns.Keywords;

class Bike{
	final int Speed=90;
	void run() {
		Speed=100;//Error will occur as we have firstly declare final so we can't change the value of "Speed" again. 
	}
}

public class Final {

	public static void main(String[] args) {
	Bike obj= new Bike();
	System.out.println("Ths value is: "+obj.Speed);
	}

}
