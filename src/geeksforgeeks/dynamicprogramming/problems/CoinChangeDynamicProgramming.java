package geeksforgeeks.dynamicprogramming.problems;

import java.util.Arrays;

public class CoinChangeDynamicProgramming {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5 };
		int m = arr.length;
		long starttime = System.currentTimeMillis();
		System.out.println(countWays(arr, m, 8));
		long endtime = (System.currentTimeMillis() - starttime) / 1000;
		// System.out.println(endtime);

	}

	static long countWays(int s[], int m, int n) {
		long[] table = new long[n + 1];
		Arrays.fill(table, 0);
		table[0] = 1;
		for (int i = 0; i < m; i++) {
			for (int j = s[i]; j <= n; j++)
				table[j] += table[j - s[i]];
		}
		return table[n];
	}
}
