package hackerearth.algorithms.searching;

import java.util.Scanner;

public class MonkAndSearch {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = s.nextInt();
		}
		int q = s.nextInt();
		for (int i = 0; i < q; i++) {
			int b = s.nextInt();
			int c = s.nextInt();
			int z = findIndex(ar, c);
			if (b == 0) {
				System.out.println(z + 1);
			} else
				System.out.println(n - b);
		}
	}

	public static int findIndex(int arr[], int target) {

		int start = 0, end = arr.length - 1;

		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] >= target) {
				end = mid - 1;
			} else {
				ans = mid;
				start = mid + 1;
			}
		}
		return ans;
	}
}
