package hackerearth.algorithms.searching;

import java.util.Scanner;

public class SimpleSearch {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[] = new int[t];
		for (int i = 0; i < t; i++)
			a[i] = s.nextInt();
		int find = s.nextInt();
		for (int i = 0; i < t; i++)
			if (a[i] == find) {
				System.out.println(i);
				break;
			}
	}
}
