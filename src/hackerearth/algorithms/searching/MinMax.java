package hackerearth.algorithms.searching;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[] = new int[t];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int total = 0;
		for (int i = 0; i < t; i++) {
			int temp = s.nextInt();
			total += temp;
			if (temp < min)
				min = temp;
			if (temp > max)
				max = temp;
		}
		System.out.println((total - max) + " " + (total - min));
	}

}
