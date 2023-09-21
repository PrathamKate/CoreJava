package tns.com.ThreadTEst;

public class ThreadPriorityTest extends Thread {
	public void run() {
		System.out.println("Inside then run method");
	}
	
	
	public static void main(String[] args) {
		ThreadPriorityTest th1 = new ThreadPriorityTest();
		ThreadPriorityTest th2 =new ThreadPriorityTest();
		ThreadPriorityTest th3 =new ThreadPriorityTest();
		
		System.out.println("Priority before setting custom priority");
		System.out.println("Priority of the thread th1 is: "+th1.getPriority());
		System.out.println("Priority of the thread th2 is: "+th2.getPriority());
		System.out.println("Priority of the thread th3 is: "+th3.getPriority());
			
		th1.setPriority(6);
		th2.setPriority(3);
		th3.setPriority(9);
		
		System.out.println("Priority after setting custom priority");
		System.out.println("Priority of the thread th1 is: "+th1.getPriority());
		System.out.println("Priority of the thread th2 is: "+th2.getPriority());
		System.out.println("Priority of the thread th3 is: "+th3.getPriority());
	System.out.println("Current thread Name: "+Thread.currentThread().getName());
	System.out.println("Priority of current Thread: "+Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(10);
	
	System.out.println("Priority of the main Thread: "+Thread.currentThread().getPriority());
	
	}

}
