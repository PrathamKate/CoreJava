package Arrays;
import java.util.*;

public class LinkedListExamp2 {

    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        System.out.println("Initial list");
        al.add("Tom");
        al.add("jerry");
        al.add("Tom");
        al.add("jerry");

        System.out.println("After invoking: " + al);

        LinkedList<String> al2 = new LinkedList<String>();
        al2.add("DIvya");
        al2.add("Durga");

       
        al.addAll(al2);

        System.out.println("After invoking: " + al);

        LinkedList<String> al3 = new LinkedList<String>();
        al3.add("sai");
        al3.add("hemant");

        al.add(1, "Bhavani");

        System.out.println("After invoking: " + al);
        al.addFirst("Bhavani");

        System.out.println("After invoking: " + al);
    }
}