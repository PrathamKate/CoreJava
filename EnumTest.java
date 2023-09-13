package comm.tns.time;

enum level{
	LOW,
	MEDIUM,
	HIGH
}
public class EnumTest {
	enum level1{
		DOG,
		CAT,
		COW
	}

	public static void main(String[] args) {
//Outside the class
System.out.println("Enum declare outside the class");
level var=level.HIGH;
System.out.println("\t"+var);
level var1=level.MEDIUM;
System.out.println("\t"+var1);

//Inside the class
System.out.println("\nEnum declare inside the class");
level1 obj=level1.CAT;
System.out.println("\t"+obj);
level1 obj1=level1.DOG;
System.out.println("\t"+obj1);	
	}

}
