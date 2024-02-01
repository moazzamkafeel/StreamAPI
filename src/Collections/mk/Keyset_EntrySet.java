package Collections.mk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Keyset_EntrySet {

//	keySet(): It returns a set of keys stored in the HashMap. 
//	This method is useful when you need to access or manipulate keys without requiring the corresponding values.
	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(03, "Moazzam");
		hashMap.put(02, "Kafeel");
		hashMap.put(01, "Rahul");
		hashMap.put(04, "Asim");
		hashMap.put(05, "Ankush");

		System.out.println(hashMap);

		Set<Integer> key2 = hashMap.keySet();
		for(Integer key:key2) {
	String value = hashMap.get(key);
	System.out.println(value);
		}
		
Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
for(Entry<Integer, String> entry:entrySet)
{
	System.out.println(entry.getValue()+""+entry.getKey());
}
// By KeySET Foreach

		Set<Integer> keyset = hashMap.keySet();
		for (Integer key : keyset) {
			String value = hashMap.get(key);
			System.out.println(key + "--KeySet--" + value);
		}

		// Using Iterator
//		Iterator<Integer> it = hashMap.keySet().iterator();
//		while (it.hasNext()) {
//			Integer h = it.next();
//			System.out.println(h + "---key Set-->" + hashMap.get(h));
//		}

// Entry SET

//	entrySet(): It returns a set of Map.Entry objects, each representing a key-value pair in the HashMap. 
//	This method provides a way to access and work with both keys and values together.
		Set<Entry<Integer, String>> entrySet2 = hashMap.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			System.out.println(entry.getKey() + "EntrySet-->" + entry.getValue());
		}
		hashMap.forEach((key,value)->System.out.println(key+value));

//		Iterator<Entry<Integer, String>> o = hashMap.entrySet().iterator();
//
//		while (o.hasNext()) {
//			Entry<Integer, String> h = o.next();
//			System.out.println(h.getKey() +"--Entry SET--"+ h.getValue());
//
//		}

	}
}