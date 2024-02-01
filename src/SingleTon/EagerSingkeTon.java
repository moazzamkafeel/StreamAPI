package SingleTon;

//The Singleton Design Pattern is a Creational pattern, 
//whose objective is to create only one instance of a class 
//and to provide only one global access point to that object. 

public class EagerSingkeTon
{
	
//1st Private Static of its class object
	private static EagerSingkeTon eagerSingkeTon = new EagerSingkeTon();

	//2nd Private ons
	private EagerSingkeTon() {

	}

	public static EagerSingkeTon getInstense() {

		return eagerSingkeTon;
	}

}
