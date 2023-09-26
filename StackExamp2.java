package Arrays;
import java.util.*;
public class StackExamp2 {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("Apple");
		s.push("mango");
		s.push("Pineapple");
		s.push("Watermelon");
		s.push("Orange");
		System.out.println("Initial Stack: "+s);
		String fruits=s.peek();
		System.out.println("Elements on top"+fruits);
		int location=s.search("mango");
		System.out.println("Loaction of amngo:"+location);
		boolean e=s.isEmpty();
		System.out.println("Stack is empty or not: "+e);
		int size=s.size();
		System.out.println("Size of Stack is: "+size);
	}

}
