package ExceptionHandling;

public class FinalTest {
	final int age=18;
	void display() {
		age=55;//Error will come because we have initialize final and it cannot be change
	}

	public static void main(String[] args) {
		FinalTest f = new FinalTest();
		f.display();

	}

}
