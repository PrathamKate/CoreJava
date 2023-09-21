package tns.com.ThreadTEst;

public class DaemonThreadTest extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Works");
		}
		else {
			System.out.println("User Thread Work");
		}
	}
	public static void main(String[] args) {
		DaemonThreadTest th=new DaemonThreadTest();
		DaemonThreadTest th2=new DaemonThreadTest();
		DaemonThreadTest th3=new DaemonThreadTest();
		th.setDaemon(true);
		th.start();
		th2.start();
		th3.start();
	}

}
