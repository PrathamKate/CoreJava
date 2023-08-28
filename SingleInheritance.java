package com.tns;
class student{
	int rollno,marks;
	String name;
	
	void input() {
		System.out.println("Enter Roll no Marks and Name");
	}
}
class Tom extends student{
	void display() {
		rollno=12;
		marks=90;
		name="Tom";
//				System.out.println("The Roll no is:"+rollno+" ,of boy name:"+name+" ,got marks:"+marks);
				System.out.println("The Boy name "+name+" of rollno:"+rollno+" got marks:"+marks);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Tom obj = new Tom();
		obj.input();
		obj.display();
	}
}