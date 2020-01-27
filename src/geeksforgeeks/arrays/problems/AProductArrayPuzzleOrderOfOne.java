package geeksforgeeks.arrays.problems;

import java.util.Scanner;

public class AProductArrayPuzzleOrderOfOne {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		int[] product = new int[n];
		double allProduct = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			allProduct += Math.log(arr[i]);
		}
		for (int i = 0; i < n; i++) {
			product[i] = (int) Math.exp(allProduct - Math.log(arr[i]));
			System.out.println(product[i]);
		}
		
	}
}
