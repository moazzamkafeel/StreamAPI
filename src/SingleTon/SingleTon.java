package SingleTon;

public class SingleTon {



 // SingleTon st = new SingleTon(); // Holds Only one instance

	public  String getInctance() {
//		System.out.println(st.hashCode()); // Provide a getter Method
		return "Hello I am Moazzam";
	}

	public static void main(String[] args) {
		SingleTon st = new SingleTon();
		String inctance3 = st.getInctance();
		String inctance4 = st.getInctance();
		System.out.println(inctance3.equals(inctance4));
		System.out.println(inctance3.hashCode() + "Instance 1");
		System.out.println(inctance4.hashCode() + "Instance 2");
		
	}
}
