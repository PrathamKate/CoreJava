package tns.com.ThreadTEst;

public class ThreadNameTest extends Thread{
public void run() {
	System.out.println("Running");
}
	public static void main(String[] args) {
		ThreadNameTest tt=new ThreadNameTest();
		ThreadNameTest tt2 = new ThreadNameTest();
				System.out.println("Before Changing the thread 1 name: "+tt.getName());
				System.out.println("Before Changing the thread 2 name: "+tt2.getName());

				tt.start();
				tt2.start();
				
				tt.setName("Peter");
				System.out.println("\nAfter Changing the thread 1 name: "+tt.getName());
				tt2.setName("Parker");
				System.out.println("After Changing the thread 2 name: "+tt2.getName());
				
	}

}
