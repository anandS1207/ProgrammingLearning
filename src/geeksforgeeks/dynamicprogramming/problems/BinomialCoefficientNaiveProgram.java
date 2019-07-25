package geeksforgeeks.dynamicprogramming.problems;

public class BinomialCoefficientNaiveProgram {

	public static void main(String[] args) {
		int n = 5, k = 2;
		System.out.println(binomialCoeffi(n, k));
	}

	static int binomialCoeffi(int n, int k) {
		if (k == 0 || k == n)
			return 1;
		return binomialCoeffi(n - 1, k - 1) + binomialCoeffi(n - 1, k);
	}
}
