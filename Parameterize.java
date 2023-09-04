package com.tns.constructor;

public class Parameterize {
	int id;
	String name;
	Parameterize(int i,String n){
		id=i;
		name=n;
	}
	void display() 
	{
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args) {
		Parameterize obj= new Parameterize(1,"Pratham");
		obj.display();

	}

}
