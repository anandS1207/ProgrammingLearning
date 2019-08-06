package geeksforgeeks.dynamicprogramming.problems;

public class LongestPalindromSubsequenceDynamicProgramming {
	public static void main(String srgs[]) {
		System.out.println(lps("GEEKSFORGEEKS"));
	}

	static int lps(String seq) {
		int n = seq.length();
		int i, j, cl;
		int l[][] = new int[n][n];
		for (i = 0; i < n; i++)
			l[i][i] = 1;
		for (cl = 2; cl <= n; cl++) {
			for (i = 0; i < n - cl + 1; i++) {
				j = i + cl - 1;
				if (seq.charAt(i) == seq.charAt(j) && cl == 2)
					l[i][j] = 2;
				else if (seq.charAt(i) == seq.charAt(j))
					l[i][j] = l[i + 1][j - 1] + 2;
				else
					l[i][j] = Integer.max(l[i][j - 1], l[i + 1][j]);
			}
		}
		return l[0][n - 1];
	}

}
