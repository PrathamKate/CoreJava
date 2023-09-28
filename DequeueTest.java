package tns;
import java.util.*;
public class DequeueTest {

	public static void main(String[] args) {
		Deque<String> deque=new  ArrayDeque<String> ();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");
		for(String str:deque) 
		{
			System.out.println(str);
			}
	}

}
