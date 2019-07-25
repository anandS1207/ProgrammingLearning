package geeksforgeeks.dynamicprogramming.problems;

public class CoinChangeNaiveProblem {
	public static void main(String args[]) {
		int i, j;
		int arr[] = { 1, 2, 3 };
		int m = arr.length;
		long starttime = System.currentTimeMillis();
		System.out.println(count(arr, m, 11000));
		long endtime = (System.currentTimeMillis() - starttime) / 1000;
		System.out.println(endtime);
	}

	static int count(int s[], int m, int n) {
		if (n == 0)
			return 1;
		if (n < 0)
			return -1;
		if (m <= 0 && n >= 1)
			return 0;
		return count(s, m - 1, n) + count(s, m, n - s[m - 1]);
	}
}
