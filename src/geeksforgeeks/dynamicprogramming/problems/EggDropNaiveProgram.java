package geeksforgeeks.dynamicprogramming.problems;

public class EggDropNaiveProgram {
	public static void main(String srgs[]) {
		int n = 2, k = 300;
		System.out.println(eggDrop(n, k));
	}

	static int eggDrop(int n, int k) {
		if (k == 1 || k == 0)
			return k;
		if (n == 1)
			return k;
		int min = Integer.MAX_VALUE;
		int i, res;
		for (i = 1; i <= k; i++) {
			res = Integer.max(eggDrop(n - 1, i - 1), eggDrop(n, k - i));
			if (res < min)
				min = res;
		}
		return min + 1;
	}

}
