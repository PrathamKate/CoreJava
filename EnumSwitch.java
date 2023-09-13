package comm.tns.time;
enum Level{
	low,
	medium,
	high
}
public class EnumSwitch {

	public static void main(String[] args) {
		Level obj=Level.medium;
switch (obj){
case low:
	System.out.println("Low level");
	break;
case medium:
	System.out.println("medium level");
	break;
case high:
	System.out.println("high level");
	break;
}
	}

}
