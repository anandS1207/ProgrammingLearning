package hackerearth.algorithms.searching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EasySumSetProblem {
	public static void main(String srgs[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Set<Integer> A = new HashSet<Integer>();
		int a_min = Integer.MAX_VALUE;
		int a_max = Integer.MIN_VALUE;
		int temp;
		for (int i = 0; i < a; i++) {
			temp = s.nextInt();
			if (temp > a_max)
				a_max = temp;
			if (temp < a_min)
				a_min = temp;
			A.add(temp);
		}
		int c = s.nextInt();
		Set<Integer> C = new HashSet<Integer>();
		int c_min = Integer.MAX_VALUE;
		int c_max = Integer.MIN_VALUE;
		for (int i = 0; i < c; i++) {
			temp = s.nextInt();
			if (temp > c_max)
				c_max = temp;
			if (temp < c_min)
				c_min = temp;
			C.add(temp);
		}
		int b_min = c_min - a_min;
		int b_max = c_max - a_max;
		for (int i = b_min; i <= b_max; i++) {
			boolean isContain = true;
			for (int j : A) {
				if (!C.contains(i + j)) {
					isContain = false;
					break;
				}
			}
			if (isContain) {
				System.out.print(i + " ");
			}
		}
	}
}
