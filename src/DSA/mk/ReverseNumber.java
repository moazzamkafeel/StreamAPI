package DSA.mk;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int num =sc.nextInt();
//		int number = num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("This is your Reverse Result-> "+rev);
		if(num==rev)
		System.out.println("This is Palindrom");
		else System.out.println("Not a Palindrom");
		

//		  By Buffer Converting int to String  
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//      StringBuffer rev = sb.reverse();
//          System.out.println(rev);

//		   By Builder by append 
//		StringBuilder sb=new StringBuilder();
//		sb.append(num);
//	StringBuilder revBuilder = sb.reverse();
//	System.out.println(revBuilder);

//int rev=0;
//while(num!=0)
//{
//rev=rev*10+num%10;
//num=num/10;
//}
//
//System.out.println("Reverse number is "+rev);
//
//}
//Reverse By StringBuffer


}
}