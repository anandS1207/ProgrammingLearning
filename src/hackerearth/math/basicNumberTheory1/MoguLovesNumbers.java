package hackerearth.math.basicNumberTheory1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MoguLovesNumbers {

	public static void main(String[] args) {
		int t;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		while (t-- > 0) {
			int l = s.nextInt();
			int r = s.nextInt();
			int count = 0;
			if (l > r) {
				int temp = l;
				l = r;
				r = temp;
			}
			for (int i = l; i <= r; i++)
				if (isCount(i))
					count++;
			System.out.println(count);
		}
	}

	static boolean isCount(int l) {
		Set<Integer> divisors = new HashSet<>();
		for (int i = 1; i * i <= l; i++) {
			if (l % i == 0) {
				divisors.add(i);
				divisors.add(l / i);
			}
		}
		if (isPrime(divisors.size()) && divisors.size() % 2 == 0)
			return true;
		return false;
	}

	static boolean isPrime(int k) {
		for (int i = 2; i * i <= k; i++)
			if (k % i == 0)
				return false;
		return true;
	}
}
