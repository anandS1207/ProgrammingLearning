package geeksforgeeks.dynamicprogramming.problems;

public class LongestIncreasingSubsequenceDynamicProgramming {

	public static void main(String srgs[]) {
		int arr[] = { 2, 5, 8, 1, 3, 9, 10, 4, 7 };
		System.out.println(lis(arr, arr.length));
	}

	static int lis(int arr[], int n) {
		int lis[] = new int[n];
		int i, j, max = 0;
		for (i = 0; i < n; i++)
			lis[i] = 1;
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];
		return max;
	}
}
