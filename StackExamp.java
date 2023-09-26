package Arrays;
import java.util.*;
public class StackExamp {

	public static void main(String[] args) {
	Stack<String> s=new Stack<String>();
s.push("Welcome");
s.push("to");
s.push("my");
s.push("palace");
s.push("Habibi");
System.out.println("Initial Stack: "+s);
System.out.println("popped element: "+s.pop());
System.out.println("popped element: "+s.pop());
System.out.println("After Popped Element: "+s);
	}

}
