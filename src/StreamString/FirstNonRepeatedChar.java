package StreamString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		

//  //    Q7 Given a String, find the first repeated character 
//    in it using Stream functions?
//      
      String str = "Java Hungry Blog Alive is Awesome";

     Character result = str.chars() // Stream of String       
              .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // Convert to lowercase Character
              .collect(Collectors.groupingBy(
                  Function.identity(),  // Identity function (character itself)
                  LinkedHashMap::new,   // Use LinkedHashMap to maintain order
                  Collectors.counting() // Count occurrences of each character
              ))
              .entrySet()
              .stream()
              .filter(entry -> entry.getValue() > 1L)// Filter repeated characters
              .map(Map.Entry::getKey)                 // Get the repeated character
              .findFirst()                            // Find the first one
              .get();                                 // Get the result
          System.out.println(result);
          
}
}