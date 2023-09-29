package tns;
interface Talkable{
	public String talk(String name);
}
public class lambdaExp3 {

	public static void main(String[] args) {
		Talkable t=(name)->{
			return"Hello "+name;
		};
		System.out.println(t.talk("Pratham"));

	}

}
