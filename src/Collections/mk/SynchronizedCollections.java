package Collections.mk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SynchronizedCollections {

	public static void main(String[] args) {

		List<String> m = Collections.synchronizedList(new ArrayList<String>());
		m.add("Moazzam");
		m.add("Kafeel");
		m.add("Haider");
		m.add("Rahul");

		synchronized (m) {
			for (String k : m) {
				System.out.println(k);
			}

			Iterator<String> mk = m.iterator();
			while (mk.hasNext()) {
				System.out.println(mk.next());
			}
		}

		Map<String, String> hs = new HashMap<>();
		Map<String, String> sy = Collections.synchronizedMap(hs);
		hs.put("A", "Jatin");
		hs.put("B", "Moazzam");
		hs.put("C", "Kafeel");
		hs.put("D", "Yasir");
		hs.put("B", "Jatin");
		synchronized (sy) {

			System.out.println("Value of B" + sy.get("B"));

			Iterator<Entry<String, String>> it = sy.entrySet().iterator();

			while (it.hasNext()) {
				// System.out.println(it.next());
				Entry<String, String> nt = it.next();
				System.out.println(nt.getValue() + "   ---->   " + nt.getKey());
			}
		}
	}
}