package tns;
import java.util.*;
public class GenericTest4 {

	public static void main(String[] args)
	{
	 MyGen<Integer>	m=new MyGen<Integer>();
	 
	 m.add(2);
	 m.add(100);
   //m.add("Pro");//compile-time error
	 
	 System.out.println(m.get());
	}

}
