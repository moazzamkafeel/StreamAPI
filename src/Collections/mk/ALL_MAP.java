package Collections.mk;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ALL_MAP {
	// Define an enum class for days of the week
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
	
//		LinkedHashMap: Maintains insertion order, based on HashMap.
		Map<Integer, String> lhs = new LinkedHashMap<>();
		lhs.put(5, "Moazzam");
		lhs.put(2, "Kafeel");
		lhs.put(3, "mehta");
		lhs.put(4, "Rahul");
		lhs.put(1, "moazzam");
		System.out.println("LinkedHashMap------>" + lhs);
		lhs.forEach((x, y) -> System.out.println(x + y));

//	HashMap: Basic hash table implementation, allows null keys/values, 
//		not synchronized.
		
		Map<Integer, String> hs = new HashMap<>();
		hs.put(5, "Moazzam");
		hs.put(2, "Kafeel");
		hs.put(3, "Asim");
		hs.put(4, "Rahul");
		hs.put(1, "moazzam");
		System.out.println("HashMap------>" + hs);

		hs.forEach((x, y) -> System.out.println(x + y));

//		ConcurrentHashMap: Highly concurrent hash table, 
//		thread-safe without external synchronization.
		
		Map<Integer, String> chs = new ConcurrentHashMap<>();
		chs.put(5, "Moazzam");
		chs.put(2, "Kafeel");
		chs.put(3, "Asim");
		chs.put(4, "Rahul");
		chs.put(1, "moazzam");
		System.out.println("ConcurrentHashMap---->" + chs);

//	Hashtable: Synchronized version of HashMap, no null keys/values.
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(5, "Moazzam");
		ht.put(2, "Kafeel");
		ht.put(3, "Asim");
		ht.put(4, "Rahul");
		ht.put(1, "moazzam");
	//	ht.put(7, null);
		System.out.println("Hashtable--->" + ht);

//	TreeMap: Sorted map using a Red-Black tree for keys, maintains order.		
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(5, "Moazzam");
		tm.put(2, "Kafeel");
		tm.put(3, "Asim");
		tm.put(4, "Rahul");
		tm.put(1, "moazzam");
		System.out.println("treeMap---->" + tm);

//	Properties is not generic; it cannot be parameterized with arguments 
// Properties: Extends Hashtable, specifically for handling configuration properties.
		Properties pro = new Properties();
		pro.put(5, "Moazzam");
		pro.put(2, "Kafeel");
		pro.put(3, "Asim");
		pro.put(4, "Rahul");
		pro.put(1, "moazzam");
		System.out.println("Properties---->" + pro);

//		EnumMap: Optimized for enums as keys, type-safe and efficient.
		// Create an EnumMap with Day enum as keys and String as values
		
		EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
		// Add values to the EnumMap
		schedule.put(Day.MONDAY, "Work");
		schedule.put(Day.TUESDAY, "Gym");
		schedule.put(Day.WEDNESDAY, "Meetings");
		schedule.put(Day.THURSDAY, "Study");
		schedule.put(Day.FRIDAY, "Movie night");
		schedule.put(Day.SATURDAY, "Outdoor activities");
		schedule.put(Day.SUNDAY, "Relax");
        System.out.println(schedule);

//	
//		WeakHashMap: Allows keys to be garbage-collected, useful for memory-sensitive cases.
	}
//	String key1 = new String("key");
//	String key2 = new String("key");

//	HashMap<String, Integer> hs1 = new HashMap<String, Integer>();
//	// Create an IdentityHashMap
//	IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
//
//	// Create two different but equal strings
//
//	// Add key-value pairs
//	identityHashMap.put(key1, 1);
//	identityHashMap.put(key2, 2);
//	hs1.put(key1, 1);
//	hs1.put(key2, 2);
//	System.out.println("size of hashmap---->" + hs1.size());
//	// Print the size of the IdentityHashMap
//	System.out.println("Size of IdentityHashMap: " + identityHashMap.size());
//
//	// Access values using keys
//	System.out.println("Value for key1: " + identityHashMap.get(key1));
//	System.out.println("Value for key2: " + identityHashMap.get(key2));

}
