package DSA.IntegerQuestions;

public class DecimalToBinary {

	public static void main(String[] args) {

		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("Enter your number");
		 * 
		 * int num= sc.nextInt();
		 * 
		 * int arr[]= new int [8]; int index=0;
		 * 
		 * while(num>0) { arr[index]=num%2; index++; num=num/2; }
		 * 
		 * for(int i=index-1;i>=0;i--) { System.out.print(arr[i]); }
		 */

		int num = 15;
		String srt = Integer.toBinaryString(num);
		System.out.println(srt);
		Integer.toBinaryString(num);

	}

}
