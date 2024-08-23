package StreamInteger;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Sort_Value {
public static void main(String[] args) {
	
	Map<String, Integer> hm = Map.of("A",07,"Z",05,"F",02);
	System.out.println(hm+"Unsorted");
	
	var sortedMap = hm.entrySet().stream()
			.sorted(Map.Entry.comparingByValue())
	.collect(Collectors.toMap(entry->entry.getKey(),
			entry->entry.getValue(),(e1,e2)->e1,LinkedHashMap::new));
	
	System.out.println(sortedMap+"--->sortedMap");
	
	// List
	 List<Entry<String, Integer>> sortedMap1 = hm.entrySet().stream()
			.sorted(Map.Entry.comparingByValue())
	.collect(Collectors.toList());
	System.out.println(sortedMap1+"--->sortedMap");
	
}
}
