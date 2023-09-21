package tns.com.ThreadTEst;
class MyTDemo extends Thread{
	public void run() {
		System.out.println("Shutdown hook task completed...");
	}
}
public class JavaShutDownTest {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyTDemo());
		System.out.println("Now Main sleeping...press Ctrl+c to exit");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
