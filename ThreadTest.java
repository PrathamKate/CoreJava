package tns.com.ThreadTEst;

public class ThreadTest extends Thread {//Through Extensds class
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String args[]) {
		ThreadTest t1=new  ThreadTest();
		t1.start();
	}
}
