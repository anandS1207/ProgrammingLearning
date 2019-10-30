package geeksforgeeks.dynamicprogramming.problems;

public class BinomialCoefficientDynamicProgramming {

	public static void main(String[] args) {
		System.out.println(binomialCoeff(5, 2));
	}

	static int binomialCoeff(int n, int k) {
		int c[][] = new int[n + 1][k + 1];
		int i, j;
		// Calculate the Binomial coefficient in Bottom up manner
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= Integer.min(i, k); j++) {
				// Base Cases
				if (j == 0 || j == i)
					c[i][j] = 1;
				// Calculate values based on previously stored values
				else
					c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
			}
		}
		return c[n][k];
	}

	static int binomialCoeffAuxilary(int n, int k) {
		int c[] = new int[k + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = Math.min(i, k); j > 0; j--)
				c[j] = c[j] + c[j - 1];
		}
		return c[k];
	}
}
