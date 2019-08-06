package geeksforgeeks.dynamicprogramming.problems;

public class CuttingRodNaiveApproach {
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
		System.out.println(cutRod(arr, arr.length));
	}

	static int cutRod(int price[], int n) {
		if (n <= 0)
			return 0;
		int max_val = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
			max_val = Integer.max(max_val, price[i] + cutRod(price, n - i - 1));
		return max_val;
	}
}
