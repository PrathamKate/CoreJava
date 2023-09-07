package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a[]=new int [5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmaticerror");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array error");
		}
		catch(NullPointerException e){
			System.out.println("Null error");
		}
		System.out.println("Rest");
		
		//corresponding exception will be catch by the corresponding exception cat
		//function

	}

}
