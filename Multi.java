package tns.com.ThreadTEst;

public class Multi implements Runnable {//Through implement interface
	public void run() {
		System.out.println("Running the thread");
	}
	public static void main(String args[]) {
		Multi t=new Multi();
		Thread t1 = new Thread(t);
		t1.start();
	}
}
