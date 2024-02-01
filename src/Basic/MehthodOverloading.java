package Basic;

public class MehthodOverloading {

	// Method Name Same
	// Num

	public int m1(int a, int b) {
		return a + b;
	}

	public static int m1(int b, int c, int a) {
		return a + b + c;
	}

	public static void main(String[] args) {

		MehthodOverloading m = new MehthodOverloading();

		int plus = m.m1(10, 20);

		System.out.println(plus);
		int plus3 = m1(20, 678, 567);
		System.out.println(plus3);

	}

}
