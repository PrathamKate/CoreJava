package tns.home;

public class StringTest {

	public static void main(String[] args) {
		String a="Java";
		System.out.println(a);
		
		String b="Java";
		System.out.println(b);
		
		a=a.concat(" Course");
		System.out.println(a);
		
		String c=new String("Java");
		System.out.println(c);
		String d=new String("Java");
		System.out.println(d);
		
		c=c.concat(" Course");
		System.out.println(c);
	}

}
