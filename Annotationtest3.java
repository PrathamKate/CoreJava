package tns.annotation;
class A{
	void m(){
		System.out.println("This is M() method");
	}
	void n() {
		System.out.println("This is N() method");
	}
}
public class Annotationtest3 {

	public static void main(String[] args) {
		A obj=new A();
		obj.m();
		obj.n();

	}

}
