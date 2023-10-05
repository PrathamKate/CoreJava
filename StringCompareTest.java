package tns.home;

public class StringCompareTest {

	public static void main(String[] args) {
		String s1="Divya";
		String s2="Divya";
		String s3=new String("Divya");
		String s4="Bhavani";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println("------------------");
		
		String s5="Tom";
		String s6="TOM";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		System.out.println("------------------");
		
		String s7="Sachin";
		String s8="Sachin";
		String s9=new String("Sachin");
		
		System.out.println(s7==s8);
		System.out.println(s7==s9);//false because one in constant and one in object
		
		System.out.println("------------------");
		
		String a1="hello";
		String a2="hello";
		String a3="meklo";
		String a4="hemlo";
		String a5="flag";
		
		System.out.println(a1.compareTo(a2));//0 because both are equal
		System.out.println(a1.compareTo(a3));//5 because "h" is 5 times lower than "m"
		System.out.println(a1.compareTo(a4));//1 because "l" is 1 times lower than "m"
		System.out.println(a1.compareTo(a5));//2 because "f" is 2 times greater than "h"
		
		System.out.println("------------------");
		
		String s="InformationTechnology";
		
		System.out.println("Original String: "+s);
		System.out.println("Substring started from index no.6: "+s.substring(6));
		System.out.println("Substring started from index no.0 to 6: "+s.substring(0,6));
		
		System.out.println("------------------");
		
		String l="PRATham";
		String l1=l.toLowerCase();
		String l2=l.toUpperCase();
		
		System.out.println("To Lower case: "+l1);
		System.out.println("To Upper case: "+l2);
		
		System.out.println("------------------");
		
		String j=String.join("-","Welcome","To","My","World" );
		
		System.out.println(j);
		
		System.out.println("------------------");
		
		String st="java string split method";
		
		System.out.println(st.startsWith("ja"));
		System.out.println(st.startsWith("Ja"));//false,case sensitive
		
		System.out.println("------------------");
		
		String r="java string split method";
		String rep=r.replace('a', 'e');
		
		System.out.println(rep);
		
		System.out.println("------------------");
		
		String p="Pratham";
		
		System.out.println(p.length());
		
		System.out.println("------------------");
		
		String i="This is index of Example";
		int index=i.lastIndexOf('e');
		System.out.println(index);
		System.out.println("------------------");
		
		String e="";
		String e1="Emptyy";
		
		System.out.println(e.isEmpty());
		System.out.println(e1.isEmpty());
		System.out.println("------------------");
		String i1=new String("Hello");
		String i2="Hello";
		String i3=i2.intern();
		System.out.println(i1==i2);//true because both are in different memory
		System.out.println(i1==i3);//false because of intern()
			
		System.out.println("------------------");
		
		String ee1="java string split method";
		
		System.out.println(ee1.endsWith("d"));
		System.out.println(ee1.startsWith("a"));
		
		System.out.println("------------------");
		
		String name="What is your name";
		
		System.out.println(name.contains("is your"));
		System.out.println(name.contains("hello"));
		
		System.out.println("------------------");
		
		String name1="Pratham";
		char ch=name1.charAt(4);
		System.out.println(ch);
	}

}
