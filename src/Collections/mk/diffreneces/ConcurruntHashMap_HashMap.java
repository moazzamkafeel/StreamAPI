package Collections.mk.diffreneces;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurruntHashMap_HashMap {
	public static void main(String[] args) {

//      HashMap:
//	1	Not thread-safe
//	2	Iterators are fail-fast.
//	3	Null values Allow

		Map<Integer, String> hm = new HashMap<>();
		hm.put(9, "Moazzam");
		hm.put(4, "Kafeel");
		hm.put(6, "Yasir");
		hm.put(8, "mehtab");
		
		hm.forEach((x,y)->{
	//  hm.remove(4);  //FAIL FAST Exception in thread "main" java.util.ConcurrentModificationException
	//		hm.put(10,"Nala");
			System.out.println(x+"---Hashmap---"+y);
		});
		//System.out.println(hm);
			
		
		// ConcurrentHashMap:
//	1	Thread-safe
//	2	Slightly lower performance
//	3   Fail safe iterartion
//	4	No Null Value ALLOW
//	5	Designed for multi-threaded environments to handle concurrent access safely.	

	Map<Integer, String> chm = new ConcurrentHashMap<>();
		chm.put(9, "Moazzam");
		chm.put(4, "Kafeel");
		chm.put(6, "Yasir");
		
	//	chm.put(8, null); // No Null Allow ,throws NullPointerException.
		
	chm.forEach((x,y)->{
		chm.remove(6);  //Fail safe iteration
		chm.put(10,"Nala");
		System.out.println(x+"---Concurrent---"+y);
	});
	
	System.out.println(chm);
		}

	}