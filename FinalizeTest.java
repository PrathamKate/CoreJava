package ExceptionHandling;

public class FinalizeTest {

	public static void main(String[] args) {
		FinalizeTest f =new FinalizeTest();
		System.out.println("HashCode "+f.hashCode());
		f=null;
		System.gc();// system mein jo bhi nll object hai usko destroy karega. 
		System.out.println("End");

	}

	

}
