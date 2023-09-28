package StreamInteger;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Second_Third_Fourth_Highest {

	public static void main(String[] args) {

       List<Integer> list = List.of(45,78,98,34,21,999);
		
       //Second
    list.stream().sorted(Collections.reverseOrder()).skip(1).limit(1)
       .forEach(z->System.out.println(z));
       
       
       
       
       
       
       
       
       
       
       
       
//       list.stream()
//       .sorted(Collections.reverseOrder())
//       .skip(1)
//       .limit(1)
//       .forEach(x->System.out.println(x));
      
    
       
       
       
//    list.stream()
//     .sorted(Collections.reverseOrder()).skip(1).limit(1)
//     .forEach(x->System.out.println(x));
//		// 3rd Highest
//  list.stream().sorted(Collections.reverseOrder())
//  .skip(2).limit(1).forEach(x->System.out.println(x));
//	
//  //4th Highest
//  list.stream().sorted(Collections.reverseOrder()).limit(1).skip(3)
//  .forEach(x->System.out.println(x));
  
  
  
  
	}

}
