package geeksforgeeks.arrays.problems;

import java.util.Scanner;

public class ActiveInactiveCells {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k;
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		k = s.nextInt();
		for (int i = 0; i < k; i++) {
			int firstCompare = arr[1];
			int lastCompare = arr[n - 1];
			for (int j = 1; j < n - 1; j++) {
				if (arr[j - 1] == arr[j + 1])
					arr[j] = 0;
				if (arr[j - 1] != arr[j + 1])
					arr[j] = 1;
			}
			arr[0] = firstCompare == 0 ? 0 : 1;
			arr[n - 1] = lastCompare == 0 ? 0 : 1;
			for (int l = 0; l < n; l++) {
				System.out.print(arr[l] + " ");
			}
			System.out.println();
		}
		int activeCells = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1)
				activeCells++;
		}
		System.out.println("ActiveCells: " + activeCells + " Inactive Cells: " + (n - activeCells));
	}
}
