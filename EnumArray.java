package comm.tns.time;

enum Level1{
	low,
	medium,
	high
}
public class EnumArray {
	
	public static void main(String[] args) {
	for (Level1 var:Level1.values()) {
		System.out.println(var);
	}

	}

}
