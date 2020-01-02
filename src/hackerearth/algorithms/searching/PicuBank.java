package hackerearth.algorithms.searching;

import java.util.Scanner;

public class PicuBank {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int j = 0; j < t; j++) {
			Integer deposit = s.nextInt();
			Integer a = s.nextInt();
			Integer m = s.nextInt();
			Integer b = s.nextInt();
			Integer X = s.nextInt();
			int monthCount = (int) Math.floor((double) (X - deposit) / ((double) a * m + b) * ((m + 1)));
			if (deposit + a * (monthCount - (monthCount / (m + 1))) + b * (monthCount / (m + 1)) < X) {
				System.out.println(monthCount + 1);
			} else
				System.out.println(monthCount);
		}
	}
}
