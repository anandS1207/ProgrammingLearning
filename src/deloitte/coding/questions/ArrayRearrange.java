package deloitte.coding.questions;

import java.util.Scanner;

public class ArrayRearrange {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] ar = new int[t];
		for (int i = 0; i < t; i++) {
			ar[i] = s.nextInt();
		}
		int[] result = getResult(ar);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] getResult(int a[]) {
		int temp = -1, index = -1;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0 && a[i] % 2 != 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] % 2 == 0) {
						temp = a[j];
						index = j;
						break;
					}
				}
				for (int j = index; j > i; j--) {
					a[j] = a[j - 1];
				}
				a[i] = temp;
			}
			if (i % 2 == 1 && a[i] % 2 == 0) {

				for (int j = i + 1; j < a.length; j++) {
					if (a[j] % 2 == 1) {
						temp = a[j];
						index = j;
						break;
					}
				}
				for (int j = index; j > i; j--) {
					a[j] = a[j - 1];
				}
				a[i] = temp;
			}
		}
		return a;
	}
}
