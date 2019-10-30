package geeksforgeeks.dynamicprogramming.problems;

// some output miss matched
public class KnapSackDynamicProgramming {
	public static void main(String srgs[]) {
		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		System.out.println(knapSack(50, wt, val, val.length));

	}

	static int knapSack(int w, int wt[], int val[], int n) {
		int i, j;
		int k[][] = new int[n + 1][w + 1];
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= w; j++) {
				if (i == 0 || j == 0)
					k[i][j] = 0;
				else if (wt[i - 1] <= j)
					k[i][j] = Integer.max(val[i - 1] + k[i - 1][j - wt[i - 1]], k[i - 1][j]);
				else
					k[i][j] = k[i - 1][j];
			}
		}
		return k[n][w];
	}
}
