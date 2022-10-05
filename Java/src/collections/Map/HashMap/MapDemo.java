package collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
public static void main(String[] args) {
	
	Map<Integer,String> map1=new HashMap<>();
	map1.put(1, "Sagar");
	map1.put(2,"Java test");
	map1.put(3, "Pune");
	
		System.out.println("Hashmap Values:-"+map1.values());
		
		for (Entry<Integer, String> entry : map1.entrySet()) {
			System.out.println(entry);
		}
}
	
	
	
	
}
