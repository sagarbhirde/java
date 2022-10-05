package collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> books = new HashMap<Integer, String>();

		books.put(1, "Programming in C");
		books.put(2, "Data Structure Using C");
		books.put(3, "Java");
		books.put(4, "Spring Boot");
		books.put(5, "Hibernate");

		// iterating by entryset
		for (Entry<Integer, String> entry : books.entrySet()) {
			System.out.println(" Key:- " + entry.getKey() + " Value:- " + entry.getValue());
		}

		// iterate by keyset
		for (Integer integer : books.keySet()) {
			System.out.println(" Key :-" + integer);
			System.out.println(" Value :-" + books.get(integer));
		}

		// fetching value by specific key
		System.out.println(" Specific Value by key :-" + books.get(3));

		System.out.println(" Only Values :-" + books.values());

	}

}
