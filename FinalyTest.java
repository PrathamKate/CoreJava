package ExceptionHandling;

public class FinalyTest {

	public static void main(String[] args) {
		try {
			System.out.println("Inside Try Block");
			int data=25/0;
			System.out.println(data);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {//Finally block always executed.
			System.out.println("Inside Finally Block");
		}
System.out.println("Rest of the Code...");
	}

}
