package tns;
import java.util.*;
public class LambdaTest {

	public static void main(String[] args) {
		int width = 10;
		
		//Without Lambda Expression.
	Drawable d = new Drawable() {
		public void draw() {
			System.out.println("Drawing width is: "+width+"cm");
		}
	};
		d.draw();
		
		//With Lambda Expression.
		Drawable d1=()->{System.out.println("Drawing width is: "+width+"cm");};
		d1.draw();
	}

}
