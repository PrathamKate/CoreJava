package project1;

public class Logical {

	public static void main(String[] args) {
		boolean bool1=true,bool2=false;
		
		//LOGICAL AND
		System.out.println("true & false: "+(bool1 && bool2));
		
		//LOGICAL OR
		System.out.println("true OR false: "+(bool1 || bool2));
				
		//LOGICAL NOT
		System.out.println("!(true & false): "+!(bool1 && bool2));
	}

}
