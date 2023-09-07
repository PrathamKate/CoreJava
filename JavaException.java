package ExceptionHandling;

public class JavaException {

	public static void main(String[] args) {
		try{
			int a=100/0 ;//code contain exception.
		}
		catch(Exception e) {
			System.out.println(e);
		}
System.out.println("Rest of Code...");
	}

}
