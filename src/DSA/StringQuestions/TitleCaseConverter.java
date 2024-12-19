package DSA.StringQuestions;

public class TitleCaseConverter {
	
    public static void main(String[] args) {
    	
        String input = "hello  j world";
        String titleCase = convertToTitleCase(input);
        System.out.println("Title Case: " + titleCase);
        
    }

    public static String convertToTitleCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder titleCase = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                titleCase.append(c);
            } else if (capitalizeNext) {
                titleCase.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                titleCase.append(Character.toLowerCase(c));
            }
        }

        return titleCase.toString();
    }
}

