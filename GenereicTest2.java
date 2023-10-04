package tns;
import java.util.*;
public class GenereicTest2 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Vijay");
		map.put(2, "Ajay");
		map.put(3, "Sanjay");
		map.put(4, "Digvijay");

		//Now use Map.entry for set and Integer
		Set<Map.Entry<Integer,String>> set=map.entrySet();
	Iterator<Map.Entry<Integer,String>> itr = set.iterator();
	while(itr.hasNext()) {
		Map.Entry e = itr.next();
		
	}
	}

}
