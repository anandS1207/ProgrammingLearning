package hackerearth.algorithms.searching;

import java.util.Arrays;
import java.util.Scanner;

class BishuAndSoldiers {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		Arrays.sort(a);
		int indexWithSum[] = new int[n];
		indexWithSum[0] = a[0];
		int val = 0;
		for (int i = 1; i < n; i++)
			indexWithSum[i] = a[i] + indexWithSum[i - 1];
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int temp = s.nextInt();
			int low = 0, high = n - 1;
			// val = findIndex(a, 0, n - 1, temp);
			while (low <= high) {
				int mid = (low + high) / 2;
				if (a[mid] > temp) {
					high = mid - 1;
				} else {
					low = mid + 1;
					val = mid;
				}
			}

			System.out.println(val + 1 + " " + indexWithSum[val]);
		}
	}

}