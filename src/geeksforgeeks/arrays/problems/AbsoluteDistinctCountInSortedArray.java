package geeksforgeeks.arrays.problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AbsoluteDistinctCountInSortedArray {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Set<Integer> abc = new HashSet<>();
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			abc.add(Math.abs(a[i]));
		}
		System.out.println(abc.size());
	}
}
