package tns.annotation;
import java.util.*;
public class AnnotationTest2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })//    <------ Due to these warning are not coming

	public static void main(String[] args) { 
		ArrayList list=new ArrayList();      
		list.add("Pratham1");   
		list.add("Pratham2");
		list.add("Pratham3");
		list.add("Pratham4");
		list.add("Pratham5");
		
		for (Object obj:list) {
			System.out.println(obj);
		}

	}

}
