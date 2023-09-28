package tns;
import java.util.*;


public class ThreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("Durga");
		t.add("Manisha");
		t.add("Neha");
		t.add("Shiva Teja");
		t.add("Aunju");
	
		System.out.println("Traversing element in desending order");

		Iterator<String> i =t.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
