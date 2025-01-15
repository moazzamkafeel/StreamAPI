package SingleTon;

public class Test {

	public static void main(String[] args) {

		Single instance = Single.getInstance();
		Single instance2 = Single.getInstance();
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
	}
}
