package hackerearth.algorithms.searching;

import java.util.Scanner;

public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[] = new int[t];
		int min = Integer.MIN_VALUE;
		int total = 0;
		int count = 0;
		for (int i = 0; i < t; i++) {
			int temp = s.nextInt();
			if (temp > 0) {
				total += temp;
				count++;
			}
			if (min < temp)
				min = temp;
		}
		if (total == 0) {
			System.out.println(min + " " + 1);
		} else
			System.out.println(total + " " + count);
	}

}
