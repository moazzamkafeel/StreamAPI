package DSA.IntegerQuestions;

public class FindMinMax {

	public static int[] minMax(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for (int num : arr) {
			if (max < num)
				max = num;

			if (min > num)
				min = num;

		}
		return new int[] { min, max };
	}

	public static void main(String[] args) {

		int[] minMax = minMax(new int[] { 78, 90, 65, 1, 99 });
		for (int num : minMax)
			System.out.println(num);
	}
}
