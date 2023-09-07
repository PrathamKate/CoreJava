package Arrays;
import java.util.*;
public class Hash1 {

	public static void main(String[] args) {
		HashSet<String>set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		Iterator i =set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
