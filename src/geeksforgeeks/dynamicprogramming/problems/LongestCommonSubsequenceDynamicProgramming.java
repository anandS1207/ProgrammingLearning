package geeksforgeeks.dynamicprogramming.problems;

public class LongestCommonSubsequenceDynamicProgramming {
	public static void main(String args[]) {
		String str1 = "AGSDBTYS";
		String str2 = "SDABTGYA";
		char[] x = str1.toCharArray();
		char[] y = str2.toCharArray();
		System.out.println(lcs(x, y, str1.length(), str2.length()));
	}

	public static int lcs(char[] x, char[] y, int m, int n) {
		int l[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					l[i][j] = 0;
				else if (x[i - 1] == y[j - 1])
					l[i][j] = l[i - 1][j - 1] + 1;
				else
					l[i][j] = max(l[i - 1][j], l[i][j - 1]);
			}
		}
		return l[m][n];
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
