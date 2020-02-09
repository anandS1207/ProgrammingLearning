package gs.coding.problems;

import java.util.Arrays;
import java.util.Scanner;

public class TrappingRainWater {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int result = 0;
		int n = s.nextInt();
		int[][] calculateResult = new int[n][n];
		int i, j;
		// Arrays.fill(calculateResult, 0);
		for (i = 0; i < n; i++)
			Arrays.fill(calculateResult[i], 0);
		for (i = n - 1; i >= 0; i--) {
			int temp = s.nextInt();
			for (j = temp; j > 0; j--)
				calculateResult[j][i] = -1;
		}

		int startIndex, endIndex;
		for (i = 0; i < n; i++) {
			startIndex = -1;
			endIndex = -1;
			for (j = 0; j < n; j++) {
				if (calculateResult[i][j] == -1) {
					if (startIndex == -1) {
						startIndex = j;
					}
					if (startIndex > -1) {
						endIndex = j;
					}
				}
			}
			if (startIndex > -1 && endIndex > -1)
				for (int l = startIndex; l < endIndex; l++) {
					if (calculateResult[i][l] == 0)
						calculateResult[i][l] = 1;
				}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (calculateResult[i][j] == 1)
					result += 1;
				System.out.print(" " + calculateResult[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(result);
	}
}
