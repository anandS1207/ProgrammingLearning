package geeksforgeeks.dynamicprogramming.problems;

public class EggDropDynamicProgramming {
	public static void main(String srghs[]) {
		int n = 2, k = 300;
		System.out.println(eggDrop(n, k));
	}

	static int eggDrop(int n, int k) {
		int res;
		int eggFloor[][] = new int[n + 1][k + 1];
		int i, j, l;
		for (i = 1; i <= n; i++) {
			eggFloor[i][1] = 1;
			eggFloor[i][0] = 0;
		}
		for (j = 1; j <= k; j++)
			eggFloor[1][j] = j;
		for (i = 2; i <= n; i++) {
			for (j = 2; j <= k; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for (l = 1; l <= j; l++) {
					res = 1 + Integer.max(eggFloor[i - 1][l - 1], eggFloor[i][j - l]);
					if (res < eggFloor[i][j])
						eggFloor[i][j] = res;
				}
			}
		}
		return eggFloor[n][k];
	}
}
