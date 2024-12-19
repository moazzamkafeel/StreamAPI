

package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nov_22_24 {

	public static void main(String[] args) {
		
		String str ="Moazzam";
		Stream<String> stream = Stream.of(str);
		
		stream
		.map(x->x.split(""))
		.flatMap(Arrays::stream);
		
	
		Map<Object, Long> countChar = 
				str.chars()
				.mapToObj(x ->(char)x)
				.collect(Collectors
				.groupingBy(x->x,Collectors.counting()));
		
		
		 countChar
		.forEach((a, b) -> {
			if (b > 1) {

				System.out.println(a + "" + b + "--->duplicateChracter");
			}
		});
		
		List<Integer> num = List.of(12,34,56,92,89,90);
		
		// max
		 Integer max = num.stream().max(Comparator.naturalOrder()).get();
	     System.out.println("max---> "+max);
	     
	   // min
	     Optional<Integer> min = num.stream().min(Comparator.naturalOrder());
	     System.out.println(min.get());
	     
	    // second Highest
	     Stream<Integer> skip = num.stream().sorted(Collections.reverseOrder())
	     .skip(1).limit(1);
	     
	     skip.forEach(x->System.out.println("second"+x));
	    
         //   odd even
	     num.stream().filter(x->x%2!=0).forEach(x->System.out.println("even "+x));
	     
         //    square
	     num.stream().map(x->x*x).forEach(x->System.out.println(x));

	     // sum
	    long sum = num.stream().mapToInt(x->x).summaryStatistics().getSum();
	     System.out.println("Sum-->"+sum);
	
        Optional<Integer> reduce = num.stream().reduce(Integer::sum);
	
        System.out.println(reduce.get());
     
  List<String> of = List.of(" Moazzam","kafeel"," Moazzam");
  
      Set<String> duplicate = of
	.stream()
	.filter(x-> Collections.frequency(of, x)>1)
	.collect(Collectors.toSet()); 
      
 //   duplicate.forEach(System.out::println);
        
  
//    Set<String> se = new Set<String>();
    
	// average
    //	double average = num.stream().mapToInt(x->x).summaryStatistics().getAverage();
	
    List<Emp1> emp=new ArrayList<>();
    
    emp.add(new Emp1("Moazzam", 17, 10000));
    emp.add(new Emp1("Kafeel", 27, 20000));
    emp.add(new Emp1("Yasir", 23, 30000));
    emp.add(new Emp1("haider", 27, 40000));

//	Q-1 Given a list of employees, you need to filter all the employee
//	whose age is greaterthan 20 and print the employee 
	
    emp.stream().filter(age->age.getAge()>20).map(x->x.getName()).forEach(System.out::println);
    
 // Q-2 Given the list of employees, count number of employees with age 25 ?
    
    long count = emp.stream().map(x->x).count();
    System.out.println(count);
    
  //Q-3 Given the list of employees, find the employee with name “Moazzam" ?
    
    Emp1 emp1 = emp.stream().filter(name -> name.getName().startsWith("Moa")).findAny().get();
    
    System.out.println(emp1);
    
 // Q-4 Given a list of employee, find maximum age of employee?
    
    Optional<Emp1> maxAge = emp.stream().max(Comparator.comparingInt(x->x.getAge()));
    System.out.println("Max Age-->"+maxAge.get());
    
    
 // Q-5 Given a list of employees,sort all the employee on the basis of age
    
             emp
    		.stream()
    		.sorted(Comparator.comparingInt(x->x.getAge()))
    		.forEach(System.out::println);
    
 // Q-6 Group by Designation ?
             
             Map<Integer, List<Emp1>> group = emp
             .stream()
             .collect(Collectors
             .groupingBy(age->age.getAge()));
            
             group
       //      .entrySet()
             .forEach((x,y)->System.out.println(x+""+y));

           //Q-8 Convert List into MAP
             
           Map<Object, Object> map = emp.stream()
             .collect(Collectors
             .toMap(x->x.getName(),x->x.getSalary()));
             
             map.entrySet().forEach(System.out::println);
             
   //Q-9  Join the all employee names with “,” using java 8?
             
              String collect = emp
             .stream()
             .map(name -> name.getName())
             .collect(Collectors.joining(","));
             
             System.out.println(collect);
             
           //Q-11 Find 3rd Highest salary emp
       
             List<Integer> collect2 = emp
             .stream()
             .map(x->x.getSalary())
             .sorted(Collections.reverseOrder())
             .skip(1)
             .limit(1)
             .collect(Collectors.toList());
            // .forEach(x->System.out.println(x));
            
             collect2
             .forEach(x->System.out.println("Third Highest"+x));
           

 //Increase salary 10% of java Developer          
             
     emp.stream()
     .map(salary -> {
    	Integer cs = salary.getSalary();
    	int is = (int) (cs*1.10);
    	salary.setSalary(is);
    	return salary;
     }
     ).forEach(System.out::println);
             
             
             
	}
}
