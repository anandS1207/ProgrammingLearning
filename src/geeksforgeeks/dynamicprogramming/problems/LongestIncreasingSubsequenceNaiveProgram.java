package geeksforgeeks.dynamicprogramming.problems;

public class LongestIncreasingSubsequenceNaiveProgram {
	static int max_ref;

	static int _lis(int arr[], int n) {
		if (n == 1)
			return 1;
		int res, max_ending_here = 1;
		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		return max_ending_here;
	}

	static int lis(int arr[], int n) {
		max_ref = 1;
		_lis(arr, n);
		return max_ref;

	}

	public static void main(String srgs[]) {
		int arr[] = { 4, 2, 3, 9, 6, 8, 1, 10 };
		System.out.println(lis(arr, arr.length));
	}

}
