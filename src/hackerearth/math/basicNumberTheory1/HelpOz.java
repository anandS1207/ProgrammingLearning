package hackerearth.math.basicNumberTheory1;

import java.util.Scanner;

public class HelpOz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		int g = gcd(arr[0], arr[1]);
		for (int i = 2; i < n; i++) {
			g = gcd(arr[i], g);
		}
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	static int extendedEuclid(int a, int b, int x, int y) {
		if (a == 0) {
			x = 0;
			y = 1;
			return b;
		} else {
			int x1 = 1, y1 = 1;
			int gcd = extendedEuclid(b % a, a, x1, y1);
			int temp = x;
			x = y1 - (a / b) * y;
			y = x1;
			return gcd;
		}
	}
}
