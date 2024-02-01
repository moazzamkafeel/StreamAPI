package DSA.StringQuestions;

import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountString {
	
	//Q5 How to Count number of words in the String? [
	 static int i,c=0,res;
	 static int wordcount(String s)
	 {
	 char ch[]= new char[s.length()]; //in string especially we have to mention the () after length
	 for(i=0;i<s.length();i++) 
	 {
	 ch[i]= s.charAt(i);
	 if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
	 c++;
	 }
	 return c;
	 }
	 
	 public static void main (String args[])
	 {
		 
	 res=CountString.wordcount(" manchester united is also known as red devil ");
	 //string is always passed in double quotes
	 
	 System.out.println("The number of words in the String are : "+res);
//	Map<String, Integer> ee = CountString.countJava8();
// System.out.println(ee);
	 }
	 
	 //by Java 8
//	static String s="Moazzam Kafeel";
//	 public static Map<String, Integer> countJava8(String input) {
//		    return Pattern.compile("\\W+")
//		                  .splitAsStream(input)
//		                  .collect(Collectors.groupingBy(String::toLowerCase,
//		                                                 Collectors.summingInt(s -> 1)));
	 
	 
	 
	 
	 }
	 