package Searching;

import java.util.HashMap;

public class ComparisionCountinEachDirectionUsingLS {

	public static void main(String[] args) {

		int arr[] = new int[7];
		arr[0] = 7;
		arr[1] = 31;
		arr[2] = 48;
		arr[3] = 36;
		arr[4] = 71;
		arr[5] = 3;
		arr[6] = 5;
		int query[] = new int[3];
		query[0] = 36;
		query[1] = 3;
		query[2] = 48;
	}

	public static void countComparision(int arr[], int n, int query[], int m) {
		HashMap<Integer, Integer> result = new HashMap<>();
		for (int i = 0; i < n; i++)
			result.put(arr[i], i);

		for (int i : query) {
			Integer leftCount = result.get(query[i]) + 1;
			Integer rightCount = n - leftCount;	
		}
	}

	class Pair<A, B> {

		A first;
		B second;

		public Pair(A first, B second) {
			this.first = first;
			this.second = second;
		}
	}
}
