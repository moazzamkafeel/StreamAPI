package Basic.oops.inheritance;

public interface C extends A{

	 @Override
	    default void display() {
	        System.out.println("Display from C");
	    }
}
