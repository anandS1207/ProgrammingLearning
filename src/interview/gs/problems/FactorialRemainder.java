package interview.gs.problems;

import java.util.Scanner;

public class FactorialRemainder {
	public static void main(String args[]) {
		int[] abc = new int[100001];
		abc[0] = abc[1] = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 2; i <= n; i++) {
			if (i < 10) {
				int div = i;
				int rem = (i - 1) % div;
				for (int j = 1; j < i - 1; j++) {
					rem = ((rem % div) * (j % div)) % div;
				}
				abc[i] = rem;
			} else {
				if (isPrime(i))
					abc[i] = i - 1;
				else
					abc[i] = 0;
			}
		}
		int count = 0;
		for (int i = 1; i <= n; i++)
			if (i - 1 == abc[i])
				count++;
		System.out.println(count);
	}

	public static boolean isPrime(int n) {
		boolean prime = true;
		for (int i = 0; i * i <= n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}