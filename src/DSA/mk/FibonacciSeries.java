package DSA.mk;

public class FibonacciSeries {
//	Fibonacci series ek mathematical sequence hai, 
//  jisme har ek term (number) previous do terms ka sum hota hai. 
//	0,1,1,2,3,5,8,13,21,34,�

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;

		 System.out.println(n1+" "+n2);

		for (int i = 2; i < 10; i++) {
			sum = n1 + n2;
			System.out.print(sum+"--");
			//Certainly! Let me explain the lines `n1 = n2;` and `n2 = sum;` in simpler terms:
//
//1. `n1 = n2;`: Yeh line kehta hai ki ab jo term (n1 hai, 
			//woh n2 ke barabar ho jaye. Isse aap current term ko pehli previous term mein store kar rahe hain.
//2. `n2 = sum;`: Is line mein aap keh rahe hain ki ab n2
			//woh term ho jaye jo abhi calculate kiya gaya hai, yaani \(sum\). Isse aap current term ko doosri previous term mein store kar rahe hain.
			//
			n1 = n2; // 1
			n2 = sum;// 2
		}
	}
}
