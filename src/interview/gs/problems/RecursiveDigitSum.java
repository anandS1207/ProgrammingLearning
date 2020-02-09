package interview.gs.problems;

import java.util.Scanner;

public class RecursiveDigitSum {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String n = str.split(" ")[0];
		int k = Integer.parseInt(str.split(" ")[1]);
		System.out.println(getResult(n, k));
	}

	public static int getResult(String n, int k) {
		int result = 0;
		String str = "";
		for (int i = 0; i < k; i++) {
			str += n;
		}
		for (int i = 0; i < str.length() ; i++) {
			result = addTwoDigits(result, Integer.parseInt(str.charAt(i) + ""));
			System.out.println(result);
		}
		return result;
	}

	public static int addTwoDigits(int a, int b) {
		int result = a + b;
		if (result >= 10) {
			result = addTwoDigits(result % 10, result / 10);
		}
		return result;
	}
}
