package tns.com.ThreadTEst;

public class MultiNaming extends Thread {
public void run () {
	System.out.println(Thread.currentThread().getName());
}
	public static void main(String[] args) {
		MultiNaming t1 = new MultiNaming();
		MultiNaming t2 = new MultiNaming();
		t1.start();
t2.start();
	}

}
