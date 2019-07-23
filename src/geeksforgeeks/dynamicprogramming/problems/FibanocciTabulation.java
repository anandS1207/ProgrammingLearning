package geeksforgeeks.dynamicprogramming.problems;

public class FibanocciTabulation {
	//
	public static int fib(int n) {
		int fibnu[] = new int[n + 1];
		fibnu[0] = 0;
		fibnu[1] = 1;
		for (int i = 2; i <= n; i++) {
			fibnu[i] = fibnu[i - 1] + fibnu[i - 2];
		}
		return fibnu[n];
	}

	public static void main(String str[]) {
		System.out.println(fib(6));
	}

}
