package Collections.mk.diffreneces;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_TreeMap {

//   	TreeMap:
//	1	Stores key-value pairs.
//	2	Sorted by keys.
//	3	No duplicate keys allowed.
//	4	Implements the Map interface.
//		Used for efficient key-based operations in sorted order.

	public static void main(String[] args) {

		// Creating a TreeMap
		Map<Integer, String> treeMap = new TreeMap<>();
		// Adding elements
		treeMap.put(3, "Three");
		treeMap.put(1, "One");
		treeMap.put(2, "Two");
		treeMap.put(1, "Five Duplicate"); // Duplicate
		treeMap.put(23, null);
		treeMap.put(20, null);
		// treeMap.put(null, null); // Its Giving Null pointer Exception

		// Displaying elements in sorted order of keys
		for (Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + "" + entry.getValue());
		}

//		TreeSet:
//	1	Stores unique elements.
//	2	Sorted elements.
//	3	No duplicate elements allowed.
//	4	Implements the SortedSet interface.
//		Used for maintaining a sorted collection of unique elements.

		// Creating a TreeSet
		TreeSet<Integer> treeSet = new TreeSet<>();
		// Adding elements
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);
//		treeSet.add(null);  // Its Giving Null pointer Exception
		// Displaying elements in sorted order
		for (int num : treeSet) {
			System.out.println("TreeSet---->" + num);
		}
		
	}
}
