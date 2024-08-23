package HardQuestions;

import java.util.ArrayList;
import java.util.List;

public class Interview {
//Q List of Strings and convert into three list A,B,C
	public static void main(String[] args) {
		  List<String> list = List.of("MGaurav26", "MAzam28", "FPooja23");

	        List<Emp> A = new ArrayList<>();
	        List<Emp> B = new ArrayList<>();
	        List<Emp> C = new ArrayList<>();

	//  String.valueOf() is a static method in Java that converts different types of data (characters, numbers, arrays, objects, etc.) into their corresponding string representations.
	        for (String str : list) {
	            String gender = String.valueOf(str.charAt(0));
	            String name = str.substring(1, str.length() - 2);
	            int age = Integer.parseInt(str.substring(str.length() - 2));

	            Emp emp = new Emp(gender, name, age);

	            if (name.equals("Gaurav")) {
	                A.add(emp);
	            } else if (name.equals("Azam")) {
	                C.add(emp);
	            } else {
	                B.add(emp);
	            }
	        }

	        System.out.println("List A: " + A);
	        System.out.println("List B: " + B);
	        System.out.println("List C: " + C);
	     
	    }
	}
