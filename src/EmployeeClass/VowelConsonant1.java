package EmployeeClass;

import java.util.ArrayList;

public class VowelConsonant1 {
 private static int vowel;
 private static int consonant;
 static ArrayList<Character> cr= new ArrayList<>();
 static ArrayList<Character> cr1= new ArrayList<>();
 
       	public static void main(String[] args) {
		String s = "bcDAefghI34jklMnopqrstUvWXyz";
		String s1 = s.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{ cr.add(c);
				vowel++;
				
			} else
			{ cr1.add(c);
				consonant++;
			}
			}
		
		System.out.println(vowel);
      System.out.println(consonant);
      System.out.println(cr);
      System.out.println(cr1);
		
		
		
		
		
		
		
		
		
//		
//		for(int a=0;a<s1.length();a++) 
//		{
//		char ch = s1.charAt(a);
//		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//			vowel++;
//			cr.add(ch);
//			
//		}
//		else {
//			consonant++;
//			cr1.add(ch);
//			
//		}
//		}
//		
//		    System.out.println(vowel);
//            System.out.println(consonant);
//            System.out.println(cr);
//            System.out.println(cr1);
//            
//	}

}}
