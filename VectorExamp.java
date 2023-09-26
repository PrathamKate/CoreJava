package Arrays;
import java.util.*;
public class VectorExamp {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Elephant");
		vec.add("Leopard");
		//By using addElemnt() method.
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Dog");
		System.out.println(vec);
	}

}
