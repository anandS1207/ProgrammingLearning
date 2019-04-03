package Searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String args[]) {
		int arr[] = new int[8];
		arr[0] = 7;
		arr[1] = 31;
		arr[2] = 48;
		arr[3] = 65;
		arr[4] = 71;
		arr[5] = 85;
		arr[6] = 95;
		arr[7] = 18;
		System.out.println(binarySearch(arr, 71, 0, 8));
	}

	public static int binarySearch(int arr[], int x, int l, int r) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
}
