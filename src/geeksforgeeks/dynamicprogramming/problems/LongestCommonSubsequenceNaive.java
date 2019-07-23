package geeksforgeeks.dynamicprogramming.problems;

public class LongestCommonSubsequenceNaive{

	public static int lcs(char[] x, char[] y, int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (x[m - 1] == y[n - 1])
			return 1 + lcs(x, y, m - 1, n - 1);
		else
			return max(lcs(x, y, m - 1, n), lcs(x, y, m, n - 1));
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		String str1 = "ABCSLSDKFJ";
		String str2 = "ABSDJSSDFJ";
		char x[] = str1.toCharArray();
		char y[] = str2.toCharArray();
		System.out.println(lcs(x, y, str1.length(), str2.length()));
	}

}
