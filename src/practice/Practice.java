package practice;

public class Practice {
private static long vowels=0;
private static long consonant=0;

	public static void main(String[] args) {
		
		String s="AbcdEfghijklmnopqrstuwvxyz";
		s=s.toLowerCase();
		
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			vowels++;
		} else if (ch>='a'&&ch<='z')
		{
			consonant++;
		}	
		}
System.out.println(consonant);
System.out.println(vowels);
	}

}
