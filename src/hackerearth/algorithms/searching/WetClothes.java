package hackerearth.algorithms.searching;

import java.util.Arrays;
import java.util.Scanner;

public class WetClothes {
	public static void main(String srr[]) {
		Scanner s = new Scanner(System.in);
		int n, m, g;
		n = s.nextInt();
		m = s.nextInt();
		g = s.nextInt();
		int raintime[] = new int[n];
		int drytime[] = new int[m];
		raintime[0] = s.nextInt();
		int maxtime = 0;
		for (int i = 1; i < n; i++) {
			raintime[i] = s.nextInt();
			if (raintime[i] - raintime[i - 1] > maxtime)
				maxtime = raintime[i] - raintime[i - 1];
		}
		// finding the max time period where it's not going to rain
		for (int i = 0; i < m; i++)
			drytime[i] = s.nextInt();
		Arrays.sort(drytime);
		int result;
		for (result = 0; result < m; result++) {
			if (drytime[result] > maxtime)
				break;
		}
		System.out.println(result);
	}
}
