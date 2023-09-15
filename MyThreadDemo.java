package tns.com.ThreadTEst;

public class MyThreadDemo implements Runnable {
	public void run() {
		System.out.println("Now the Thread is Running ");
	}
	

	public static void main(String[] args) {
		Runnable r = new MyThreadDemo(); 
		Thread th =new Thread(r,"My new Thread");
		th.start();
		String str = th.getName();
		System.out.println(str);
//		System.out.println(r);
		
	}

}
