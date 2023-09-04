package com.tns.constructor;

public class ConstOverloading {

	int id;
	String name;
	int age;
	ConstOverloading(int i,String n)//two arg construtor
	{
		id=i;
		name=n;
	}
	
	ConstOverloading(int i , int a ,String n)
	{
		id =i;
		age=a;
		name=n;
	}
	
	
	void display() 
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	
	public static void main(String[] args) {
		ConstOverloading obj1= new ConstOverloading(1,"Pratham");
		ConstOverloading obj2= new ConstOverloading(1,21,"Pratham");
		
		obj1.display();
		obj2.display();
	}

	}


