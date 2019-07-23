package geeksforgeeks.dynamicprogramming.problems;

public class EditDistanceNaiveApproach {

	public static void main(String[] args) {
		String str1 = "Ananda Rao";
		String str2 = "Anand Rao";
		System.out.println(editDist(str1, str2, str1.length(), str2.length()));
	}

	public static int min(int x, int y, int z) {
		if (x <= y && x <= z)
			return x;
		if (y <= x && y <= z)
			return y;
		return z;
	}

	public static int editDist(String str1, String str2, int m, int n) {
		if (m == 0)
			return n;
		if (n == 0)
			return m;
		if (str1.charAt(m - 1) == str2.charAt(n - 1))
			return editDist(str1, str2, m - 1, n - 1);
		return 1 + min(editDist(str1, str2, m, n - 1), editDist(str1, str2, m - 1, n),
				editDist(str1, str2, m - 1, n - 1));
	}
}
