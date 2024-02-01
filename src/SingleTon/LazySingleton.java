package SingleTon;

//Lazy Loading
public class LazySingleton {

	private LazySingleton() {

	}

	private static LazySingleton lazySingleton;

	public static LazySingleton getInstence() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}

		return lazySingleton;
	}

}
