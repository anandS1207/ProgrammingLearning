package hackerearth.algorithms.searching;

import java.util.Scanner;

public class SquareTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i, j;
		int t = s.nextInt();
		int a[] = new int[t];
		int b[] = new int[t];
		a[0] = s.nextInt();
		b[0] = a[0];
		for (i = 1; i < t; i++) {
			a[i] = s.nextInt();
			b[i] = b[i - 1] + a[i];
		}
		int q = s.nextInt();

		for (i = 0; i < q; i++) {
			int result = -1;
			int limit = s.nextInt();
			for (j = 0; j < t; j++) {
				if (b[j] >= limit) {
					result = j + 1;
					break;
				}
			}
			System.out.println(result);
		}
	}

}
