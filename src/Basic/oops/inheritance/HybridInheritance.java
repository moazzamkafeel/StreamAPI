package Basic.oops.inheritance;

public class HybridInheritance extends Child implements InterfaceA{
//ombination of two or more types of inheritance. Since Java doesn’t support multiple inheritance with classes, 
	//hybrid inheritance is achieved using interfaces.
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		HybridInheritance hi =new HybridInheritance();
		hi.a();
		hi.child();
	}

}
