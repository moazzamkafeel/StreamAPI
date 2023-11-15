package DSA.mk;

public class OddEvenCounter {
	
	public static void main(String[] args) {
		
		int num=126;
		int Even=0;
		int Odd=0;
		
		while (num > 0) 
		{    int i = num % 10;    
			if (i % 2 == 0)
			{
				Even++;
			} else {
				      Odd++;    }
			
			num=num/10;    //eliminating the number
			
		}
		
		System.out.println("Total Even Number is "+Even+" , "+"Total Odd Number is "+Odd);
		
		
		{
			
		}
		
		
		
		
int a[]= {2,4,5,9,4,2,6};
		
		for(int i=1;i<a.length;i++)	
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			} 
			
		}
		
		
		
		
		
		
		
		
	}

}
