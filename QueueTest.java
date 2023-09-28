package tns;
import java.util.*;
public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Durga");
		queue.add("Divya");
		queue.add("Deepa");
		queue.add("Darshana");
		queue.add("Dhammu");
		System.out.println("Head: "+queue.element());
		System.out.println("Head: "+queue.peek());
		
		System.out.println("Iterating the queue element");
		Iterator<String> i = queue.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing elements");
		Iterator<String>its=queue.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}

}
