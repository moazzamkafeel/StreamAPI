package Basic.Operator.CoreJava;

public class IndexOfExample {
	
    public static void main(String[] args) {
        String str = "programming";

        // Finding 'g'
        System.out.println("indexOf('g'): " + str.indexOf('g'));   // First 'g' at index 3
        System.out.println("lastIndexOf('g'): " + str.lastIndexOf('g')); // Last 'g' at index 10

        // Finding 'm'
        System.out.println("indexOf('m'): " + str.indexOf('m'));   // First 'm' at index 6
        System.out.println("lastIndexOf('m'): " + str.lastIndexOf('m')); // Last 'm' at index 7

        // Finding 'x' (not present)
        System.out.println("indexOf('x'): " + str.indexOf('x'));   // -1 (not found)
        System.out.println("lastIndexOf('x'): " + str.lastIndexOf('x')); // -1 (not found)
    
        // Finding 'o'
        System.out.println("indexOf('o'): " + str.indexOf('o'));  
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o')); 

    }
}

