package tns;
import java.util.*;
public class LambdaExp5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("pratham1");
		list.add("pratham2");
		list.add("pratham3");
		list.add("pratham4");
		
		list.forEach((n)->System.out.println(n));
	}

}
