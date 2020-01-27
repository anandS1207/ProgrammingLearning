package geeksforgeeks.arrays.problems;

import java.util.Scanner;

public class APermutaionIndicatesEitherNumerOfElementsBeforeOrAfterIt {
	/*
	 * A permutation where each element indicates either number of elements before
	 * or after it
	 */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = s.nextInt();
		if (check(ar))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean check(int arr[]) {
		int n = arr.length;
		int[] freq = new int[n];
		// Finding the frequency of each number.
		for (int i = 0; i < n; i++)
			freq[arr[i]]++;
		for (int i = 0; i < n; i++) {
			// Try to find number of element before
			// the current index.
			if (freq[i] != 0)
				freq[i]--;
			// the current index.
			else if (freq[n - i - 1] != 0)
				freq[n - i - 1]--;
			// If no such number find, return false.
			else
				return false;
		}
		return true;
	}
}