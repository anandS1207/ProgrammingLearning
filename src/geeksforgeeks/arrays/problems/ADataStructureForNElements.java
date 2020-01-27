package geeksforgeeks.arrays.problems;

import java.util.Scanner;

public class ADataStructureForNElements {
	/*
	 * The complexity of the operations should be as follows: Insertion of an
	 * element – O(1) Deletion of an element – O(1) Finding an element – O(1)
	 */

	public static void main(String args[]) {
		int ar[] = new int[Integer.MAX_VALUE / 10];
		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		if (ar[temp] == 1) {
			System.out.println("it's already there");
		} else
			ar[temp] = 1;
		System.out.println("presenet ");
	}
}
