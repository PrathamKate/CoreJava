package ExceptionHandling;
//Runtime Exception (unchecked)
public class TestThrow {
	
	public static void validate(int age) {
		if (age<18) {
			throw new ArithmeticException("Person is not eligible");
		}else {
			System.out.println("Person in eligible");
		}
	}

	public static void main(String[] args) {

		validate(13);
		System.out.println("Rest of code");

	}

}
//Code will not run because we can't run without Try and Catch block