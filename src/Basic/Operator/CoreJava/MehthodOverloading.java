package Basic.Operator.CoreJava;

public class MehthodOverloading {

	// Method Name Same
	// Num

	static int plus;
	static int plus3;

	private int m1(int a, int b) {
		return a + b;
	}    

	public static int m1(int b, int c, int a) {
		return a + b + c;
	}

	public static void main(String[] args) {

		MehthodOverloading m = new MehthodOverloading();
		plus = m.m1(10, 20);
		System.out.println(plus);
		main();

	}
 
	public static void main() {

		plus3 = m1(20, 678, 567);
		System.out.println(plus3);
		
	}

}
