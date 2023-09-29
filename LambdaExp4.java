package tns;
@FunctionalInterface
interface Addable{
	int add(int a,int b);
}
public class LambdaExp4 {

	public static void main(String[] args) {
		Addable ad= (a,b)->(a+b);
			System.out.println(ad.add(10, 20));
		
			Addable ad1= (a,b)->(a+b);
			System.out.println(ad.add(1000, 20));
		
	}

}
