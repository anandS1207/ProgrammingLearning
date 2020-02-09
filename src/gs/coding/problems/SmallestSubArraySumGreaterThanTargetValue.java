package gs.coding.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SmallestSubArraySumGreaterThanTargetValue {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int maxPossible = 0;
		int length = 0;
		int calculatedResult = 0;
		int leasPossible = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			maxPossible += a[i];
			leasPossible = leasPossible < a[i] ? leasPossible : a[i];
		}
		int target = s.nextInt();
		if (maxPossible < target || leasPossible > target) {
			System.out.println("no possible scenario");
		} else {
			Arrays.sort(a);
			int start = a.length - 1;
			while (calculatedResult <= target) {
				calculatedResult += a[start];
				start--;
				length++;
			}
			System.out.println(length);
		}
	}
}
