package DSA.StringQuestions;

public class ReverseString {

	public static void main(String[] args) {

		String ss = "Moazzam";
		String s1 = "";

		for (int i = ss.length() - 1; i >= 0; i--) // 1st Method
		{
			s1 = s1 + ss.charAt(i);
		}
		System.out.println("This is ForLoop -> " + s1);

		// 2nd Inbuilt Method
		StringBuffer sb = new StringBuffer("Moazzam");
		System.out.println("This is by StringBuffer -> " + sb.reverse());
//	
//	//3rd Method By recursion
// String input = "AliveisAwesome";
// 
//   //create Method and pass input string as parameter
//		 String reversed = reverseString(input);
//		 System.out.println("eversed by Recursion: " + reversed);
//		 
//		}
//		 
//		//Method take string parameter and check string is empty or not
//		public static String reverseString(String input)
//		{
//		 if (input.isEmpty()){
//		 return input;
//		 }
//		 //Calling Function Recursively
//		 return reverseString(input.substring(1)) + input.charAt(0);
//		}

		String s = "Moazzam";
		String reverse = recursionString(s);
		System.out.println(reverse + "-->This is Reverse by recursion");

	}

	public static String recursionString(String s) {
		if (s.isEmpty()) {

			return s;
		}
		System.out.println(s);
		return recursionString(s.substring(1)) + s.charAt(0);
	}

}

/*
 * String s1=""; String ss="Moazzam kafeel"; Pattern p = Pattern.compile("\\s");
 * String[] se = p.split(ss);
 * 
 * 
 * 
 * for(int i=0;i<se.length;i++) { s1=" "+se[i]+s1; } System.out.println(s1); }}
 */