package SingleTon;

public class SynchroniseSingleton {

	private static SynchroniseSingleton synchroniseSingleton;

	private SynchroniseSingleton() {

	}
	public static SynchroniseSingleton getInstence() {
		synchronized (SynchroniseSingleton.class) {
			if (synchroniseSingleton == null) {
				synchroniseSingleton = new SynchroniseSingleton();
			}

			return synchroniseSingleton;
		}
	}
}
