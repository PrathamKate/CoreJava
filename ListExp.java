package Arrays;
import java.util.*;
public class ListExp {

	public static void main(String[] args) {
		List <String> list =new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Kiwi");
		list.add("Banana");
		list.add("Pineapple");
		for (String fruit:list) {
			System.out.println(fruit);
		}
	}

}
