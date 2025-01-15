package SingleTon;

public class Single {

	static Single s =new Single();
	
	public static Single getInstance(){
		
		return s;
	}
}
