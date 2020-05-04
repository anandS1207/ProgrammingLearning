package geeksforgeeks.arrays.problems;

import java.util.Scanner;

public class ABooleanMatrixQuestion {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int i, j;
		int row[] = new int[m];
		int column[] = new int[n];
		int[][] a = new int[m][n];
		// only filling rows
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = s.nextInt();
				if (a[i][j] == 1) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		//
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (row[i] == 1 || column[j] == 1) {
					a[i][j] = 1;
				}
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
