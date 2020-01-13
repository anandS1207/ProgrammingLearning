package geeksforgeeks.gridalgorithms.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mechanic {
	public static void main(String srgs[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, j, x = -1, y = -1;
		int a[][] = new int[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = 0;
			}
		}
		int days = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (a[i][j] == 0) {
					List<Character> direction = findRepairPossible(i, j, n);
					int temp;
					int count = getCount(a, i, j, n);
					for (Character ch : direction) {
						if (ch == 'L') {
							if (a[i][j - 1] == 0) {
								temp = getCount(a, i, j - 1, n);
								if (count < temp) {
									count = temp;
									x = i;
									y = j - 1;
								}
							}

						}
						if (ch == 'T') {
							if (a[i - 1][j] == 0) {
								temp = getCount(a, i - 1, j, n);
								if (count < temp) {
									count = temp;
									x = i - 1;
									y = j;
								}
							}
						}
						if (ch == 'D') {
							if (a[i + 1][j] == 0) {
								temp = getCount(a, i + 1, j, n);
								if (count < temp) {
									count = temp;
									x = i + 1;
									y = j;
								}
							}
						}
						if (ch == 'R') {
							if (a[i][j + 1] == 0) {
								temp = getCount(a, i, j + 1, n);
								if (count < temp) {
									count = temp;
									x = i;
									y = j + 1;
								}
							}
						}
					}
					if (x == -1 && y == -1) {
						x = i;
						y = j;
					}
					a[x][y] = 1;
					direction = findRepairPossible(x, y, n);
					System.out.println(x + "," + y);

					for (Character ch : direction) {
						if (ch == 'L')
							a[x][y - 1] = 1;
						if (ch == 'T')
							a[x - 1][y] = 1;
						if (ch == 'D')
							a[x + 1][y] = 1;
						if (ch == 'R')
							a[x][y + 1] = 1;
						System.out.println(ch);
					}
					days++;
					x = -1;
					y = -1;
				}
			}

		}
		System.out.println(days);
	}

	public static List<Character> findRepairPossible(int i, int j, int n) {
		List<Character> abc = new ArrayList<Character>();
		if (i > 0 && i < n - 1) {
			abc.add('T');
			abc.add('D');
		}
		if (j > 0 && j < n - 1) {
			abc.add('R');
			abc.add('L');
		}
		if (i == 0) {
			abc.add('D');
		}
		if (i == n - 1) {
			abc.add('T');
		}
		if (j == 0) {
			abc.add('R');
		}
		if (j == n - 1) {
			abc.add('L');
		}
		return abc;
	}

	public static int getCount(int a[][], int i, int j, int n) {
		List<Character> direction = findRepairPossible(i, j, n);
		int count = 0;
		for (Character ch : direction) {
			if (ch == 'L') {
				if (a[i][j - 1] == 0)
					count++;
			}
			if (ch == 'T') {
				if (a[i - 1][j] == 0)
					count++;
			}
			if (ch == 'D') {
				if (a[i + 1][j] == 0)
					count++;
			}
			if (ch == 'R') {
				if (a[i][j + 1] == 0)
					count++;
			}
		}
		return count;
	}
}
