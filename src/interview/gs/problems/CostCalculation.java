package interview.gs.problems;

import java.util.HashSet;
import java.util.Set;

public class CostCalculation {
	public static void main(String srgs[]) {
		int[] abc = new int[4];
		abc[0] = 1;
		abc[1] = 2;
		abc[2] = 3;
		abc[3] = 1;
		System.out.println(getCost(4, 2, abc, 4));
	}

	static Long getCost(int X, int k, int[] price, int N) {

		// Write your code here
		Set<Integer> abc = new HashSet<Integer>();
		Long cost = 0L;
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (!abc.contains(price[i])) {
				if (count >= k)
					cost = cost + X;
				abc.add(price[i]);
				count++;
			}
		}
		return cost;

	}
}
