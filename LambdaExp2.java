package tns;
interface Sayable{
	public String Say();
}
public class LambdaExp2 {

	public static void main(String[] args) {
		Sayable s=()->{
			return "I have nothing to say";
		};
		System.out.println(s.Say());
	}

}
