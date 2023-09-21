package tns.com.ThreadTEst;

public class ThreadPriorityEx extends Thread {
	public void run() {
		System.out.println("Inside the run method");
	}
	public static void main(String[] args) {
		Thread.currentThread().setPriority(7);
		System.out.println("Priority of the main Thread is: "+Thread.currentThread().getPriority());
		ThreadPriorityEx th= new ThreadPriorityEx();
		System.out.println("Priority of the th is: "+th.getPriority());
	}

}
