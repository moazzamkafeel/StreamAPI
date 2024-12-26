package Basic.oops.inheritance;

public interface B extends A{

	  @Override
	    default void display() {
	        System.out.println("Display from B");
	    }
	  
}
