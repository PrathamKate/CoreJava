package tns;

public class GenericTest5 {
public static <E> void printArray(E[] elements) {
	for (E element:elements) {
		System.out.println(element);
	}
	System.out.println();
}
	public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40,50};
		Character[]charArray= {'F','O','P','U'};
		
		System.out.println("Printing Integer");
		
		printArray(intArray);
		
		System.out.println("Printing Character");
		printArray(charArray);
	}

}
