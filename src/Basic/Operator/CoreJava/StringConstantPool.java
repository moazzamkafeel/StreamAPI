package Basic.Operator.CoreJava;

public class StringConstantPool {
	public static void main(String[] args) {

		// Case 1: String literals share the same object in the constant pool
		String literal1 = "Hello";
		String literal2 = "Hello";
		System.out.println("Case 1:");
		System.out.println(literal1 == literal2); // true

		// Case 2: `new` creates new objects in the heap, even with the same content
		String newString1 = new String("World");
		String newString2 = new String("World");
		System.out.println("Case 2:");
		System.out.println(newString1 == newString2); // false
		System.out.println(newString1.equals(newString2)); // true

		// Case 3: Interning moves a string to the constant pool
		String internedString = newString1.intern();
		System.out.println("Case 3:");
		System.out.println(internedString == "World"); // true

		// Case 4: Compile-time concatenation results in a single object in the pool
		String concat1 = "Hello" + "World";
		String concat2 = "HelloWorld";
		System.out.println("Case 4:");
		System.out.println(concat1 == concat2); // true

		// Case 5: Runtime concatenation creates a new object in the heap
		String variablePart = "World";
		String concatWithVariable = "Hello" + variablePart;
		System.out.println("Case 5:");
		System.out.println(concatWithVariable == concat2); // false
		System.out.println(concatWithVariable.equals(concat2)); // true

		// Case 6: Interning runtime concatenation moves it to the pool
		String internedConcat = concatWithVariable.intern();
		System.out.println("Case 6:");
		System.out.println(internedConcat == concat2); // true
		
		// Case 7: Strings are immutable, original remains unchanged
		String immutableString = "Java";

		immutableString.concat(" Programming");
		System.out.println("Case 7:");
		System.out.println(immutableString); // "Java"
		
		System.out.println("Cusromise Questions");
		String str1="Moazzam";
		String str2=new String("Moazzam");
		System.out.println(str1==str2.intern());

	}
}