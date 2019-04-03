package Searching;

import java.util.Arrays;

public class RSED {
	public static void main(String sres[]) {
		int a[] = { 1, 2, 4 };
		int n = a.length;
		int b = 1;
		System.out.println(getResult(a, b, n));

	}

	public static int getResult(int arr[], int b, int n) {
		Arrays.sort(arr);
		int max = arr[n - 1];
		while (b <= max) {
			if (Arrays.binarySearch(arr, b) > -1)
				b += b;
			else
				return b;
		}
		return b;
	}
}
