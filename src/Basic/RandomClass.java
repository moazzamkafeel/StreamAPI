package Basic;

import java.util.Random;

public class RandomClass {
	
	public static void main(String[] args) {
		
	Random rd=new Random();
	int l = rd.nextInt(100);
	System.out.println(l);
	double dr = rd.nextDouble(); //range 0.0-1.0
	System.out.println(dr);
	//By Math 
	System.out.println(Math.random());
	
	
	
	
	
	}

}
