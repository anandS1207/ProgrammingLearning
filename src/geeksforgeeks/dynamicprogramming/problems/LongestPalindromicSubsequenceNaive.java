package geeksforgeeks.dynamicprogramming.problems;

public class LongestPalindromicSubsequenceNaive {
	public static void main(String srgs[]) {
		String str = "GEEKSFORGEEKS";
		System.out.println(lps(str, 0, str.length() - 1));
	}

	public static int lps(String str, int i, int j) {
		if (i == j)
			return 1;
		if (str.charAt(i) == str.charAt(j) && i + 1 == j)
			return 2;
		if (str.charAt(i) == str.charAt(j))
			return lps(str, i + 1, j - 1) + 2;
		return Integer.max(lps(str, i, j - 1), lps(str, i + 1, j));
	}
}
