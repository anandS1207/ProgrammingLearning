package hackerearth.math.basicNumberTheory1;

import java.util.Scanner;

public class TheConfusedMonk {
	public static void main(String args[]) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int result = 1;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			result *= a[i];
			if (result > 1000000007)
				result %= 1000000007;
		}
		int g = 0;
		if (n == 1)
			g = a[0];
		if (n >= 2)
			g = gcd(a[0], a[1]);
		if (n > 2)
			for (int i = 2; i < n; i++) {
				g = gcd(g, a[i]);
			}
		System.out.println(powerModulas(result, g, 1000000007));
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	static int powerModulas(int n, int p, int m) {
		if (p == 0)
			return 1;
		else if (p % 2 == 0) {
			return powerModulas(n * n % m, p / 2, m);
		} else
			return n * powerModulas(n * n % m, (p - 1) / 2, m) % m;
	}
}
