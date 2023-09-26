package Arrays;
import java.util.*;
public class VecExamp2 {

public static void main(String[] args) {
Vector<String> vec=new Vector<String>();
vec.add("Tiger");
vec.add("Lion");
vec.add("Elephant");
vec.add("Leopard");
System.out.println("Sixe is: "+vec.size());
System.out.println("Default Capacity is: "+vec.capacity());
System.out.println("Vector elemnets are: "+vec);
vec.addElement("Rat");
vec.addElement("Cat");
vec.addElement("Dog");
System.out.println("Vector elemnets are: "+vec);
if(vec.contains("Tiger")) {
	System.out.println("Tiger is present at index: "+vec.indexOf("Tiger"));
}
else {
	System.out.println("Tiger is not present");
}
System.out.println("The first element is: "+vec.firstElement());
System.out.println("The last element is: "+vec.lastElement());
		
	}

}
