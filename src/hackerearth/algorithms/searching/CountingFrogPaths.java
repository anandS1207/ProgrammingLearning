package hackerearth.algorithms.searching;

import java.util.Scanner;

public class CountingFrogPaths {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		int result = 0;
		for (int i = x; i <= x + s; i++) {
			for (int j = y; j <= y + s; j++) {
				if (i + j <= t)
					result++;
			}
		}
		System.out.println(result);
	}

}
