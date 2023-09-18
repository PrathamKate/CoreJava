package tns.com.ThreadTEst;

public class ThreadSleepTest extends Thread{
public void run () {
	for(int i=1;i<5;i++) {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		ThreadSleepTest tt=new ThreadSleepTest();
		ThreadSleepTest tt2=new ThreadSleepTest();
		tt.start();
		tt2.start();

	}

}
