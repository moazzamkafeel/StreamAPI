package MrJava;

import java.util.ArrayList;

public class VowelsAndConsonant {
public static void main(String[] args)
{

String s="mrJava is a 100% pure Java"
		+ " Channel";
long vowels=0;
long consonants=0;
	ArrayList lv = new ArrayList();
	ArrayList lc = new ArrayList();
     
     s=s.toLowerCase();
 for(int i=0;i<s.length();i++)
{
 char ch= s.charAt(i);
if( ch=='a' || ch=='e' || ch=='i'
|| ch=='o' || ch=='u' )
{
    		lv.add(ch);
   	 vowels++;
 } else if(ch>='a'&& ch<='z') 
 {
    		 lc.add(ch);
  consonants++;
  }
  }
     
     
System.out.println(lv+"   vowels -> "+vowels);
System.out.println(lc+"   Consonants -> "+consonants);

     	}

}
