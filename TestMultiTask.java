package tns.com.ThreadTEst;
//to perform single task through multiple thread
public class TestMultiTask  extends Thread{
public void run() {
	System.out.println("Task one");
}
	public static void main(String[] args) {
		TestMultiTask t1=new TestMultiTask();
		TestMultiTask t2=new TestMultiTask();
		TestMultiTask t3=new TestMultiTask();
		t1.start();
		t2.start();
		t3.start();
	}

}
