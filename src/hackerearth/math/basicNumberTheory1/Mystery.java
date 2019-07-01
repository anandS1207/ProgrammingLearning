package hackerearth.math.basicNumberTheory1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mystery {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			long some = s.nextLong();
			System.out.println(getFactorsCount(some));
		}
	}

	public static int getFactorsCount(long some) {
		Set<Long> factors = new HashSet<Long>();
		for (long l = 1; l < Math.sqrt(some) + 1; l++) {
			if (some % l == 0) {
				factors.add(l);
				factors.add(some / l);
			}
		}
		return factors.size();

	}
}
