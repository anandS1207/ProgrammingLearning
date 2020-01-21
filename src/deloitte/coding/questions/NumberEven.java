package deloitte.coding.questions;

import java.util.Scanner;

public class NumberEven {
	public static void main(String sfds[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		System.out.println(getResult(t));
	}

	public static int getResult(int n) {
		int result = 0;
		int original = n;
		int nod = 0;
		while (original > 0) {
			original /= 10;
			nod++;
		}
		nod -= 1;
		while (nod >= 0) {
			int divident = (int) Math.pow(10, nod);
			// System.out.println(divident);
			result = result * 10 + (n / divident) % 10;
			nod -= 2;
		}
		return result;
	}
}
