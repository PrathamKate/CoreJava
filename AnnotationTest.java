package tns.annotation;
class Animal{
	void eatSomething() {
		System.out.println("Animal is Eating");
		
	}
}
class Dog extends Animal{
	@Override
	void eatsomething() {          //error will occur because of spelling mistake.
		System.out.println("Dog is Eating");
		
	}
}
public class AnnotationTest {

	
	
	public static void main(String[] args) {
		Animal d=new Dog();
		d.eatSomething();

	}

}
