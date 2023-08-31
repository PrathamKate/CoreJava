package com.tns.Keywords;

class Par{
	final  void run() {
		System.out.println("This is pParent class");
	}
}
class Chil extends Par{
	void run(){  //Error will occur because we declare the above method as "super".
		super.run();
		System.out.println("This is Child class");
	}
}

public class FinalMeth {

	public static void main(String[] args) {
		Chil obj=new Chil();
		obj.run();

	}

}
