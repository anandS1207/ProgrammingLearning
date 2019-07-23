package hackerearth.math.basicNumberTheory1;

import java.util.Scanner;

public class CalculatethePower {

	public static void main(String[] args) {
		long MOD = 1000000007;
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long power = s.nextLong();
		System.out.println(getPower(n, power, MOD));
	}

	static long getPower(long n, long power, long MOD) {
		if (power == 0)
			return 1;
		else if (power % 2 == 0)
			return getPower((n * n) % MOD, power / 2, MOD);
		else
			return n * getPower(n * n % MOD, (power - 1) / 2, MOD) % MOD;
	}
}
