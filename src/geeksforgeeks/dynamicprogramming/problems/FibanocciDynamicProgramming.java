package geeksforgeeks.dynamicprogramming.problems;

public class FibanocciDynamicProgramming {
	//Overlappping Subproblems Property in Dynamic Programming
	static final int MAX = 100;
	static final int NIL = -1;
	static int lookup[] = new int[MAX];

	public static void initialize() {
		for (int i = 0; i < MAX; i++)
			lookup[i] = NIL;
	}

	public static int fib(int n) {
		if (lookup[n] == NIL) {
			if (n <= 1)
				lookup[n] = n;
			else
				lookup[n] = fib(n - 1) + fib(n - 2);
		}
		return lookup[n];
	}

	public static void main(String[] args) {
		initialize();
		System.out.println(fib(34));
	}

}
