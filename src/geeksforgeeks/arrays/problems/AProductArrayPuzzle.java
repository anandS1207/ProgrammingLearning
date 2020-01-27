package geeksforgeeks.arrays.problems;

import java.util.Scanner;

public class AProductArrayPuzzle {
	/*
	 * Given an array arr[] of n integers, construct a Product Array prod[] (of same
	 * size) such that prod[i] is equal to the product of all the elements of arr[]
	 * except arr[i]. Solve it without division operator and in O(n).
	 */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		Long product[] = new Long[n];
		Long totalProduct = Long.parseUnsignedLong("0");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			totalProduct *= a[i];
		}
		for (int i = 0; i < n; i++) {
			product[i] = totalProduct / a[i];
		}
	}
}
