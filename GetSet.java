package Arrays;
import java.util.*;
public class GetSet {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("KTM");
		list.add("Honda");
		list.add("Bmw");
		list.add("RE");
		System.out.println("Returing element: "+list.get(2));
		list.set(2, "Duke");

		for (String bikes:list) {
			System.out.println(bikes);
		}

	}

}
