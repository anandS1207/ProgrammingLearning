package hackerearth.math.basicNumberTheory1;

import java.util.Scanner;

public class PandaAndChainReaction {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		int MOD = 1000003;
		long start, index, result;
		while (t-- > 0) {
			index = s.nextLong();
			start = s.nextLong();
			result = 1;
			for (int i = 1; i <= index; i++) {
				result *= i;
				result %= MOD;
			}
			System.out.println(result * start);
		}
	}
}
