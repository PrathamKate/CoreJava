package tns.com.ThreadTEst;


public class ThreadTest2 extends Thread {
 public void run() {
	 System.out.println("Running");
 }
	public static void main(String[] args) {
		ThreadTest2 t1=new ThreadTest2();
t1.start();
t1.start();//error will throw because you can't call one thread twice
	}

}
