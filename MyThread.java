package tns.com.ThreadTEst;

public class MyThread {

	public static void main(String[] args) {
	
		Thread t =new Thread("My first Constructor Thread");
		t.start();
		
		String str=t.getName();
		System.out.println(str);
		
	}

}
