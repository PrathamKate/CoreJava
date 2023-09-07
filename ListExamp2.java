package Arrays;
import java.util.*;
public class ListExamp2 {

	public static void main(String[] args) {
		List <String> list =new ArrayList<String>();
		list.add("TAlly");
		list.add("MS Office");
		list.add("UI/UX");
		list.add("Web Designiing");
		list.add("Pineapple");
		System.out.println("Returing element: "+list.get(1));
		list.set(1,"SAP");
		for (String course:list) {
			System.out.println(course);
		}
	}

}
