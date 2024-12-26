package Basic.oops.inheritance;

public class MultipleInheritance implements InterfaceB, InterfaceA {

	@Override
	public void b() {
		System.out.println("B");

	}

	@Override
	public void a() {
		System.out.println("A");

	}

	public static void main(String[] args) {

		MultipleInheritance mi = new MultipleInheritance();
		mi.a();
		mi.b();
	}

}
