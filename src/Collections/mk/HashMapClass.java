package Collections.mk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(5, "Moazzam");
		hs.put(2, "Kafeel");
		hs.put(3, "Asim");
		hs.put(4, "Rahul");
		hs.put(1, "moazzam");

		for (Integer s : hs.keySet()) {
			System.out.println(s + " ForEachLoop  " + hs.get(s));
		}

	}
}
