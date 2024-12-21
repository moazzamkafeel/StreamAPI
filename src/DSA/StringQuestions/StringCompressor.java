package DSA.StringQuestions;

public class StringCompressor {

	
	@SuppressWarnings("Wrong result and needvto understand")
	public static String compress(String str){
		   // Check for empty or null strings
        if (str == null || str.length() == 0) {
            return str;
        }
        
        StringBuilder sb=new StringBuilder();
        int count = 1; // Counter for consecutive characters
		for(int i=1;i<str.length();i++) {
			
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			} else {
				sb.append(str.charAt(i-1)).append(count);
			}
		}
			 // Append the last character and count
	        sb.append(str.charAt(str.length() - 1)).append(count);
		
	        // Return the shorter of the original or compressed string
	        return sb.length() < str.length() ? sb.toString() : str;
		
       
		
	}
	public static void main(String[] args) {
		
		String str="aaabb";
		System.out.println(compress(str));
		
		
		
		
	}
}
