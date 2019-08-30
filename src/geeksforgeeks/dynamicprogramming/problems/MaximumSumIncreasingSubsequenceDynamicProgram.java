package geeksforgeeks.dynamicprogramming.problems;

public class MaximumSumIncreasingSubsequenceDynamicProgram {

	public static void main(String[] args) {
		int arr[] = { 1, 101, 2, 3, 100, 4, 5 };
		System.out.println("Maximum possible is " + getMaxSumIncreaseSub(arr, arr.length));
	}

	public static int getMaxSumIncreaseSub(int arr[], int n) {
		int i, j, max = 0;

		int temp[] = new int[n];
		for (i = 0; i < n; i++)
			temp[i] = arr[i];
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && temp[i] < temp[j] + arr[i])
					temp[i] = temp[j] + arr[i];
		for (i = 0; i < n; i++)
			if (max < temp[i])
				max = temp[i];
		return max;

	}

}
